<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
<link rel="stylesheet" href="/AETS/css/style.css">
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
</head>
<body>
	<form action="registerController.html">

		<div class="forHeading">Registration Page</div>

		<c:if test="${(error != 'success') && (error != null)}">
			<p>
				<mark style="color: white; background-color: red;">${error}</mark>
			</p>
		</c:if>

		<label> <input type="text" class="input" name="empId"
			placeholder="Enter Your Employee ID" required />

			<div class="line-box">

				<div class="line"></div>

			</div>

		</label> <label> <input type="text" class="input" name="fname"
			placeholder="Enter Your First Name" required />

			<div class="line-box">

				<div class="line"></div>

			</div>

		</label> <label> <input type="text" class="input" name="lname"
			placeholder="Enter Your Last Name" required />

			<div class="line-box">

				<div class="line"></div>

			</div>

		</label> <label> <input type="email" class="input" name="email"
			placeholder="Enter Your Office Email" required />
			<div class="line-box">

				<div class="line"></div>

			</div> <label> <input type="text" class="input" name="phone"
				placeholder="Enter Your Phone Number"
				pattern="^(\+91[\-\s]?)?[0]?(91)?[789]\d{9}$" required />
				<div class="line-box">

					<div class="line"></div>

				</div>

		</label> <label> <select name="location" id="location"
				style="padding: 10px; background: #C5E1A5; border: none;">

					<option value="Koyambedu" selected>Koyambedu</option>
					<option value="Chrompet">Chrompet</option>
					<option value="Velachery">Velachery</option>
					<option value="T Nagar">T Nagar</option>
					<option value="Guindy">Guindy</option>
					<option value="Porur">Porur</option>
					<option value="Thandalam">Thandalam</option>
					<option value="Poonamallee">Poonamallee</option>
					<option value="5">Other</option>
			</select>
		</label> <label> <input type="text" class="input" name="txtOther"
				id="txtOther" disabled="disabled" placeholder="Enter Location" />
				<div class="line-box">

					<div class="line"></div>

				</div>

		</label> <label> <input type="password" class="input" name="password"
				id="password" placeholder="Set Passowrd" required />

				<div class="line-box">

					<div class="line"></div>

				</div>

		</label> <label> <input type="password" class="input" name="confirm"
				id="confirm" placeholder="Confirm Password" required />

				<div class="line-box">

					<div class="line"></div>

				</div> <span id="message"></span>
		</label>

			<button type="submit" onclick="return Validate()">submit</button>
	</form>

	<script type="text/javascript">
		$(function() {

			$("#location").change(function() {

				if ($(this).val() == 5) {

					$("#txtOther").removeAttr("disabled");

					$("#txtOther").focus();

				} else {

					$("#txtOther").attr("disabled", "disabled");

				}

			});

		});
		$('#password, #confirm').on('keyup', function() {
			if ($('#password').val() == $('#confirm').val()) {
				$('#message').html('Matching').css('color', 'green');
			} else
				$('#message').html('Not Matching').css('color', 'red');
		});
	</script>
</body>
</html>