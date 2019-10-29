<%@ page import="Services.Elems" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 此系竹
  Date: 2019/10/23
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
</head>
<body>
<%
    Elems e = (Elems) pageContext.getRequest().getAttribute("elem");
%>
欢迎<%=e.getName()%>
<%=e.toString()%>
</body>
</html>
