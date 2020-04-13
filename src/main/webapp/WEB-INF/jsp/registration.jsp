<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registratoin</title>
</head>
<body>
	<h1>This is the registration page</h1>
	
	<form:form modelAttribute="registration" action="registration" method="POST">
		Name: <form:input path="name"/> <input type="submit" value="add" />
	</form:form>
	
</body>
</html>