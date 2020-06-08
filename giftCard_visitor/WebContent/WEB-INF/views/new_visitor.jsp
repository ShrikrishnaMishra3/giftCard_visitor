<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org./TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>New Visitor</title>
</head>
<body>
	<div align="center">
		<h2>New Visitor</h2>
		<h3>
			<a href="bill">Bill Details</a>
		</h3>
		<form:form action="save" method="post" modelAttribute="visitorNew">
			<table border="0" cellpadding="5">
				
				<tr>
					<td>Name:<input name="name" type="text"></td>
					<td><form:input name="name"  type="text"  /></td>
				</tr>
				<tr>
					<td>Email:<input name="email" type="text"></td>
					<td><form:input name="email"  type="text" /></td>
				</tr>
				<tr>
					<td colspan="2"><a href="bill"><input type="submit" value="Enter" /></a></td>
				</tr>
				
			</table>
			
		</form:form>
	</div>
</body>
</html>