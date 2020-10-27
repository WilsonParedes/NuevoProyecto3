<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "Modulos.Herramientas.VariablesGlobales" %>
<%@ page import = "Modulos.Herramientas.Usuarios"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<title>Insert title here</title>
</head>
<body>

	<% String usuario = request.getParameter("txtUsuario");
	   String contra = request.getParameter("txtContra");
	   
	   if(usuario != null && contra != null){
		   if(!(usuario.equalsIgnoreCase("admin"))|| (!(contra.equalsIgnoreCase("1234")))){   
			   if((VariablesGlobales.dt.getListaUsuarios().isEmpty())){
			   %>
			   		<jsp:include page="index.jsp"></jsp:include>
					<div class="alert alert-danger alert-dismissible fade show">
    				<button type="button" class="close" data-dismiss="alert">&times;</button>
    				<strong>Error</strong> NO EXISTE NINGUN USUARIO PARA INICIAR SESI�N, DEBE CREAR UN NUEVO USUARIO EN LA OPCION CREAR
  					</div>		
			   <% 
			   }else{
				   for(Usuarios usu : VariablesGlobales.dt.getListaUsuarios()){
					   if((usuario.equalsIgnoreCase(usu.getUsuario()))&&(contra.equalsIgnoreCase(usu.getContrasenia()))){
						   
				%>
							<h2>BIENVENIDO USUARIO</h2>						
						<%	break; 
					   }else{
						%>  
							<h2>NO SE PUEDE INGRESAR</h2> 
						<% 
					   }
				   }
			   }
						%>   
			  		   
			<%
	   		}else{
	   		%>
	   			<jsp:include page="PaginaPrincipal.jsp"></jsp:include>
	   		<%
	   		}	
	   }else{
	   	%>	
		<jsp:include page="index.jsp"></jsp:include>
		<div class="alert alert-danger alert-dismissible fade show">
    		<button type="button" class="close" data-dismiss="alert">&times;</button>
    		<strong>Error</strong> El formulario se encuentra vacio, verifique que ingreso sus datos y vuelva a intentarlo.
  		</div>
		<%
	   		}
		%>
	
</body>
</html>