<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello JSP and Servlet!</h1>
        <form action="helloServlet" method="post">
            Введите Ваше имя: <input type="text" name="yourName" size="20">
            <input type="submit" value="Call Servlet" />
        </form>
    </body>
</html>
