<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Password</title>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>
<form>

		<h4 class="text-warning text-center pt-5">Please Enter Your Designated Email</h4>



		<label> <input type="text" class="input" name="email"
			placeholder="EMAIL" />
			<div class="line-box">

				<div class="line"></div>

			</div>

		</label> 

		<button type="submit">submit</button>

	</form>
	
<c:if test="${EnterIF condition}">
A new generated password has been sent to your registered Email-ID.

<button type="button" onclick="">To Login</button>
</c:if>
</body>
</html>