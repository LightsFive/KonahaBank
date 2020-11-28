<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Creation</title>
</head>
<body>
<h1>Customer Registration</h1>
<form name="createcustomerform" action="CustomerController" method="post">
<table>
<tr>
	<tr><td> Name:       </td><td><input type="text" name="customerName" /></td></tr>
	<tr><td> Age:        </td><td><input type="number" name="age" /></td></tr>
	<tr><td> EmailId:</td><td><input type="email" name="emailId" /></td></tr>
	
	<tr><td>Address:</td><td><input type="text" name="address" /></td></tr>
	<tr><td>City:</td><td><input type="text" name="city" /></td></tr>
	<tr><td>State:</td><td><input type="text" name="state" /></td></tr>
	<tr><td>MobileNumber:</td><td><input type="number" name="mobileNumber" /></td></tr>
	<tr><td><button>Create</button></td></tr> 
</tr>
</table>
</form>
</body>
</html>