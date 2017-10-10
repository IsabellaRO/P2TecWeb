<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Sign Up</title>
  
  
  <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>
<meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
    <div class="login-form">
    <h1>Sign Up</h1>
     <div class="form-group ">
     <form action="efetuaRegistro" method="post">
           <center> <input type="file" name="file" id="foto" class="inputFile"/>
    <label for="file"></label> </center>    
</div>
     <div class="form-group ">
       <input type="text" class="form-control" placeholder="Name " id="nome">
       <i class="fa fa-user"></i>
     </div>
     <div class="form-group ">
       <input type="text" class="form-control" placeholder="Username " id="username">
       <i class="fa fa-user"></i>
     </div>
     <div class="form-group ">
       <input type="text" class="form-control" placeholder="E-mail " id="email">
       <i class="fa fa-envelope"></i>
     </div>

     <div class="form-group log-status">
       <input type="password" class="form-control" placeholder="Password" id="senha">
       <i class="fa fa-lock"></i>
     </div>
     <div class="form-group log-status">
       <input type="password" class="form-control" placeholder="Confirm Password" id="senha">
       <i class="fa fa-lock"></i>
     </div>
     <div class="form-group ">
       <input type="text" class="form-control" placeholder="Bio " id="bio">
       <i class="fa fa-user"></i>
     </div>
     <input type="button" class="log-btn" value="Cadastrar" >
     
    </form></div>
   </div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script  src="js/index.js"></script>

</body>
</html>
