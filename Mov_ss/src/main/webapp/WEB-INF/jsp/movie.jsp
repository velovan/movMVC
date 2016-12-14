<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie Management</title>
</head>
<body>
<h1>Movie Data</h1>
<form:form action="movie.do" method="POST" commandName="movie">
	<table>
		<tr>
			<td>Movie ID</td>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td>Title</td>
			<td><form:input path="title" /></td>
		</tr>
		<tr>
			<td>Director</td>
			<td><form:input path="director" /></td>
		</tr>

		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>Title</th>
	<th>Director</th>
	<c:forEach items="${movieList}" var="movie">
		<tr>
			<td>${movie.id}</td>
			<td>${movie.title}</td>
			<td>${movie.director}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>