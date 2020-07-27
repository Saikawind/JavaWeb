package Chapter02.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @Description: 测试登录获取参数
 * @Author: Wang Shiyu
 * @Date: 2020/7/22/21:49
 */
@WebServlet("/RequestDemo")
public class RequestDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post获取请求参数

        // 设置流的编码格式
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //根据参数名称获取参数值
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");

        // 获取打印输出流
        PrintWriter out = resp.getWriter();
        out.println("<p>用户名：" + username + "</p><br>");
        out.println("<p>密码：" + password + "</p><br>");
        out.println("<p>爱好：" + Arrays.toString(hobbies) + "</p>");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get获取请求参数

    }
}
