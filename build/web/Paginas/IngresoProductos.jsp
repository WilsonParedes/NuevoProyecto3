<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "Modulos.Herramientas.GestionBDDs" %>
<%@ page import = "Modulos.DataSistema.Productos" %>
<%@ page import = "javax.swing.JOptionPane"%>

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




<script>
    Grabar("El registro fue almacenado con éxito");
</script>

<body>
<figure>
	<img src="Imagenes/LogoPaginaPrincipal.png" alt ="LogoPaginaPrincipal" width=100% height="120">
</figure>
<nav id="navegacionPrincipal" class="navbar  bg-dark navbar-dark">
    <div id="header1">
        <ul class="navegacionotraspaginas">
            <li>
                <a class="navbar-brand" href="#">Navegacion Ingreso Clientes</a>
            </li>
            
            <li>
                <a class="nav-link" href="GestionConsultaClientes.jsp">Ver Listado de Productos</a> 
            </li>  
            <li>
                <a class="nav-link" href="PaginaPrincipal.jsp">Regresar</a>
            </li> 
        </ul>
    </div>  
</nav>
<br>


<section>
    <center><div class="container" id="contenedorIngresoProductos" >
    <% 
    	String NombreProducto= request.getParameter("txtNProductos");
	String Marca= request.getParameter("txtMarca");
	String Categoria= request.getParameter("Categoria");
	String Precio = request.getParameter("txtPrecio");
        if(NombreProducto==null && Marca==null && Categoria==null && Precio==null){
        %>	
        <form action="IngresoProductos.jsp" class="was-validated" id="TablaPrincipalIngresoClientes" method="POST">
            <div class="form-group">
      		Ingrese Nombre Producto <input type="text" class="form-control" name="txtNProductos" id ="txtNProductos" required autofocus>
      		<div class="valid-feedback">Valido.</div>
      		<div class="invalid-feedback">complete el campo.</div>
            </div>
            <div class="form-group">
      		Ingrese Marca <input type="text" class="form-control" name="txtMarca" id ="txtMarca" required>
      		<div class="valid-feedback">Valido.</div>
      		<div class="invalid-feedback">complete el campo.</div>
            </div>
            <div class="form-group">
                Seleccione Categoria
                <input type="text" class="form-control" id="Categoria" name="Categoria" list="ListaCategoria" > 
      		<div class="valid-feedback">Valido.</div>
      		<div class="invalid-feedback">complete el campo.</div>
                    <datalist id="ListaCategoria"> 
                        <option selected>Seleccionar</option>
                        <option value="Aceites y Lubricantes"> 
                        <option value="Llantas"> 
                        <option value="Accesorios"> 
                    </datalist>
            </div>
            <div class="form-group">
                <input type ="number" min="1" max="160000" class="form-control" name="txtPrecio" id ="txtPrecio" required
            	<div class="valid-feedback">Valido.</div>
      		<div class="invalid-feedback">complete el campo.</div>
            </div>
            <div class="form-group">
   		<button type="submit" onclick="Grabar" class="btn btn-outline-success" name="Boton_Entrar_Principal" id="Boton_Entrar_Principal" >Ingresar</button>
            </div>
        </form>
        <%
            }else{
       
            	//1. Crear una instancia de CarreraDAO
              	GestionBDDs gestion = new GestionBDDs();
                //2. Crear una instancia de Carrera
                Productos productos = new Productos(Categoria,NombreProducto,Marca,Integer.parseInt(Precio));
                
                //3. Insertar en la DB la carrera
                gestion.saveCarrera(null,null,productos);
            %>
            <div class="alert alert-success" role="alert">
                El Producto fue ingresado con éxito. <a href="GestionConsultaProductos.jsp" class="alert-link">Ver Listado de Productos</a>. 
            </div>
            <%
                }
                %>
                
            <form action="IngresoProductos.jsp">
          	<button type="submit" class="btn btn-secondary">Regresar Menu</button>
            </form>
    </div></center>
</section>
</body>
</html>