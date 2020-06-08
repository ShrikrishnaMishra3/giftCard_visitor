<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org./TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>>Bill Details</title>
</head>
<body>
	<div align="center">
		<h1>Bill Details</h1>
		<h3>
			<a href="new">Back</a>
		</h3>
		<table border="1" padding="5">
			<tr>
				<th>ID</th>
				<th>BillTitle</th>
				<th>Category</th>
				<th>Amount</th>
				<th>DateOfEntry</th>
				<th>Paid</th>
				<th>Unpaid</th>
				

			</tr>
			<c:forEach items="${listbill}" var="bills">
				<tr>
					<td>${bills.id}</td>

					<td>${bills.billTitle}</td>

					<td>${bills.category}</td>

					<td>${bills.amount}</td>

					<td>${bills.dateOfEntry}</td>
					<td>${bills.paid}</td>
					<td>${bills.unpaid}</td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>