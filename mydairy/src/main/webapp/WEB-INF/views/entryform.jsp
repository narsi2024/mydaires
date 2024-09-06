 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>loginform</title>
<link rel="stylesheet" href="<c:url value="/resourcess/CssStyles/register.css" />">
</head>
<body background="<c:url value="/resourcess/images/pigeon1.jpg"/>">
<form action="./addentry">
<img src="<c:url value="/resourcess/images/flower.jpg"/>" height="30" width="40">

<div class="mainbar">

<div class="loginform">
<center>
<table border="2">

<tr>
<td><label>Date</label> <input type="text" name="entrydate" placeholder="please enter date"></td>
</tr>
<br> <br>
<tr>
<td><label>description</label> <textarea id="w3review" name="description" rows="4" cols="50"></textarea></td>
</tr>
<tr>
<td><input type="hidden" name="userid"  value="${user.id}"></td>

</tr>
<tr>
<td> <input type="submit" value="login"></td>
</tr>

</table>
</center>



</div>

</div>
</form>
</body>
</html>