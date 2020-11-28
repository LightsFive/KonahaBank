<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> welcome to login.jsp</h1>
<form name="loginform" action="KonahaBankController">
<table>
<tr>
<td> UserName: </td><td><input type ="text"/></td></tr>
<tr>
<td>Passoword: </td><td><input type="password"/></td>
</tr>

<tr>
<td> <button> save</button></td>


</table>

</form>
<br><br>
<a href="createcustomer.jsp">New User</a>
</body>
</html>