 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>loginform</title>
<link rel="stylesheet" href="<c:url value="/resourcess/CssStyles/register.css" />">


<link rel="stylesheet" href=
"https://use.fontawesome.com/releases/v5.15.3/css/all.css"
        integrity=
"sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk"
        crossorigin="anonymous">
 
 
 
<script src = "<c:url value="/resourcess/jsfiles/captcha.js"/>"></script>
 
</head>
<body background="<c:url value="/resourcess/images/pigeon1.jpg"/>" onload="generate()">
<form action="./authenticate" >
<img src="<c:url value="/resourcess/images/flower.jpg"/>" height="30" width="40">

<div class="mainbar">

<div class="loginform">
<center>
<table border="2" align="center">
<tr>
<td><label>Username</label> <input type="text" name="username" placeholder=" Enter Username" required  oncopy='return false'></td>
</tr>
<br> <br>
<tr>
<td><label>Password</label> &nbsp;<input type="text" name="password" placeholder="Enter password"></td>
</tr>


<tr>

 
    
    <input type="submit" value="Narsi">
           
 
    

</td>


    




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