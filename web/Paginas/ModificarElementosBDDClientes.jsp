<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "Modulos.Herramientas.VariablesGlobales" %>
<%@ page import = "Modulos.Herramientas.GestionBDDs"%>
<%@ page import = "Modulos.DataSistema.Productos"%>
<%@ page import = "java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta http-equiv="Expires" content="0">
 	<meta http-equiv="Last-Modified" content="0">
 	<meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
  	<meta http-equiv="Pragma" content="no-cache">
	<link rel="stylesheet"  href="Estilos.css"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Ingreso Productos</title>
</head>
<body >
  
<figure>
	<img src="Imagenes/LogoPaginaPrincipal.png" alt ="LogoPaginaPrincipal" width=100% height="120">
</figure>
    
<nav id="navegacionPrincipal" class="navbar  bg-dark navbar-dark">
    
    <div id="header1">
        
        <ul class="navegacionotraspaginas">
            <li class="nav-item">
                <a class="navbar-brand" >MODIFICAR</a>
            </li>
            <li>
                <a class="nav-link" href="GestionConsultaProductos.jsp">Regresar</a>     
            </li>
        </ul>
    </div>  
</nav>
<br>

<section>
    <%
        String cambiarElemento= request.getParameter("txtNombreProductoVentanaEmergente");
        
        String buscarElemento = (String) request.getSession().getAttribute("clientebusqueda");
    %>
    
    <%
        if(cambiarElemento==null){
                    
    %>
    <form action="" class="was-validated" id="TablaPrincipalIngresoClientes" method="POST">
        <div class="form-group">
            <h5>El nombre que se cambiará corresponde al NIT: <% out.print(buscarElemento);%></h5>
            <br>
            Ingrese Nombre Completo de cliente: <input pattern="[A-Za-Z]" class="form-control" maxlength="30" name="txtNombreProductoVentanaEmergente" id ="txtNombreProductoVentanaEmergente" required>
      		<div class="valid-feedback">Valido.</div>
      		<div class="invalid-feedback">complete el campo.</div>
        </div>	
        <div class="form-group">
            <button type="submit" class="btn btn-outline-success" name="Boton_Entrar_Principal" id="Boton_Entrar_Principal" >Modificar</button>
        </div>
    </form>
            
    <%
    }else{
    %>
         <%
           VariablesGlobales.gestion.modificarregistro(VariablesGlobales.BDDCLIENTES,buscarElemento, cambiarElemento);
           request.getSession().getAttribute("");
           
        %>
        <center> <div class="container" id="contenedorIngresoProductos">
            <div class="alert alert-success" role="alert">
                El producto fue modificado con exito. <a href="GestionConsultaClientes.jsp" class="alert-link">Volver Listado Productos</a>. 
            </div>
        </div></center>
        
    <%
        }
        %>
</section>   
    
</body>
</html>