package Chapter03.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Description: 学习Session的使用
 * @Author: Wang Shiyu
 * @Date: 2020/7/24/21:52
 */
@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 使用Session共享数据
        // 获取Session
        HttpSession session = req.getSession();
        // 存储数据
        session.setAttribute("msg", "Hello session!");
    }
}
