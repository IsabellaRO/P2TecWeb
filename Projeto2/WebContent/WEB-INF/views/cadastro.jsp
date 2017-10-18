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
    <br><br><br>
    <h1>Sign Up</h1>
     <form action="efetuaRegistro" method="post" enctype="multipart/form-data">
		<center><input type="file" name="file" id="foto" class="inputFile"/><label for="file"></label> </center><br> 
		<center><input type="text" class="form-control" placeholder="Name " id="nome"></center><br>
		<center><input type="text" class="form-control" placeholder="Username " id="username"></center><br>
		<center><input type="text" class="form-control" placeholder="E-mail " id="email"></center><br>
		<center><input type="password" class="form-control" placeholder="Password" id="senha"></center><br>
		<center><input type="password" class="form-control" placeholder="Confirm Password" id="senha"></center><br>
		<center><input type="text" class="form-control" placeholder="Bio " id="bio"></center><br>
		<center><input type="text" class="form-control" placeholder="Link da sua playlist pública do Spotify " id="playlist"></center><br>
		<center><input type="submit" class="log-btn" value="Cadastrar" ></center>
     
    </form></div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script  src="js/index.js"></script>

</body>
</html>
