<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Event</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width:20%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 50%;
  }
}
</style>
</head>
<body>
<form action="eventInsertControl" method="post" style="border:1px solid #ccc">
  <div class="container">
    <h1>Event In City</h1>
    <p>Enter Your Event.</p>
    <hr>

    <label for="email"><b>Enter Your Event Name</b></label>
    <input type="text" placeholder="Enter Your event Name" name="event_name" required>

    <label for="psw"><b>Enter Your Department Name</b></label>
    <input type="text" placeholder="Enter Event Department" name="event_department" required>

    <label for="psw-repeat"><b>Enter Event Start Time</b></label>
    <input type="text" placeholder="Enter event Start Time" name="start_time" required>
	
    <label for="psw-repeat"><b>Enter Event End Time</b></label>
    <input type="text" placeholder="Enter event End Time" name="end_time" required>
	
    <label for="psw-repeat"><b>Enter Event Date</b></label>
    <input type="text" placeholder="Enter Event Date" name="event_date" required>
    
	
    <label for="psw-repeat"><b>Enter Event Description</b></label>
    <input type="text" placeholder="Enter Event Description" name="event_description" required>


    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">submit</button>
    </div>
  </div>
</form>
</body>
</html>