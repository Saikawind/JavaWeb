package project.web.servlet;

import org.apache.commons.beanutils.BeanUtils;
import project.domain.User;
import project.service.UserService;
import project.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @Description: ${todo}
 * @Author: Wang Shiyu
 * @Date: 2020/7/30/16:47
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码
        request.setCharacterEncoding("utf-8");
        // 获取数据
        Map<String, String[]> map = request.getParameterMap();
        HttpSession session = request.getSession();
        // 封装User对象
        User user = new User();
        try {
            BeanUtils.populate(user, map);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        // 调用Service查询
        UserService service = new UserServiceImpl();
        User loginUser = service.login(user);
        // 判断是否登陆成功
        if (loginUser != null) {
            // 登录成功
            // 将用户存入session
            session.setAttribute("user", loginUser);
            // 跳转页面
            response.sendRedirect(request.getContextPath() + "/jsp/index.jsp");
        } else {
            // 登录失败
            // 提示信息
            request.setAttribute("login_msg", "用户名或密码错误！");
            // 跳转登录界面
            request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
