<%--
  Created by IntelliJ IDEA.
  User: 83477
  Date: 2020/7/28
  Time: 2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>if标签</title>
</head>
<body>
<%--
    c:if标签
        1.属性
            *test必须为属性，接受boolean表达式
            *如果表达式为true，则显示if标签体内容，如果为false，则不显示标签体内容
--%>

<c:if test="true">我是true</c:if>

</body>
</html>
