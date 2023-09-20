package ua.ishop.controller;

import org.apache.log4j.Logger;
import ua.ishop.factory.UserServiceFactory;
import ua.ishop.model.User;
import ua.ishop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin/users")
public class AllUserServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(AllUserServlet.class);
    private static final UserService userService = UserServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("allUsers", userService.getUsers());
        req.getRequestDispatcher("/users.jsp").forward(req, resp);
    }

//    @Override
//    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<User> allUsers = userService.getUsers();
//        req.setAttribute("allUsers", allUsers);
//        req.getRequestDispatcher("/users.jsp").forward(req, resp);
//    }
}
