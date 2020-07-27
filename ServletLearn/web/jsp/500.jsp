<%--
Created by IntelliJ IDEA.
User: 83477
Date: 2020/7/26
Time: 21:36
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>服务器正忙</h1>
<%
    String message = exception.getMessage();
    out.print(message);
%>
</body>
</html>
