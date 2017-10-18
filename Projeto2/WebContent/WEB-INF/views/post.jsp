<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  <title>Create a Post</title>
  
  <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>
<meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="css/style.css">
	
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/fontselect-default.css" />
    <script src="js/jquery.fontselect.js"></script>
    <script>
      $(function(){
        $('#font').fontselect();
      });
    </script>

  
</head>

<body>

    <div class="login-form">
    <h1>Share Something</h1>
     <form action="criaQuote" method="post" enctype="multipart/form-data">
		<center><textarea style='color:black' class="form-control" placeholder="Write here... " id="post"></textarea></center><br>
		<center>
		<select id="soflow">
		<option value="" disabled selected>Select Color</option>
		<option>Black
		<option style='color: #93BFFF'>Light Blue
		<option style='color: #0036FF'>Dark Blue
		<option style='color: #FF0000'>Red
		<option style='color: #FFA200'>Orange
		<option style='color: #91DE70'>Light Green
		<option style='color: #287E02'>Dark Green
		<option style='color: #A550F1'>Purple
		<option style='color: #FF69DB'>Pink
		</select>
		</center><br>
		<center><input id="font" type="text" /></center><br>
		<center><input type="submit" class="log-btn" value="Postar" ></center>
     
    </form></div>


</body>
</html>