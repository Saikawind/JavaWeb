package Chapter03.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Description: 登录Servlet类
 * @Author: Wang Shiyu
 * @Date: 2020/7/26/18:22
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置request编码
        req.setCharacterEncoding("utf-8");

        // 获取参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 获取Session
        HttpSession session = req.getSession();

        // 判断用户名和密码
        if ("wsy".equals(username) && "123".equals(password)) {
            // 登陆成功
            // 存储用户信息
            session.setAttribute("user", username);
            // 重定向到success.jsp
            resp.sendRedirect(req.getContextPath() + "/jsp/success.jsp");
        } else {
            // 登录失败
            // 存储信息到request
            req.setAttribute("login_error", "用户名或密码错误");
            // 转发到登录页面
            req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
