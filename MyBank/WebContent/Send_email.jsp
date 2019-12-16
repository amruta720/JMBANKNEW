<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,javax.mail.*" %>
        <%@ page import="javax.mail.internet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String result;
final String to="sppucomp1234@gmail.com";
final String from="amrutak7200@gmail.com";
final String pass="ammu@1234";
final String subject="This is the subject";
 String host="smtp.gmail.com";
 Properties props=new Properties();
 
 props.put("mail.smtp.host",host);
 props.put("mail.transport.protocol","smtp");
 props.put("mail.smtp.auth","true");
 props.put("mail.smtp.starttls.enable","true");
 props.put("mail.user",from);
 props.put("mail.password",pass);
 props.put("mail.port","25");
 
 Session mailSession=Session.getInstance(props,new javax.mail.Authenticator(){
	 @Override
	 protected PasswordAuthentication getPasswordAuthentication(){
		 return new PasswordAuthentication(from,pass);
	 }
	 
 });
 
 try{
	 MimeMessage message=new MimeMessage(mailSession);
	 message.setFrom(new InternetAddress(from));
	  message.addRecipient(Message.RecipientType.TO,
              new InternetAddress(to));

	 message.setText("hii");
	 Transport.send(message);
     result = "Sent message successfully....";
  } catch (MessagingException mex) {
     mex.printStackTrace();
     result = "Error: unable to send message....";
  
 }
 
 
 
%>

</body>
</html>