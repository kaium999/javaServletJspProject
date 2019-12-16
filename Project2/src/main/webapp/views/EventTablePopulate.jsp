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
		<center>
		<h1>Event In City</h1>
        <h2>
        	<a href="EventCreatePage">Add New Event</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="BackHomePage">Home Page</a>
        	
        </h2>
	</center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Books</h2></caption>
            <tr>
            	<th>ID</th>
                <th>Event Name</th>
                <th>Department Name</th>
                <th>Start Time</th>
                <th>End Time</th>
                <th>Event Date</th>
                <th>Event Description</th>
                <th>User Name</th>
                <th>User Email</th>
            </tr>
            <c:forEach var="event" items="${eventShow}">
                <tr>
                	<td><c:out value="${event.id}" /></td>
                    <td><c:out value="${event.event_name}" /></td>
                    <td><c:out value="${event.department_name}" /></td>
                    <td><c:out value="${event.start_time}" /></td>
                    <td><c:out value="${event.end_time}" /></td>
                     <td><c:out value="${event.event_date}" /></td>
                    <td><c:out value="${event.event_description}" /></td>
                    <td><c:out value="${event.user.user_name}" /> </td>
                    <td><c:out value="${event.user.email}" /> </td>
                    <td>
                    	<a href="edit?id=<c:out value='${event.id}' />">Edit</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="deleteEvent?id=<c:out value='${event.id}' />">Delete</a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>