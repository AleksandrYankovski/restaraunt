<%--
  Created by IntelliJ IDEA.
  User: aleksandr
  Date: 22.7.18
  Time: 13.44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" errorPage="/pages/error/error.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<html>
<head>
    <title>Регистрация</title>
</head>
<body>
<form align="center" name="registrationForm" method="POST" action="controller">
    <input type="hidden" name="command" value="registration"/>
    Введите ваши данные:<br/>
    <table align="center">
        <tr>
            <td>Имя:</td>
            <td><input type="text" name="firstname" value="" size="30"/></td>
        </tr>
        <tr>
            <td>Фамилия:</td>
            <td><input type="text" name="lastname" value="" size="30"/></td>
        </tr>
        <tr>
            <td>Логин:</td>
            <td><input type="text" name="login" value="" size="30"/></td>
        </tr>
        <tr>
            <td>Пароль:</td>
            <td><input type="text" name="password" value="" size="30"/></td>
        </tr>
    </table>
    ${operationMessage}
    ${errorUserExsists} <br/>
    <input type="submit" value="Зарегистрировать"/>
    <a href="controller?command=back">Вернуться обратно</a>

</body>
</html>