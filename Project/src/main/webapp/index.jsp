<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
<title>Home</title>
</head>
<body>


<form class="box login">
	<fieldset class="boxBody">
	  <label>Имя пользователя</label>
	  <input type="text" tabindex="1" placeholder="username" required/>
	  <label><a href="#" class="rLink" tabindex="5">Забыли пароль?</a>Пароль</label>
	  <input type="password" tabindex="2" required placeholder="password"/>
	</fieldset>
	<footer>
	  <label><input type="checkbox" tabindex="3">Остаться в системе</label>
	  <input type="submit" class="btnLogin" value="Login" tabindex="4">
	</footer>
</form>

</body>
</html>
