package Chapter03.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 会话测试
 * @Author: Wang Shiyu
 * @Date: 2020/7/23/23:28
 */
@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建Cookie对象
        Cookie c = new Cookie("msg", "hello");
        // 发送Cookie
        resp.addCookie(c);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
