package project.web.servlet;

import project.domain.User;
import project.service.UserService;
import project.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description: ${todo}
 * @Author: Wang Shiyu
 * @Date: 2020/7/29/22:24
 */
@WebServlet("/UserListServlet")
public class UserListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.调用UserService完成查询
        UserService userService = new UserServiceImpl();
        List<User> users = userService.findAll();
        // 2.将list存入request域
        request.setAttribute("users", users);
        // 3.转发到list.jsp
        request.getRequestDispatcher("/jsp/list.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
