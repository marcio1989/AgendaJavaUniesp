<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form id="form-agenda" action="AgendaServlet" method="Post">
	Login: <input type="text" name="login" id="login"/><br><br>
	Senha: <input type="password" name="senha" id="senha"/><br><br>
	<input type="submit" value="Entrar" id="entrar"/>
	</form>
</body>
</html>