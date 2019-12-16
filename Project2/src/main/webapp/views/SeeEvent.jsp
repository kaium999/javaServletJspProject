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
<h1>This is event See Page!!!</h1></br></br>

<c:forEach var="event" items="${eventShow}">
<div> <h1>Event Name:<c:out value="${event.event_name}"></c:out> </h1></div>
<div><p>Event for Department Name:<c:out value="${event.department_name}"></c:out> </p></div>
<div><p>Event Start Time:<c:out value="${event.start_time}"></c:out> </p></div>
<div><p>Event End Time<c:out value="${event.end_time}"></c:out> </p></div>
<div><p>Event Description<c:out value="${event.event_description}"></c:out> </p></div>
<div><p>Event Date:<c:out value="${event.event_date}"></c:out> </p></div>
<div><p>Upload Time:<c:out value="${event.datetime}"></c:out> </p></div>
</c:forEach>
</body>
</html>