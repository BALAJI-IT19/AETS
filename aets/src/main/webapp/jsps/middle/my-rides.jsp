<section class="rgt-cont centr">
	<table>
		<tr>
			<th>Start</th>
			<th>End</th>
			<th>Status</th>
			<th>Time</th>
			<th>Queue Date</th>
			<th>Driver ID</th>
		</tr>
		<c:forEach var="list" items="${ridesList}">
		hello ${ridesList}
			<tr>
				<td><c:if test="${list.getStart() eq null ">
				Null
				</c:if></td>
				<td>${list.end}</td>
				<td>${list.getStatus()}</td>
				<td>${list.getTime()}</td>
				<td>${list.getDate()}</td>
				<td>${list.getDriveId()}</td>
			</tr>
		</c:forEach>
	</table>

</section>