<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<%--
  *@ Jsp Welcome-layout.jsp
  *@ description This page is the welcome layout.
  *@ version 1.0
  *@ author BALAJI R.
  *@ since 1.0
  *@ since 22/10/2022
  --%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en"
	xmlns:og="http://ogp.me/ns#">
<head>
<title>Welcome</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/style.css" />
</head>
<body>
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<div class="main cntr">
		<div class="cntr1">
			<tiles:insertAttribute name="left"></tiles:insertAttribute>
			<section class="rgt-cont centr">
				<tiles:insertAttribute name="middle"></tiles:insertAttribute>
			</section>
		</div>
	</div>
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</body>
</html>