<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/admin.css" />
<title>Insert title here</title>
</head>
<body>
	<h1>Admin</h1>
	<div class="container">
		<div id="cadastro">
			<form class="form" method="post" action="${pageContext.request.contextPath}/AdmCadastroPaciente">
			<h2>Cadastro de paciente</h2>
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

			<form class="form" method="post" action="${pageContext.request.contextPath}/AdmCadastroMedico">
			<h2>Cadastro de médico</h2>
				<p>
					<label for="crm">CRM</label><input id="crm" name="crm"
						required="required" type="text" placeholder="crm" />
				</p>

				<p>
					<label for="nome">Nome</label><input id="nome" name="nome"
						required="required" type="text" placeholder="nome" />
				</p>

				<p class="op">
					<label for="inputState" class="form-label">Escolha o seu
						doutor(a)  e sua área de atuação</label> <select id="inputState"
						name="doutor" class="form-select">
						<option selected>Escolha...</option>
						<option value="Dr. Alexandre Barreto - Cardiologia">Dr.
							Alexandre Barreto - Cardiologia</option>
						<option value="Dr. Pedro Silveira - Neurologia">Dr. Pedro
							Silveira - Neurologia</option>
						<option value="Dra. Gabriela Alves - Psiquiatria">Dra.
							Gabriela Alves - Psiquiatria</option>
					</select>
				<p class="botao-verde">

					<a class="botao-verde" href="">
						<button class="botao-verde" type="submit">Cadastrar</button>
					</a>

				</p>
			</form>
		</div>
	</div>
</body>
</html>