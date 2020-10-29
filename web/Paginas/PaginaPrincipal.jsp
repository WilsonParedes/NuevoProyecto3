<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet"  href="Estilos.css"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<title>Pagina Principal</title>

</head>
<body>
<figure>
	<img src="Imagenes/LogoPaginaPrincipal.png" alt ="LogoPaginaPrincipal" width=100% height="120">
</figure>
<nav id="navegacionPrincipal" class="navbar  bg-dark navbar-dark">
    
    <div id="header">
        <ul class="nav">
            <li>
                <a class="navbar-brand" href="#">Navegacion Pagina Principal</a>
                
            </li>
            <li>Ingresos
                <ul class="navbar-nav">
                    <li>
                        <a class="nav-link" href="IngresoClientes.jsp">Ingreso Clientes</a>
                    </li>
                    <li>
                        <a class="nav-link" href="IngresoProductos.jsp">Ingreso Productos</a>
                    </li>
                </ul>
            </li>   
            <li>Consultas
                <ul class="navbar-nav">
                    <li>
                        <a class="nav-link" href="GestionConsultaClientes.jsp">Consulta Clientes</a>
                    </li>    
                    <li>
                        <a class="nav-link" href="GestionConsultaProductos.jsp">Consulta Productos</a>
                    </li>
                </ul>
            </li>   
            <li>Orden de Compra</li>  
            <li id="LiLogoSalida">
                <figure class="nav">
                    <a href="index.jsp"><img src="Imagenes/Exit.png" width="40" height="40"></a>
                </figure>
            </li>
        </ul>
    </div>  
</nav>
<br>

<div class="container">
  <h3>Servicios</h3>
  
  <section id="SeccionPaginaPrincipal">
    <figure class="figur"> 
		<img src="Imagenes/TrenDelantero.jpg" alt="Tren Delantero" width="300" height="300" class="destacar">
      	<figcaption>Tren Delantero  </figcaption>
    </figure> 
    <figure class="figur">
     	<img src="Imagenes/Llantas.png" alt="Venta de Llantas" width="300" height="300" class="destacar">
		<figcaption>Venta de llantas</figcaption>
    </figure> 
    <figure class="figur"> 
      	<img src="Imagenes/Asesoria.jpg" alt="Asesoria Personalizada" width="300" height="300" class="destacar">
		<figcaption>Asesoria Personalizada.</figcaption>
    </figure>      
 </section>   
<footer><p>Copyright 2020, www.proyecto3UMG.com</p></footer>
  
  
</div>



</body>
</html>