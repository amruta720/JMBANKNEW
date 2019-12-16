<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>

</head>
<style>
table{
border:2px solid black;
border-radius:30px;
padding:100px;

}
</style>
<body style="background-color:powderblue;">
<form action="LogInController" method="post">
<h1 align="center"><b>JM ROAD BANK</b></h1>
<table align="center" style="width:40%" style="height:100%">


<tr>
<td><label for="username"><b>Username</b></label></td>
</tr>
<tr>
<td><input type="text" name="UserName"><br></td>
</tr>
<tr>
<td><a href="Forget_UserName.jsp"><font size="2">Forget UserName?</font></a></td>
</tr>
<tr>
<td><label for="password"><b>Password</b></label></td>
</tr>
<tr>
<td><input type="text" name="Password"><br></td>
</tr>
<tr>
<td><a href="Forget_Password.jsp"><font size="2">Forget Password?</font></a></td>
</tr>
 <tr>
      <td><div class="g-recaptcha" data-sitekey="6LcCzMcUAAAAAGWPOBZvhRg1owWnGXJ3n0E_ghQN"></div></td>
   </tr>   
<tr> 
<td><input type="submit" value="Login" name="Login"></td>
</tr>
<td>New User?<a href="CreateAccount.jsp"><font size="2">Create Account</font></a></td>
</tr>
</table>
</form>
</body>
</html>