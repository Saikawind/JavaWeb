package Chapter02.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description: 文件下载
 * @Author: Wang Shiyu
 * @Date: 2020/7/23/18:35
 */
public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取请求参数名，文件名称
        String filename = req.getParameter("filename");
        //使用字节输入流加载文件进内存
        //找到文件服务器路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/images/" + filename);
        //用字节流关联
        FileInputStream fileInputStream = new FileInputStream(realPath);

        //设置response的响应头
        //获取文件的mime类型
        String mimetype = servletContext.getMimeType(filename);
        //设置响应头类型，content-type
        resp.setHeader("content-type", mimetype);
        //设置响应头打开方式：content-disposition
        resp.setHeader("content-disposition", "attachment;filename=" + filename);

        //将输入流的数据写出到输出流中
        ServletOutputStream sos = resp.getOutputStream();
        byte[] buff = new byte[1024 * 8];
        int len = 0;
        while ((len = fileInputStream.read(buff)) != -1) {
            sos.write(buff, 0, len);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
