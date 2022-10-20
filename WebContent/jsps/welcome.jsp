<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<form action="welcomeController.html">
		Start <select name="start">
			<option value="${emp.getLocation()}" selected>${emp.getLocation()}</option>
		</select><br> End <select name="start">
			<option value="${emp.getLocation()}" selected>${emp.getLocation()}</option>
		</select> <br> Time<input type="number" name="hr" min="0" max="12">
		<input type="number" name="min" min="0" max="60"> <select
			name="session">
			<option value="1">AM</option>
			<option value="2">PM</option>
		</select><br>
		<button>Book my cab</button>
	</form>

</body>
</html>