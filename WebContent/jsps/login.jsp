<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>

<link rel="stylesheet" href="../css/style.css">
</head>
<body>
	<br>
	<br>
	<h2>Automatic Employee Taxi Sharing</h2>
	<hr>
	<br>
	<br>
	<div class="login">
		<c:if test="${(error != 'success') && (error != null)}">
			<p>
				<mark style="color: white; background-color: red;">${error} </mark>
			</p>
		</c:if>
		<form action="">

		



		<label> <input type="email" class="input" name="email"
			placeholder="EMAIL" />
			<div class="line-box">

				<div class="line"></div>

			</div>

		</label> 
		 <label> <input type="password" class="input" name="password"
			placeholder="PASSWORD" />

			<div class="line-box">

				<div class="line"></div>

			</div>

		</label> 

		<button type="submit">submit</button>

	</form>
	</div>
	<br>
	<center>
		<div id="outer">
			<a href="RegisterController.html">SignUp</a> <a
				href="ForgotPasswordController.html">Forgot Password?</a>
		</div>
	</center>
	<script>
		$(window).bind("pageshow", function() {
			var form = $('form');
			// let the browser natively reset defaults
			form[0].reset();
		});
	</script>
</body>
</html>
