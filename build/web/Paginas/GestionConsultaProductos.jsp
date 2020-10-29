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
    
    <%
        String nombreproductobuscar = request.getParameter("getbuscar");
        
        request.getSession().setAttribute("namesession", request.getParameter("getbuscar"));
      
        
    %>
<figure>
	<img src="Imagenes/LogoPaginaPrincipal.png" alt ="LogoPaginaPrincipal" width=100% height="120">
</figure>


<nav id="navegacionPrincipal" class="navbar  bg-dark navbar-dark">
    
    <div id="header1">
        
        <ul class="navegacionotraspaginas">
            <li class="nav-item">
                <a class="navbar-brand" >Navegacion Consulta de Productos</a>
            </li>
            <li class="nav-item">
                <form class="form-inline"action="GestionConsultaProductos.jsp">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name ="getbuscar"id="buscar">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                </form>
                
            </li>  
            <li>
               
                <a href="PruebaEliminar.jsp"><button class="btn btn-outline-success my-2 my-sm-0" type="submit" > Eliminar </button></a>
   
            </li>
            <li>
               
                <a href="#"><button class="btn btn-outline-success my-2 my-sm-0" type="submit" > Modificar </button></a>
   
            </li>
            <li>
                <a class="nav-link" href="IngresoProductos.jsp">Ingreso Productos</a>
                    
            </li>
            <li>
                <a class="nav-link" href="PaginaPrincipal.jsp">Regresar</a>     
            </li>
        </ul>
    </div>  
</nav>
<br>

<section class="section EfectosReporteria">
     <%
    
    
    if(nombreproductobuscar == null ||nombreproductobuscar==""){
                
    %>  
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
            ArrayList<Productos> productos= VariablesGlobales.gestion.getBDDProductos();
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
                <th scope="row">
                    <figure>
                        <a><img src="Imagenes/Eliminar.png" width="27" height="27"></a>                      
                    </figure>
                </th>
                <th scope="row">
                    <figure>
                        <img src="Imagenes/Modificar.png" width="27" height="27">                    
                    </figure>
                </th>
            </tr>
            
              <% 
                  
               }
              %>              
        </tbody>
    </table></center>
        <% }else{
            
        %>
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
            ArrayList<Productos> productos= VariablesGlobales.gestion.busquedapreparadaProductos(nombreproductobuscar);
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
                <th scope="row">
                    <figure>
                        <a href="PruebaEliminar.jsp"><img src="Imagenes/Eliminar.png" width="27" height="27"></a>                      
                    </figure>
                </th>
                <th scope="row">
                    <figure>
                        <a href="#"><img src="Imagenes/Modificar.png" width="27" height="27"></a>                      
                    </figure>
                </th>
            </tr>
            
              <% 
                  
               }
              %>              
        </tbody>
    </table></center>
        
    
           
        <%
        }
        %>
        
        <form action="PaginaPrincipal.jsp">
          <button type="submit" class="btn btn-secondary">Regresar</button>
        </form>
        
       

    
</section>

</body>
</html>