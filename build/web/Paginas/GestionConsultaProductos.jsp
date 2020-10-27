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
<nav id="navegacionPrincipal" class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="#">Navegacion Consulta Clientes</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="PaginaPrincipal.jsp">Regresar</a>
      </li>
    </ul>
  </div>  
</nav>

<section class="section EfectosReporteria">
    <center><table id="TablaProductos"class="table table-hover">
        <thead class="thead-dark">
            <tr>
                <th scope="col">ID </th>
                <th scope="col">Nombre Producto</th>
                <th scope="col">Marca</th>
                <th scope="col">Categoria</th>
                <th scope="col">Precio</th>
            </tr>
        </thead>
        <tbody>
         <%
            //1. Crear una instancia DAO correpondiente a las carreras
            ArrayList<Productos> productos= VariablesGlobales.gestion.getBDDClientes();
            int i=0;
            for( Productos produ: productos){
            //4. Pintar el HTML que correponde a cada carrera
             i++;
         %>
            <tr>
                <th scope="col"><%=i%></th>
                <th scope="col"><%=produ.getProducto()%></th>
                <th scope="col"><%=produ.getMarca()%></th>
                <th scope="col"><%=produ.getCategoria()%></th>
                <th scope="col"><%=produ.getPrecio()%></th>
                
            </tr>
              <% 
               }
              %>              
        </tbody>
    </table></center>
        <form action="PaginaPrincipal.jsp">
          <button type="submit" class="btn btn-secondary">Regresar</button>
        </form>
</section>

</body>
</html>