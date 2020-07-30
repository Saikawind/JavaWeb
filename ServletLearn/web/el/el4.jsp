<%--
  Created by IntelliJ IDEA.
  User: 83477
  Date: 2020/7/27
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el4隐式对象</title>
</head>
<body>
<h3>动态获取虚拟目录</h3>
${pageContext.request.contextPath}

<%
    response.sendRedirect(request.getContextPath() + "");

%>
</body>
</html>
