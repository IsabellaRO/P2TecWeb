<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Login form</title>
  
  
  <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>

    <style type="text/css">
    	<%@include file="css/style.css"%>
    </style>

  
</head>

<body>
  <div class="login-form" align="center">
     <h1>Login</h1>
    <form action="efetuaLogin" method="post" enctype="multipart/form-data">   
	     <div class="form-group ">
	       <input type="text" class="form-control" placeholder="Username " id="UserName">
	       <i class="fa fa-user"></i>
	     </div>
	     <div class="form-group log-status">
	       <input type="password" class="form-control" placeholder="Password" id="Passwod">
	       <i class="fa fa-lock"></i>
	     </div>
	      <a class="link" href="registro">Ainda não é cadastrado?</a>
	     <input type="submit" class="log-btn" value="Login">
	 </form>
     
    
   </div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script  src="js/index.js"></script>

</body>
</html>
