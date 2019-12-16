+<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="date" class="java.util.Date"/>
	<h2 align="center"> Application Form </h2>
	<form action="CreateAccountController" method = "post" enctype="multipart/form-data">
		NAME  
		<select>
			<option value="Mr">Mr</option>
			<option value="Mrs">Mrs</option>
			<option value="Ms">Ms</option>
		</select>
		<input type="text" name="FirstName"  >
		<input type="text" name="MiddleName"  >
		<input type="text" name="LastName"  >
		<br>
		
		FATHER'S NAME/GUARDIAN'S NAME    
		<select>
			<option value="Mr">Mr</option>
			<option value="Mrs">Mrs</option>
			<option value="Ms">Ms</option>
		</select>
		<input type="text" name="FatherFirstName" value="First Name" >
		<input type="text" name="FatherMiddleName" value="Middle Name" >
		<input type="text" name="FatherLastName" value="Last Name" >
		<br>
		
		DATE OF BIRTH
		<!-- <fmt:formatDate value="${date}" type="date"  pattern="dd-mm-yyyy" />-->  
		<br>
		
		GENDER  
		<input type="radio" name="Gender" value="Male">Male
		<input type="radio" name="Gender" value="Female">Female
		<input type="radio" name="Gender" value="Other">Other
		<br>
		
		NATIONALITY
		<input type="text" value="Indian" name="Nationality">		
		<br>
		
		AADHAR CARD NUMBER
		<input type="text" name="AadharNo" >
		<br>

		PAN CARD NUMBER
		<input type="text" name="PanCardNo" >
		<br>
		
		LOCAL ADDRESS
		<input type="text" name="LocalAddress">
		<br>

		PERMANENT ADDRESS
		<input type="text" name="PermanentAddress">
		<br>

		STATE
		<select name="State">
			<option value="Maharashtra">Maharashtra</option>
			<option value="Mrs"></option>
			<option value="Ms">Ms</option>
		</select>	
			
		<br>

		CITY
		<select  name="City">
			<option value="Pune">Pune</option>
			<option value="Mumbai">Mumbai</option>
			<option value="Ms">Ms</option>
		</select>		
		<br>

		PINCODE
		<input type="text" name="Pincode" >
		<br>

		MOBILE NUMBER
		<input type="text" name="MobileNo" >
		<br>

		EMAIL ID
		<input type="text" name="EmailId" >
		<br>
			
		<center>UPLOAD DOCUMENTS</center>
		<br>
		
		AADHAR CARD
		<input type = "file" name = "AadharCardDocument" size = "50" />
         <br />
		<br><br>
		PAN CARD
		<input type = "file" name = "PanCardDocument" size = "50" />
		<br><br>
		
		ELECTRICITY BILL
		<input type = "file" name = "ElectricityBillDocument" size = "50" />
		<br><br>
		
		INCOME CERTIFICATE
		<input type = "file" name = "IncomeCertificateDocument" size = "50" />
		<br><br>
		PASSPORT SIZE PHOTO
		<input type = "file" name = "PassportPhoto" size = "50" />
		<br><br>
		
		SIGNATURE
		<input type = "file" name = "Signature" size = "50" />
		<br><br>
			
		<input type="submit" value="Submit">
	</form>
	
</body>
</html>