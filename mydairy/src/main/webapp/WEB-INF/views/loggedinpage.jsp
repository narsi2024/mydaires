 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First SPRING MVC APPLICATION</title>
<style type="text/css">
.tables
{

	margin-top:60px;
	width: 95%;
	height: 25%;
}
.btn
{
width: 75px;
height: 45px;
background-color: blue;
border-radius: 6px;
float: right;
margin-right: 35px;
margin-top: 15px;
}
.wlc
{
margin-top: 5px;
}
</style>
<link rel="stylesheet" href="<c:url value="/resourcess/CssStyles/register.css" />">
</head>
<body background="<c:url value="/resourcess/images/pigeon1.jpg"/>">
<form action="./">
<img src="<c:url value="/resourcess/images/flower.jpg"/>" height="60" width="60">

<div class="mainbar">

<div class="loginform">
<br>
<h4>&nbsp;&nbsp;&nbsp;Welcome  <span style="color: blue">${user.username}</span></h4>


<a href="./saveentry"> <button type="button" class="btn">ENTRY</button></a>
<br>

<table border="2" class="tables" >
<tr>

<th>Data</th>
<th colspan="3">Actions</th>
</tr>
<tr>
<c:if test="${entri.size()==0}">
<h1>no entries found</h1>
</c:if>

<c:forEach items="${entri}" var="e">
<td>${e.entrydate}</td>


<td><a href="./viewentry?id=${e.id}">view</a></td>
<td><a href="#">update</a></td>
<td><a href="#">delete</a></td>
</tr>
</c:forEach>
</table>








</div>

</div>
</form>
</body>
</html>