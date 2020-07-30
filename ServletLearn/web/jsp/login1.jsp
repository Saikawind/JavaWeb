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
    <title>登录界面</title>
    <script>
        window.onload = function () {
            document.getElementById("img").onclick = function () {
                this.src = ""
            }
        }
    </script>
    <style>
        div {
            color: deepskyblue;
        }
    </style>
</head>
<body>
<form action="../LoginServlet" name="user" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <%--        <tr>--%>
        <%--            <td>验证码</td>--%>
        <%--            <td><input type="text" name="checkCode"></td>--%>
        <%--        </tr>--%>
        <%--        <tr>--%>
        <%--            <td colspan="2"><img src=""></td>--%>
        <%--        </tr>--%>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
    <div><%=request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error")%>
    </div>
</form>
</body>
</html>
