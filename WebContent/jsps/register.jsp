<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
<link rel="stylesheet" href="../css/style.css">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
</head>
<body >
	<form>

		<div class="forHeading">Registration Page</div>


		<label> <input type="text" class="input" name="emp_id"
			placeholder="Enter Your Employee ID" />

			<div class="line-box">

				<div class="line"></div>

			</div>

		</label>
		
		<label> <input type="text" class="input" name="fname"
			placeholder="Enter Your First Name" />

			<div class="line-box">

				<div class="line"></div>

			</div>

		</label>
		
		<label> <input type="text" class="input" name="lname"
			placeholder="Enter Your Last Name" />

			<div class="line-box">

				<div class="line"></div>

			</div>

		</label>
		
		
		<label> <input type="text" class="input" name="email"
			placeholder="Enter Your Office Email" />
			<div class="line-box">

				<div class="line"></div>

			</div>
		
		<label> <input type="text" class="input" name="phno"
			placeholder="Enter Your Phone Number" pattern ="^(\+91[\-\s]?)?[0]?(91)?[789]\d{9}$"/>
			<div class="line-box">

				<div class="line"></div>

			</div>	

		</label> 
		<label> 
		<select name="drop" id="drop" style="padding: 10px; background:#C5E1A5; border:none;">
		
		<option value="Koyambedu">Koyambedu</option>
		<option value="Chrompet">Chrompet</option>
		<option value="Velachery">Velachery</option>
		<option value="T Nagar">T Nagar</option>
		<option value="Guindy">Guindy</option>
		<option value="Porur">Porur</option>
		<option value="Thandalam">Thandalam</option>
		<option value="Poonamallee">Poonamallee</option>
		<option value="5">Other</option>
		</select>
		</label>
		<label>
		 <input type="text" class="input" name="txtOther"  id="txtOther" disabled="disabled"
			placeholder="Enter Location" />
			<div class="line-box">

				<div class="line"></div>

			</div>	

		</label> 
		
		
		
		 <label> <input type="password" class="input" name="password"
			placeholder="Set Passowrd" />

			<div class="line-box">

				<div class="line"></div>

			</div>

		</label> <label> <input type="password" class="input" name="confirm"
			placeholder="Confirm Password" />

			<div class="line-box">

				<div class="line"></div>

			</div>

		</label>

		<button type="submit">submit</button>

	</form>
	
	<script type="text/javascript">

    $(function () {

        $("#drop").change(function () {

            if ($(this).val() == 5) {

                $("#txtOther").removeAttr("disabled");

                $("#txtOther").focus();

            } else {

                $("#txtOther").attr("disabled", "disabled");

            }

        });

    });

</script>
</body>
</html>