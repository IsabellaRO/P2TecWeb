<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Registro de usuário</h2>
<form action="efetuaRegistro" method="post" enctype="multipart/form-data">
 Nome: <input type="text" name="nome" /> <br/>
 Email: <input type="text" name="email" /> <br/>
 Username: <input type="text" name="username" /> <br/>
 Senha: <input type="password" name="senha" /> <br/>
 Foto: <input type="file" name="foto_perfil"/> <br/><br/>
 Bio: <input type="text" name="bio" /> <br/>
 <input type="submit" value="Registrar" />
</form>
</body>
</html>