<%--
  Created by IntelliJ IDEA.
  User: 83477
  Date: 2020/7/27
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中的数据</title>
</head>
<body>
<%
    request.setAttribute("name", "王诗愉");
    session.setAttribute("age", "20");
    session.setAttribute("name", "宗俐利");
%>
<h3>el获取值</h3>
${requestScope.name}
${sessionScope.age}
<%--若没有值则什么都不显示--%>
${requestScope.haha}<br>
<h3>直接用键名获取name值</h3>
${name}
<h3>从session中获取name值</h3>
${sessionScope.name}
</body>
</html>
