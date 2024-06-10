<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/paciente.css" />
<title>Paciente</title>
</head>
<body>
	<div class="container">
		<form action="../Paciente" method="post">
			<h1>Agendar consulta</h1>
			<p>
				<label for="inputState" class="form-label">Escolha o seu
					doutor(a) e sua área de atuação</label> <select id="inputState"
					name="doutor" class="form-select">
					<option selected>Escolha...</option>
					<option value="Dr. Alexandre Barreto - Cardiologia">Dr.
						Alexandre Barreto - Cardiologia</option>
					<option value="Dr. Pedro Silveira - Neurologia">Dr. Pedro
						Silveira - Neurologia</option>
					<option value="Dra. Gabriela Alves - Psiquiatria">Dra.
						Gabriela Alves - Psiquiatria</option>
				</select>
			</p>

			<p class="op">
				<label for="data">Data da consulta</label> <input id="data"
					name="dataConsulta" required="required" type="date"
					placeholder="ex. 10/02/2024" />
			</p>

			<p class="botao-verde">
				<input class="botao-verde " type="submit" value="Agendar" />
			</p>
			</form>
	</div>
	
</body>
</html>