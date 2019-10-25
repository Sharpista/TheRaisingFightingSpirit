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
				<s:form class="p-4" action="cadastrar.action" method="post">
					<div class="form-group">
						<s:textfield name="nome" type="text" class="form-control" placeholder="NOME" />
						<s:textfield name="cpf" type="text" class="form-control" placeholder="CPF" />
						<s:textfield name= "rg" type="text" class="form-control" placeholder="RG" />
						<s:textfield name= "dataDeNascimento" type="date" class="form-control"></s:textfield>
						<s:radio name="correntista" list="listOpc" id="correntista"></s:radio>
						<s:radio name="sexo" list="listaDeGeneros" id="sexo"></s:radio>
						<s:checkboxlist name="diasDeVisita" list="listaDeDias" id="diasDeVisitas"></s:checkboxlist>
						<s:checkboxlist name="seguro" list="listaDeSeguros" id="seguro"></s:checkboxlist>
					</div>
					
					<div class="text-center mt-4">
						<s:submit cssClass=" pulse btn purple darken-4 text-white " method="cadastrar"/>
					</div>
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>