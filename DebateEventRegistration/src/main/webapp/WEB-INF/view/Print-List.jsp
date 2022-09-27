<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Event Database</title>

</head>

<body>

	<div class="container">

		<h1>Students Directory</h1>
		<hr>

		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>Student ID</th>
					<th>Name</th>
					<th>Department</th>
					<th>Country</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${Students}" var="tempStudent">
					<tr>
						<td><c:out value="${tempStudent.id}" /></td>
						<td><c:out value="${tempStudent.firstName}" /> <c:out
								value="${tempStudent.lastName}" /></td>
						<td><c:out value="${tempStudent.department}" /></td>
						<td><c:out value="${tempStudent.country}" /></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<hr>
		<a href="/DebateEventRegistration/student/list">Back to Students
			List</a>

		<script type="text/javascript" nonce="">
			// <![CDATA[
			document.body.onload = function() {
				document.body.offsetHeight;
				window.print()
			};
			// ]]>
		</script>

	</div>

</body>
</html>



