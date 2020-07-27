package Chapter03.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 在服务器中的 Servlet判断是否有一个名为lastTime的Cookie
 * 有，则不是第一次访问，则显示上一次的访问时间
 * 没有，则是第一次访问，则显示欢迎首次访问界面
 * @Author: Wang Shiyu
 * @Date: 2020/7/24/12:13
 */
@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 设置响应消息体的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");
        // 获取所有Cookie
        Cookie[] cookies = request.getCookies();
        boolean flag = false;

        // 遍历cookies
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                // 获取Cookie的名称
                String name = cookie.getName();
                // 判断名称是否是lastTIme，是，则不是第一次访问
                if ("lastTime".equals(name)) {
                    // 判断是否是首次访问
                    flag = true;
                    // 获取上次存储的时间Cookie值
                    String time = cookie.getValue();
                    response.getWriter().write("<h1>欢迎回来，您上次访问的时间是：" + time + "<h1>");

                    // 获取当前的时间，重新设置Cookie的值，重新发送Cookie
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月dd日HH:mm:ss");
                    String nowTime = sdf.format(date);
                    cookie = new Cookie("lastTime", nowTime);
                    response.addCookie(cookie);

                    // 设置Cookie的存活时间，一个月
                    cookie.setMaxAge(60 * 60 * 24);
                    // 获取Cookie的value，时间
                    time = cookie.getValue();
                    response.getWriter().write("<h1>欢迎回来，您这次访问的时间是：" + time + "<h1>");
                }
            }
        }

        if (cookies == null || cookies.length == 0 || !flag) {

            // 获取当前的时间，并设置Cookie的值
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月dd日HH:mm:ss");
            String nowTime = sdf.format(date);
            Cookie cookie = new Cookie("lastTime", nowTime);
            response.addCookie(cookie);

            // 设置Cookie的存活时间，一个月
            cookie.setMaxAge(60 * 60 * 24);

            // 获取Cookie的value，时间
            response.addCookie(cookie);
            String time = cookie.getValue();
            response.getWriter().write("<h1>欢迎首次访问：" + time + "<h1>");

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
