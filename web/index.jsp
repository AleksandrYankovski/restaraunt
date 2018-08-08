<%--
  Created by IntelliJ IDEA.
  User: aleksandr
  Date: 4.7.18
  Time: 23.45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
</head>
<body>
<form name="loginForm" method="POST" action="controller" align="center">
    <input type="hidden" name="command" value="login"/>
    Введите ваш логин и пароль: <br/>
    <table align="center">
        <tr>
            <td>Логин:</td>
            <td><input type="text" name="login" size="30"/></td>
        </tr>
        <tr>
            <td>Пароль:</td>
            <td><input type="password" name="password" size="30"/></td>
        </tr>
    </table>
    ${errorLoginOrPassword} <br/>
    <input type="submit" value="Войти"/>
    <a href="controller?command=gotoregistration">Регистрация</a>
</form>

</body>
</html>
