 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First SPRING MVC APPLICATION</title>
<link rel="stylesheet" href="<c:url value="/resourcess/CssStyles/register.css" />">
</head>
<body background= <c:url value="/resourcess/images/pigeon1.jpg"/> class="back">
<form action="./saveuser">


<div class="mainbar">

<div class="loginform">
<center>
<table border="2" align="center">

<tr>
<td><label>Username</label> <input type="text" name="username"  placeholder="Username"  oncopy='return false'  oncut='return false' onpaste='myfunction()' ></td>
</tr>
<br> <br>
<tr>
<td><label>Password</label> &nbsp;<input type="text" name="password" placeholder="Enter password"  oncopy='return false' onpaste='myfunction' oncut='return false' ></td>
</tr>
<tr>
<td> <p id="demo"></p>
<tr>
<td> <input type="submit" value="Register"></td>
</tr>
<tr>
	<td>click here to <a href="./authenticate">Login</a></td>
</tr>
</table>
</center>




</div>

</div>
</form>
</body>
</html>