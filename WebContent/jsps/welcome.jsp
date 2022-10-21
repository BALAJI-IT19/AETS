<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
</head>
<body>
<c:if test="${(error != 'success') && (error != null)}">
			<p>
				<mark style="color: white; background-color: red;">${error}</mark>
			</p>
		</c:if>
	<c:if test="${(error eq 'success') }">
			<p>
				<mark style="color: white; background-color: green;">${error}</mark>
			</p>
		</c:if>	
	<form action="welcomeController.html">
		Start 
		<select name="start" id="start">
			<option value="${emp.getLocation()}" selected>${emp.getLocation()}</option>
			<option value="DLF">DLF</option>
			<option value="sother">Other</option>
		</select><br>
		
		<input type="text" class="input" name="startTxtOther"
				id="startTxtOther" disabled="disabled" placeholder="Enter Location" />
		<br> 
		
		End <select name="end" id="end">
			<option value="${emp.getLocation()}" >${emp.getLocation()}</option>
			<option value="DLF" selected>DLF</option>
			<option value="eother">Others</option>
		</select><br>
		<input type="text" class="input" name="endTxtOther"
				id="endTxtOther" disabled="disabled" placeholder="Enter Location" />
				
		<br>  Time<input type="number" name="hr" min="0" max="12">
		<input type="number" name="min" min="0" max="60"> <select
			name="session">
			<option value="1">AM</option>
			<option value="2">PM</option>
		</select><br>
		<input type="hidden" name="empid" value="${emp.getEmpId()}">
		<button>Book my cab</button>
	</form>

<script type="text/javascript">
		$(function() {

			$("#start").change(function() {

				if ($(this).val() == "sother") {

					$("#startTxtOther").removeAttr("disabled");

					$("#startTxtOther").focus();

				} else {

					$("#startTxtOther").attr("disabled", "disabled");

				}

			});

		});
		
		
		$(function() {

			$("#end").change(function() {

				if ($(this).val() == "eother") {

					$("#endTxtOther").removeAttr("disabled");

					$("#endTxtOther").focus();

				} else {

					$("#endTxtOther").attr("disabled", "disabled");

				}

			});

		});
		</script>
</body>
</html>