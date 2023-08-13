package ua.ishop.kataula.controller;

import ua.ishop.kataula.model.User;
import ua.ishop.kataula.service.UserService;
import ua.ishop.kataula.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/users")
public class AllUserServlet extends HttpServlet {
    private static final UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> allUsers = userService.getUsers();
        req.setAttribute("allUsers", allUsers);
        req.getRequestDispatcher("users.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
