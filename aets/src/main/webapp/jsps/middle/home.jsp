<section class="rgt-cont centr">
	<div class="frm">
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
		<form action="welcome-controller.html" method="post">

			<p>
				<label>Start</label><select name="start" id="start">
					<option value="${sessionScope.emp.getLocation()}" selected>${sessionScope.emp.getLocation()}</option>
					<option value="DLF">DLF</option>
					<option value="sother">Other</option>
				</select>
			</p>
			<p>
				<input type="text" class="input" name="startTxtOther"
					id="startTxtOther" disabled="disabled" placeholder="Enter Location" />

			</p>
			<p>
				<label>End</label> <select name="end" id="end"><option
						value="${sessionScope.emp.getLocation()}">${sessionScope.emp.getLocation()}</option>
					<option value="DLF" selected>DLF</option>
					<option value="eother">Others</option>
				</select>
			</p>
			<p>
				<input type="text" class="input" name="endTxtOther" id="endTxtOther"
					disabled="disabled" placeholder="Enter Location" />

			</p>
			<p>
				<label>Time</label><input type="time" name="time" /><br>
			</p>
			<p class="cacn">
				<input type="submit" value="Book my cab" class="s-btn" /> <input
					type="reset" value="Cancel" class="can" />
			</p>

		</form>
	</div>
</section>
