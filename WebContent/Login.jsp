<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#botao {
	text-align: center
}

.botaoLogar {
	width: 350px;
	text-align: center;
	padding: 15px 20px;
	border: 1px solid #eee;
	border-radius: 6px;
	background-color: #FCC302;
	font-size: 18px;
}

.center-align {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}
</style>
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
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<s:actionerror />
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
	<div class="container">
		<div class="card mt-5 purple darken-4"></div>
		<h5 class="card-header text-center purple darken-4 text-white">
			<a href="" class="text-decoration-none text white"><i
				class="fas fa-arrow-left float-left"></i></a>LOGIN
		</h5>
		<div class="card-body white center">
			<s:form class = "form-signin" cssClas = "form-horizontal" action="login.action" method = "post">
					<div cssClass="input-field col s6 text-center mt4 ">
						<s:textfield placeholder="Nome" name="usuario" type="text" />
						<label for="nome"></label>
					</div>
					<div cssClass="input-field col s6 text-center mt4  ">
						<s:textfield placeholder="Senha" id="senha" type="password" name = "senha" />
						<label for="senha"></label>
					</div>
				<div id=botao class="row">
					<div class="center-align">
						<s:submit
							cssClass="waves-effect waves-light deep-purple accent-3 text-white btn "
							method="execute" key="label.login"></s:submit>
					</div>
				</div>
			</s:form>
		</div>
	</div>
</body>
</html>