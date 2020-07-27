package Chapter02.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 请求转发测试类
 * @Author: Wang Shiyu
 * @Date: 2020/7/22/23:36
 */
@WebServlet("/RequestDispatcherTest")
public class RequestDispatcherTest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        resp.setContentType("text/html;charset=utf-8");

        //获取数据
        Object msg = req.getAttribute("msg");
        System.out.println(msg);
        System.out.println("请求转发测试类访问成功");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
