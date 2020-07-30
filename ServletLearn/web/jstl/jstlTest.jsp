<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Chapter04.domain.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 83477
  Date: 2020/7/28
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<%
    List<User> list = new ArrayList<>();
    list.add(new User("wsy", 20, new Date()));
    list.add(new User("zll", 19, new Date()));
    list.add(new User("test", 100, new Date()));

    request.setAttribute("list", list);
%>
<table border="1" width="500" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>生日</th>
    </tr>
    <%--数据行--%>
    <c:forEach items="${list}" var="user" varStatus="s">
        <%--若为偶数行则改变表格颜色--%>
        <c:if test="${s.count % 2 == 0}">
            <tr bgcolor="#5f9ea0">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.bitStr}</td>
            </tr>
        </c:if>
        <%--若为奇数行则和上面同理--%>
        <c:if test="${s.count % 2 != 0}">
            <tr bgcolor="#00bfff">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.bitStr}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
