
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register User</title>
</head>
<body>

<center>
    <p>

    <center>
        <%
            String error = (String) request.getAttribute("error");
            if (error != null) {
                response.getWriter().write(error);
            }
        %>
    </center>
    </p>
    <form action="/register" method="post">
        Email<input name="email" type="email"/> <br>
        Password <input name="password" type="password"/> <br>
        Repeat password <input name="rpassword" type="password"/> <br>
        <button type="submit">Register</button>
    </form>
</center>

</body>
</html>
