<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 83477
  Date: 2020/7/27
  Time: 0:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${3 > 4}
<hr>
<h2>算术运算符</h2>
${3 + 4}<br>
${3 / 4}<br>
${3 div 4}<br>
${3 % 4}<br>
${3 mod 4}<br>
<hr>
<h2>比较运算符</h2>
${3 == 4}<br>
<hr>
<h2>逻辑运算符</h2>
${3 > 4 && 3 < 4}<br>
${3 > 4 and 3 < 4}<br>
<hr>
<h2>empty运算符</h2>
<%
    String str = "wsy";
    request.setAttribute("str", str);
    List<Object> list = new ArrayList<>();
    request.setAttribute("list", list);
%>
${not empty str}<br>
${empty list}
</body>
</html>
