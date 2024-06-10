<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../css/cadastro.css" />
</head>
<body>
	<div class="container">
		<div class="content">
			<div id="cadastro">
				<form class="form" method="post" action="../cadastro">

					<h1>Cadastro</h1>

					<p>
						<label for="email">Email</label><input id="email" name="email"
							required="required" type="text"
							placeholder="contato@contato.com.br" />
					</p>

					<p>
						<label for="nome">Nome</label><input id="nome" name="nome"
							required="required" type="text" placeholder="nome" />
					</p>

					<p>
						<label for="cpf">CPF</label><input id="cpf" name="cpf"
							required="required" type="text" placeholder="cpf" />
					</p>


					<p>
						<label for="login">Login</label><input id="login" name="login"
							required="required" type="text" placeholder="sua preferência" />
					</p>

					<p>
						<label for="senha">Senha</label> <input id="senha" name="senha"
							required="required" type="password" placeholder="senha" />
					</p>

					<p class="botao-verde">

						<a class="botao-verde" href="">
							<button class="botao-verde" type="submit">Cadastrar</button>
						</a>

					</p>
				</form>
			</div>
		</div>
	</div>
</body>
</html>