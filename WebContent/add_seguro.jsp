<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
<title>Adicionar Seguro</title>
</head>
<body>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
	<div class="container">
		<div class="card mt-5 bg-white">

			<h5 class="card-header text-center  purple darken-4 text-white">
				<a href="index.jsp" class="text-decoration-none text-white"><i
					class="fas fa-arrow-left float-left"></i></a> CADASTRO DE SEGUROS
			</h5>
			<div class="card-body">
				<form class="p-4"
					action="add_seguro.action"
					method="post">
					<div class="form-group row ">
						<label for="tipo"
							class="col-sm-1 col-form-label col-form-label-sm">TIPO:</label>
						<div>
							<s:textfield class="form-control form-control-sm ml-5"
								name="tipo" placeholder="identificacao"/>
						</div>
					</div>
					<div class="form-group row">
						<label for="valor"
							class=" col-sm-1 col-form-label col-form-label-sm">Valor:</label>
						<div>
							<s:textfield type="number" class="form-control form-control-sm ml-5"
								name="valor" placeholder="valor"/>
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