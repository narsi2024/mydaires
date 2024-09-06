<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>viewentry</title>
<link rel="stylesheet" href="<c:url value="/resourcess/CssStyles/register.css" />">
</head>
<body background="<c:url value="/resourcess/images/pigeon1.jpg"/>">

<img src="<c:url value="/resourcess/images/flower.jpg"/>" height="30" width="40">

<div class="mainbar">

<div class="loginform">
<center>


<table border="2">

<tr>
<td><label>Date</label>${entry.entrydate}</td>
</tr>
<br> <br>
<tr>
<td><label>description</label>: ${entry.description}</td>
</tr>
<tr>
<td><input type="hidden" name="userid"  value="${user.id}"></td>

</tr>
<tr>
<td> <input type="submit" value=""></td>
</tr>

</table>
</center>



</div>

</div>

</body>
</html>