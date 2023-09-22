package ua.ishop.controller;


import ua.ishop.factory.UserServiceFactory;
import ua.ishop.model.User;
import ua.ishop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/update")
public class UpdateUserServlet extends HttpServlet {

    private static final UserService userService = UserServiceFactory.getUserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       long id = Long.parseLong(req.getParameter("userId"));
       User user = userService.getUserById(id);
       req.setAttribute("user", user);
       req.getRequestDispatcher("/update_user.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String  id = req.getParameter("id");
        String  email = req.getParameter("email");
        String  passwordNotEncrypted = req.getParameter("passwordNotEncoded");

        User user = new User(Long.parseLong(id), email, passwordNotEncrypted);
        userService.updateUser(user);
        resp.sendRedirect("/admin/users");
    }
}
