<!DOCTYPE html>
<%@page import="Modulos.Herramientas.VariablesGlobales"%>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
 	<meta http-equiv="Expires" content="0">
 	<meta http-equiv="Last-Modified" content="0">
 	<meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
  	<meta http-equiv="Pragma" content="no-cache">
        <link rel="stylesheet" href="Estilos.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Pagina Principal</title>
</head>

<body> 
<section>
<div id="DivPrincipal">
    <header id="CabeceraPaginaPrincipal">
        <figure id="IMGLogoPrincipal">
            <img src="Imagenes/LogoAutoPartes.png" width="260" height="150">
        </figure>
    </header>	
        <div class="container" id="contenedorprincipal" >
            <figure id="IMGLoginPaginaPrincipal">
                <center><img src="Imagenes/Login.png" width="100" height="100"></center>
            </figure>
            <form action="GestionIngresoPrincipal.jsp" class="was-validated" id="TablaPrincipal">
    		<div class="form-group">
                    <center><input pattern="[A-Za-Z]{6}" class="form-control" maxlength="6" name="txtUsuario" id ="txtUsuario" placeholder="Inrese Usuario" required></center>
                    <div class="valid-feedback">Valido.</div>
                    <div class="invalid-feedback">complete el campo.</div>
    		</div>
                <br><br>
                <div class="form-group">
                    <center><input type="password" class="form-control" name="txtContra" id="txtContra" placeholder="Ingrese Contrasenia" required></center>
                    <div class="valid-feedback">Valido.</div>
                    <div class="invalid-feedback">Complete el campo.</div>
   		</div>
                        <br><br>
                <div>
                    <center><button type="submit" class="btn btn-outline-success" name="Boton_Entrar_Principal" id="Boton_Entrar_Principal" >Ingresar</button></center>
                </div> 
            </form>
	</div>
</div>
</section>

</body>
</html>