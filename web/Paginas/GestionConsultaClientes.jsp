<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "Modulos.Herramientas.VariablesGlobales" %>
<%@ page import = "Modulos.DataSistema.ClienteIndividual"%>
<%@ page import = "Modulos.Herramientas.GestionBDDs"%>
<%@ page import = "Modulos.DataSistema.Clientes"%>
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
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,600|Open+Sans" rel="stylesheet"> 
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css">  
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Ingreso Clintes</title>
</head>
<body >
    
  <%
      
        String nitclienteabuscar = request.getParameter("getbuscarcliente");
        String cambiarElementoCliente=request.getParameter("txtNombreNitabuscar");
        String filtroBDD = request.getParameter("radioFiltro");
        request.getSession().setAttribute("clientebusqueda", request.getParameter("getbuscarcliente"));
        
    %>    
    
<figure>
	<img src="Imagenes/LogoPaginaPrincipal.png" alt ="LogoPaginaPrincipal" width=100% height="120">
</figure>
<nav id="navegacionPrincipal" class="navbar  bg-dark navbar-dark">
    
    <div id="header1">
        <ul class="navegacionotraspaginas">
            <li>
                <a class="navbar-brand" href="#">Navegacion Consulta de Clientes</a>
            </li>
            <li class="nav-item">
                <form class="form-inline"action="GestionConsultaClientes.jsp">
                    <input class="form-control mr-sm-2" type="search" placeholder="Ingrese el NIT" aria-label="Search" name ="getbuscarcliente"id="getbuscarcliente">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                </form>
            </li>  
            <li>
               
                <a href="PruebaEliminar.jsp"><button class="btn btn-outline-success my-2 my-sm-0" type="submit" > Eliminar </button></a>
   
            </li>
            <li>
               
                <button id="btn-abrir-popup" class="btn btn-outline-success my-2 my-sm-0" type="submit" > Modificar </button>
   
            </li>
            <li>
                <a class="nav-link" href="IngresoClientes.jsp">Ingreso Clientes</a>    
            </li>
            
            <li>
                <a class="nav-link" href="PaginaPrincipal.jsp">Regresar</a>     
            </li>
            <li> 
                 <form class="form-inline"action="GestionConsultaClientes.jsp">
                   <input type="radio" name ="radioFiltro" value = "1" /> Individual 
                   <input type="radio" name ="radioFiltro" value = "0" /> Empresa <br>
                   <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Filtrar</button>
                </form>
                
                    
            </li>
        </ul>
    </div>  
</nav>
<br>

<section class="section EfectosReporteria">
    
    <%
        if(cambiarElementoCliente==null){
            
        
    %>
    <%
    if(filtroBDD==null){

    %>
     <%
    
    
    if(nitclienteabuscar == null || nitclienteabuscar==""){
         
    %>  
    <center><table id="TablaClientes"class="table table-hover">
        <thead class="thead-dark">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">NIT</th>
                <th scope="col">DPI</th>
                <th scope="col">Nombre</th>
                <th scope="col">Fecha Nacimiento</th>
                <th scope="col">Genero</th>
                <th scope="col">Estado Civil</th>
                <th scope="col">Nombre Empresa</th>
                <th scope="col">Contacto</th>
            </tr>
        </thead>
        <tbody>
         <%
            //1. Crear una instancia DAO correpondiente a las carreras
            ArrayList<Clientes> clientes= VariablesGlobales.gestion.getBDDClientes();
            int i=0;
            for( Clientes clien : clientes){
            //4. Pintar el HTML que correponde a cada carrera
             i++;
             
         %>
            <tr>
                <th scope="col"><%=i%></th>
                <th scope="col"><%= clien.getNit()%></th>
                <th scope="col"><%=clien.getDpi()%></th>
                <th scope="col"><%= clien.getNombre()%></th>
                <th scope="col"><%=clien.getFecha()%></th>
                <th scope="col"><%=clien.getGenero()%></th>
                <th scope="col"><%=clien.getEstadocivil()%></th>
                <th scope="col"><%=clien.getRazonsocial()%></th>
                <th scope="col"><%=clien.getContacto()%></th>
                <th scope ="row">
                    <figure>
                        <img src="Imagenes/Eliminar.png" width="27" height="27">                  
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
                   out.print(nitclienteabuscar);
                out.print(filtroBDD);

        %>
        <center><table id="TablaClientes"class="table table-hover">
        <thead class="thead-dark">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">NIT</th>
                <th scope="col">DPI</th>
                <th scope="col">Nombre</th>
                <th scope="col">Fecha Nacimiento</th>
                <th scope="col">Genero</th>
                <th scope="col">Estado Civil</th>
                <th scope="col">Nombre Empresa</th>
                <th scope="col">Contacto</th>
            </tr>
        </thead>
        <tbody>
         <%
            //1. Crear una instancia DAO correpondiente a las carreras
            ArrayList<Clientes> clientes= VariablesGlobales.gestion.busquedapreparadaClientes(nitclienteabuscar);
            int i=0;
            for( Clientes clien : clientes){
            //4. Pintar el HTML que correponde a cada carrera
             i++;
         %>
            <tr>
                <th scope="col"><%=i%></th>
                <th scope="col"><%= clien.getNit()%></th>
                <th scope="col"><%=clien.getDpi()%></th>
                <th scope="col"><%= clien.getNombre()%></th>
                <th scope="col"><%=clien.getFecha()%></th>
                <th scope="col"><%=clien.getGenero()%></th>
                <th scope="col"><%=clien.getEstadocivil()%></th>
                <th scope="col"><%=clien.getRazonsocial()%></th>
                <th scope="col"><%=clien.getContacto()%></th>
                <th scope ="row">
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
        <%
        
        }else{

        %>
        
        <center><table id="TablaClientes"class="table table-hover">
        <thead class="thead-dark">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">NIT</th>
                <th scope="col">DPI</th>
                <th scope="col">Nombre</th>
                <th scope="col">Fecha Nacimiento</th>
                <th scope="col">Genero</th>
                <th scope="col">Estado Civil</th>
                <th scope="col">Nombre Empresa</th>
                <th scope="col">Contacto</th>
            </tr>
        </thead>
        <tbody>
         <%
            //1. Crear una instancia DAO correpondiente a las carreras
            ArrayList<Clientes> clientes= VariablesGlobales.gestion.busquedapreparadaClientesFiltroBDD(Integer.parseInt(filtroBDD));
            int i=0;
            for( Clientes clien : clientes){
            //4. Pintar el HTML que correponde a cada carrera
             i++;
         %>
            <tr>
                <th scope="col"><%=i%></th>
                <th scope="col"><%= clien.getNit()%></th>
                <th scope="col"><%=clien.getDpi()%></th>
                <th scope="col"><%= clien.getNombre()%></th>
                <th scope="col"><%=clien.getFecha()%></th>
                <th scope="col"><%=clien.getGenero()%></th>
                <th scope="col"><%=clien.getEstadocivil()%></th>
                <th scope="col"><%=clien.getRazonsocial()%></th>
                <th scope="col"><%=clien.getContacto()%></th>
                <th scope ="row">
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
        }%>
        <%}else{
           
        %>
        
        
        <center> <div class="container" id="contenedorIngresoProductos">
            <div class="alert alert-success" role="alert">
                El Cliente fue modificado con exito. <a href="GestionConsultaClientes.jsp" class="alert-link">Volver Listado Clientes</a>. 
            </div>
        </div></center>
        <%    
            }
        %>
        <form action="PaginaPrincipal.jsp">
          <button type="submit" class="btn btn-secondary">Regresar</button>
        </form>
        
    <!-- ----------------
    VETANA EMERGENTE
    ------------------ --> 
    <div class="overlay" id="overlay">
	<div class="popup" id="popup">
            <a href="#" id="btn-cerrar-popup" class="btn-cerrar-popup"><i class="fas fa-times"></i></a>
                    <form action="ModificarElementosBDDClientes.jsp">
                        <div class="contenedor-inputs">
                            <jsp:include page="ModificarElementosBDDClientes.jsp"></jsp:include>
			</div>
                    </form>
	</div>
    </div>

	<script src="EventosVentanaEmergente.js"></script>
</section>

</body>
</html>