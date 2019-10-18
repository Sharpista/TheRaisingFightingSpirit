<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Adicionar Segurado</title>
</head>
<body>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
	<div class="container">
		<div class="card mt-5 bg-white">

			<h5 class="card-header text-center  purple darken-4 text-white">
				<a href="index.jsp" class="text-decoration-none text-white"><i
					class="fas fa-arrow-left float-left"></i></a> CADASTRO DE SEGURADO
			</h5>
			<div class="card-body">
				<form class="p-4" action="add_segurado.action" method="post">
					<div class="form-group row ">
						<label for="nome"
							class="col-sm-1 col-form-label col-form-label-sm">Nome:</label>
						<div>
							<s:textfield class="form-control form-control-sm ml-5"
								name="nome" placeholder="nome" />
						</div>
					</div>
					<div class="form-group row">
						<label for="cpf"
							class=" col-sm-1 col-form-label col-form-label-sm">CPF:</label>
						<div>
							<s:textfield type="text"
								class="form-control form-control-sm ml-5" name="cpf"
								placeholder="cpf" />
						</div>
					</div>

					<div class="form-group row">
						<label for="rg" class=" col-sm-1 col-form-label col-form-label-sm">RG:</label>
						<div>
							<s:textfield type="text"
								class="form-control form-control-sm ml-5" name="rg"
								placeholder="rg" />
						</div>
					</div>
					
					<div class="text-center mt-4">
						<button class=" pulse btn purple darken-4 ">CADASTRAR</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>