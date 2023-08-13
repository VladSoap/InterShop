<%@ page import="java.util.List" %>
<%@ page import="ua.ishop.kataula.model.User" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: kipler
  Date: 06.08.2023
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All users</title>
</head>
<body>
<%
    PrintWriter writer = response.getWriter();
    writer.write("<table border=1>\n" +
            "    <tr>\n" +
            "        <th>Email</th>\n" +
            "        <th>Password</th>\n" +
            "    </tr>");

    List<User> userList = (List<User>) request.getAttribute("allUsers");
    for(User user : userList){
        writer.write("<tr>");
        writer.write("<td>" + user.getEmail() + "</td>");
        writer.write("<td>" + user.getPassword() + "</td>");
        writer.write("</tr>");
    }
%>
</body>
</html>
