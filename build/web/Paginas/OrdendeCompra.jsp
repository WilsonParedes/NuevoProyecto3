<%@page import="Modulos.Herramientas.VariablesGlobales"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "Modulos.Herramientas.*" %>
<%@ page import = "Modulos.DataSistema.Productos" %>
<%@ page import = "Modulos.DataSistema.*"%>
<%@ page import = "javax.swing.JOptionPane"%>
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
<title>Orden de Compra</title>
</head>


<body>
<figure>
	<img src="Imagenes/LogoPaginaPrincipal.png" alt ="LogoPaginaPrincipal" width=100% height="120">
</figure>
<nav id="navegacionPrincipal" class="navbar  bg-dark navbar-dark">
    <div id="header1">
        <ul class="navegacionotraspaginas">
            <li>
                <a class="navbar-brand" href="#">Navegacion Orden de Compra</a>
            </li>
            
            <li>
                <a class="nav-link" href="#">Ver Listado de Compras</a> 
            </li>  
            <li>
                <a class="nav-link" href="PaginaPrincipal.jsp">Regresar</a>
            </li> 
        </ul>
    </div>  
</nav>
<br>
<%
    String idcliente=request.getParameter("txtnitclienteorden");
    String idproducto = request.getParameter("idproducto");
    String metodoenvio = request.getParameter("listaenvio");
    String precioenvio = request.getParameter("txtPrecio");
    String diasenvio = request.getParameter("txtdiasenvio");
    String cantidadenvio = request.getParameter("txtCantidad");

%>
            
        <%
        if(idcliente ==null && idproducto ==null ){
        
        %>


    
    <div class="container" id="contenedorOrdendeCompra">
  
        <form action="OrdendeCompra.jsp" class="was-validated" id="TablaPrincipalIngresoClientes" autocomplete="off"method="POST">
            <div>
                Nit: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="txtnitclienteorden" id ="txtnitclienteorden" width="10%" placeholder="Ingrese Nit de Cliente" required autofocus>
      		<div class="valid-feedback">Valido.</div>
      		<div class="invalid-feedback">complete el campo.</div>

            Producto: <input type="text" name="idproducto" id ="idproducto" width="30" placeholder="Ingrese Nombre Producto"required>
      		<div class="valid-feedback">Valido.</div>
      		<div class="invalid-feedback">complete el campo.</div>
            </div>
            <br><br><br>
            <center><div >
                Metodo Envio: <input type="text" id="Categoria" name="Categoria" list="listaenvio" placeholder="Seleccione" autocomplete="off" > 
                    <datalist id="listaenvio"> 
                        <option value="Aereo"> 
                        <option value="Terrestre">  
                    </datalist> 
                Precio Envio: <input type ="number" min="1" max="160000"  name="txtPrecio" id ="txtPrecio" placeholder="Precio Envío" width="30" required>
                 
                Dias Envío: <input type ="number" min="1" max="160000"  name="txtdiasenvio" id ="txtdiasenvio" placeholder="Días envio" width="30" required>
                
                Cantidad: <input type ="number" min="1" max="160000"  name="txtCantidad" id ="txtCantidad" placeholder="Cantida del producto" width="30" required>
                </div></center>
        
    <%}else{
    %>
    <div class="container" id="contenedorOrdendeCompra">
    <form action="" class="was-validated" id="TablaPrincipalIngresoClientes" autocomplete="off"method="POST">
         <div>
             <lable> Nit de Cliente: <%= idcliente%> </lable><br><br>
            <lable> Nombre Producto: <%= idproducto%> </lable> 
        </div>
        <br><br><br>
        <center><div >
                Metodo Envio: <label><%= metodoenvio%></label>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                Precio Envio: <label><%= precioenvio%></label>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                Dias Envio: <label><%= diasenvio%></label>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                Cantidad Envio:<label><%= cantidadenvio%></label>
                </div></center>
           
        <center><table id="TablaClientes"class="table table-hover">
        <thead class="thead-dark">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Producto</th>
                <th scope="col">Marca</th>
                <th scope="col">Cantidad</th>
                <th scope="col">Precio</th>
            </tr>
        </thead>
        <tbody>
         <%
            //1. Crear una instancia DAO correpondiente a las carreras
     
            ArrayList<Productos> producto = VariablesGlobales.gestion.busquedapreparadaProductos(idproducto);
            int i=0;
            for( Productos produ : producto){
            //4. Pintar el HTML que correponde a cada carrera
             i++;
             
         %>
            <tr>
                <th scope="col"><%=i%></th>
                <th scope="col"><%= produ.getProducto()%></th>
                <th scope="col"><%= produ.getMarca()%></th>
                <th scope="col"><%=cantidadenvio %></th>
                <th scope="col"><%= produ.getPrecio()%></th>
                
              <% 
               }             %>              
        </tbody>
            </table></center> 
        
    </form>   
        
    </div>
        
        
    <%
    
    }
    %>
 <div class="form-group">
     <br><br>
                <center><button type="submit" onclick="Grabar" class="btn btn-outline-success" name="Boton_Entrar_Principal" id="Boton_Entrar_Principal" >Generar</button></center>
            </div>
             </form> 
        
            
    </div>
            
          <form action="OrdendeCompra.jsp">
          	<button type="submit" class="btn btn-secondary">Regresar Menu</button>
            </form>
  
          
</body>
</html>