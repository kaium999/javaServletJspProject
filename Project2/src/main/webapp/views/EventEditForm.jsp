<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is Edit Form</h1>
<form action="updateEvent" method="post">
<table>
<tr>
<th></th>
<td>
<input type="hidden" name="id" value="<c:out value='${event.id}'/>" />
</td>
</tr>
<tr>
<th>Event Name:</th>
<td>
<input type="text" name="name" value="<c:out value='${event.event_name}'/>" />
</td>
</tr>
<tr>
<th>Department Name:</th>
<td>
<input type="text" name="department" value=" ${event.department_name}" />
</td>
</tr>
<tr>
<th>Event Start time:</th>
<td>
<input type="text" name="starttime" value=" ${event.start_time}" />
</td>
</tr>
<tr>
<th>Event End Time:</th>
<td>
<input type="text" name="EndTime" value=" ${event.end_time}" />
</td>
</tr>
<tr>
<th>Event Description:</th>
<td>
<input type="text" name="description" value=" ${event.event_description}" />
</td>
<tr>
<th>Event Date:</th>
<td>
<input type="text" name="date" value=" ${event.event_date}" />
</td>
</tr>



</table>
<input type="submit" value="submit">
</form>
</body>
</html>