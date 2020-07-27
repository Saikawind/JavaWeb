<%--
  Created by IntelliJ IDEA.
  User: 83477
  Date: 2020/7/26
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<h1><%=request.getSession().getAttribute("user")%>, 欢迎 </h1>
</body>
</html>
