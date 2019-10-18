<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">


#botao {
	text-align: center
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
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<nav>
    <div class="nav-wrapper purple darken-4">
      <a href="#" class="brand-logo center text-white center">Bem Vindo</a>
     	<ul class="right hide-on-med-and-down">
        <li><a class="waves-effect waves-light btn text-white deep-purple accent-1">Logout</a></li>
      </ul>
     
    </div>
  </nav>
	<div class="container center-align">
		<div class="row center text-center mt-5">
			<br> <a
				class="waves-effect waves-light btn-large  purple darken-4 text-white center-align" href = "add_segurado.jsp"
				style="width: 350px; height: 50px" method = "execute"><i
				class="material-icons right text-white">people</i>CADASTRAR SEGURADO</a>
		</div>
		<div class="row center text-center mt-4">
			<a
				class="waves-effect waves-light btn-large  purple darken-4 text-white center-align"
				style="width: 350px; height: 50px"><i
				class="material-icons right text-white">view_list</i>LISTAR
				SEGURADOS</a>
		</div>
		<div class="row center text-center mt-4">
			<a
				class="waves-effect waves-light btn-large  purple darken-4 text-white center-align" href = "add_seguro.jsp"
				style="width: 350px; height: 50px" method = "execute"><i
				class="material-icons right text-white">business_center</i>CADASTRAR
				SEGURO</a>
		</div>

		<div class="row center text-center mt-4">
			<s:a
				href="listar"
				class="waves-effect waves-light btn-large  purple darken-4 text-white center-align"
				style="width: 350px; height: 50px"><i
				class="material-icons right text-white">view_list</i>LISTAR
				SEGUROS</s:a>
		</div>



	</div>
</body>
</html>