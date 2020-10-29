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
    <a class="navbar-brand" href="#">Navegacion Consulta de Productos</a>
    <div id="header1">
        <ul class="navegacionotraspaginas">
            <li>
                <a class="nav-link" href="PaginaPrincipal.jsp">Regresar</a>     
            </li>
        </ul>
    </div>  
</nav>
<br>

<section>
        <%
        if((request.getSession().getAttribute("namesession")!=null)&&( request.getSession().getAttribute("clientebusqueda"))==null){
        %>
        
    
        <%
           String eliminarproducto = (String) request.getSession().getAttribute("namesession");
           VariablesGlobales.gestion.eliminarRegistro(VariablesGlobales.BDDProductos, eliminarproducto);
           request.getSession().getAttribute("");
         
             
        %>
        <center> <div class="container" id="contenedorIngresoProductos">
            <div class="alert alert-success" role="alert">
                El producto fue eliminado con exito. <a href="GestionConsultaProductos.jsp" class="alert-link">Volver Listado Productos</a>. 
            </div>
        </div></center>
        
        <%
          }else{
        %>
        <%
           String eliminacliente = (String) request.getSession().getAttribute("clientebusqueda");
           VariablesGlobales.gestion.eliminarRegistro(VariablesGlobales.BDDCLIENTES, eliminacliente);
           request.getSession().getAttribute("");
        %>
        <center> <div class="container" id="contenedorIngresoProductos">
            <div class="alert alert-success" role="alert">
                El Cliente fue eliminado con exito. <a href="GestionConsultaClientes.jsp" class="alert-link">Volver Listado de Clientes</a>. 
            </div>
        </div></center>
        
        <%
        }
        %>
</section>   
    
</body>
</html>