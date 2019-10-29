<%@ page import="java.util.List" %>
<%@ page import="Services.Elems" %><%--
  Created by IntelliJ IDEA.
  User: 此系竹
  Date: 2019/10/23
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录</title>
</head>
    <body>
    <form action="loginServlet">
        <input type="text" name="username"/>
        <input type="password" name="password"/>
        <input type="text" name="code"/>
        <input type="submit" value="登录"/>
    </form>
    </body>
</html>
