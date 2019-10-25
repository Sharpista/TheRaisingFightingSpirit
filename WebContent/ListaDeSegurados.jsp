<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
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
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
	<div class="container-fluid">
		<h1 align="center" class="mt-2 text-white purple darken-4">Lista de Seguros
			</h1>

		<div class="row">
			<div class="col-sm-12">
				<table class="table table-bordered text-white">
					<thead class="purple darken-4">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">NOME</th>
							<th scope="col">CPF</th>
							<th scope="col">RG</th>
							<th scope="col">DATA DE NASCIMENTO</th>
							<th scope="col">DATA DE CADASTRO</th>
							<th scope="col">DIAS DE VISITA</th>
							<th scope="col">SEXO</th>
							<th scope="col">CORRENTISTA</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="listaDeSegurados">
							<tr>
								<td class ="text-dark"><s:property value="id"  /></td>
								<td class ="text-dark"><s:property value="nome" /></td>
								<td class ="text-dark"><s:property value="cpf" /></td>
								<td class ="text-dark"><s:property value="rg" /></td>
								<td class ="text-dark"><s:property value="dataDeNascimento" /></td>
								<td class ="text-dark"><s:property value="diasDeVisita" /></td>
								<td class ="text-dark"><s:property value="sexo" /></td>
								<td class ="text-dark"><s:property value="correntista" /></td>
								<s:url action="deleta-seguro" var="del">
									<s:param name="id" value="id"></s:param>
								</s:url>

								

								<td>
									<a href="<s:property value="alt"/>" class="btn-floating btn-small waves-effect waves-light purple darken-4 "><i class="material-icons">edit</i></a>
									<a href="<s:property value="del"/>"class="btn-floating btn-small waves-effect waves-light purple "><i class="material-icons">delete</i></a>
								</td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
			</div>
		</div>
	</div>



</body>
</html>