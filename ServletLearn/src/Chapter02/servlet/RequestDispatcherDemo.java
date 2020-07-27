package Chapter02.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 请求转发的使用
 * @Author: Wang Shiyu
 * @Date: 2020/7/22/23:35
 */
@WebServlet("/RequestDispatcherDemo")
public class RequestDispatcherDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求转发前");
        //存储数据到request域中
        req.setAttribute("msg", "hello");
        //转发到请求转发测试类
        req.getRequestDispatcher("/RequestDispatcherTest").forward(req, resp);
        System.out.println("请求转发后");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
