<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/login.css" />
<title>Entrar</title>
</head>
<body>
	<div>
		<form action="cadastro" method="get">
		
			<h1 class="title">Cadastro</h1>
			
			<div>
				<input type="text" name="nome" placeholder="Nome:">
			</div>
			
			<div>
				<input type="text" name="cpf" placeholder="CPF:">
			</div>
			
			<div>
				<input type="text" name="email" placeholder="Email:">
			</div>
			
			<div>
				<button type="button">Entrar</button>
			</div>
		</form>
	</div>
	<script src="https://use.fontawesome.com/4b6fac3087.js"></script>
</body>
</html>