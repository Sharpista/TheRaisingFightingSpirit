<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css"
	rel="stylesheet">
<script
	src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Lista de Seguros</title>
</head>
<body>
	<nav>
		<div class="nav-wrapper purple darken-4">
			<a href="#" class="brand-logo center text-white center">Bem Vindo</a>
			<ul class="right hide-on-med-and-down">
				<li><a
					class="waves-effect waves-light btn text-white deep-purple accent-1">Logout</a></li>
			</ul>

		</div>
	</nav>
	<table class="responsive-table text-color">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">NOME</th>
				<th scope="col">PREÇO DO SEGURO</th>
				
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">${client.id}</th>
				<td>${client.nome}</td>
				<td>${client.cpf}</td>
				<td>${client.rg}</td>
				<td><a class="btn pulse  deep-purple accent-1 text-white" href="${pageContext.request.contextPath}/seguros/clientServlet?acao=update&id=${client.id}">Editar</a>
  	   <a class="btn pulse purple darken-4 text-white " href="${pageContext.request.contextPath}/seguros/clientServlet?acao=excluir&id=${client.id}">Excluir</a></td>
			</tr>
		</tbody>
	</table>
</body>
</html>