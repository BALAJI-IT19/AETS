<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<tr>
				<td>${list.getStart()}</td>
				<td>${list.getEnd()}</td>
				<td>${list.getStatus()}</td>
				<td>${list.getTime()}</td>
				<td>${list.getDate()}</td>
				<td>${list.getDriverId()}</td>
			</tr>
		</c:forEach>
	</table>

</section>