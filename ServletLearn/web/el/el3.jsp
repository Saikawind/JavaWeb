<%@ page import="Chapter04.domain.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 83477
  Date: 2020/7/27
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取数据</title>
</head>
<body>
<%
    User user = new User();
    user.setName("王诗愉");
    user.setAge(20);
    user.setBirthday(new Date());

    request.setAttribute("u", user);
%>
<h3>el获取对象中的值</h3>
<%--通过对象的属性来获取
    setter 或 getter方法，去掉set或get，再将剩余部分，首字母变为小写
    setName --> Name --> name
--%>
${requestScope.u.name}<br>
${requestScope.u.age}<br>
${u.birthday}<br>
${u.bitStr}<br>
</body>
</html>
