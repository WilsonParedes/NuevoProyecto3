<%@page import="Modulos.Herramientas.VariablesGlobales"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "Modulos.Herramientas.GestionBDDs" %>
<%@ page import = "Modulos.DataSistema.Clientes" %>
<%@ page import = "Modulos.DataSistema.ClienteIndividual"%>
<%@ page import = "Modulos.DataSistema.ClienteEmpresa"%>
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
<title>Ingreso Clientes</title>
</head>

<script type="text/javascript">
    function activarempresa(){
        var checkboxEmpresa = document.getElementById('checkboxEmpresa');
        if(checkboxEmpresa.value!==null && checkboxEmpresa.value!== ""){
            document.getElementById('txtContacoEmpresa').disabled =false;
            document.getElementById('txtNombreEmpresa').disabled =false;
        }else{
            document.getElementById('txtContacoEmpresa').disabled =true;
            document.getElementById('txtNombreEmpresa').disabled =true;
        }
        
    }
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
                <a class="nav-link" href="GestionConsultaClientes.jsp">Ver Listado de CLientes</a> 
            </li>  
            <li>
                <a class="nav-link" href="PaginaPrincipal.jsp">Regresar</a>
            </li> 
        </ul>
    </div>  
</nav>
<br>
    

<section>
    <center><div class="container" id="contendorIngresoClientes" >
    <% 
    	String NIT= request.getParameter("txtNITIngresoClientes");
	  	String DPI= request.getParameter("txtDPIIngresoClientes");
	   	String Nombre= request.getParameter("txtNombreCompletoIngresoClientes");
	   	String DatosEmpresa = request.getParameter("txtNombreEmpresa");
	   	String ContactoEmpresa = request.getParameter("txtContacoEmpresa");
                String Genero = request.getParameter("radioGenero");
                String EstadoCivil = request.getParameter("radioEstadoCivil");
            if(NIT==null && DPI==null && Nombre==null && DatosEmpresa==null&&ContactoEmpresa==null){
        %>	
            <form action="IngresoClientes.jsp" class="was-validated" id="TablaPrincipalIngresoClientes" method="POST">
    		<div class="form-group">
      			Ingrese NIT: <input pattern="[0-9]{8}" class="form-control" maxlength="8" name="txtNITIngresoClientes" id ="txtNITIngresoClientes" required>
      			<div class="valid-feedback">Valido.</div>
      			<div class="invalid-feedback">complete el campo.</div>
      		</div>
      		<div class="form-group">
      			Ingrese DPI: <input pattern="[0-9]{13}" class="form-control" maxlength="13" name="txtDPIIngresoClientes" id ="txtDPIIngresoClientes" required>
      			<div class="valid-feedback">Valido.</div>
      			<div class="invalid-feedback">complete el campo.</div>
      		</div>
      		<div class="form-group">
      			Ingrese Nombre Completo: <input pattern="[A-Za-Z]" class="form-control" maxlength="30" name="txtNombreCompletoIngresoClientes" id ="txtNombreCompletoIngresoClientes" required>
      			<div class="valid-feedback">Valido.</div>
      			<div class="invalid-feedback">complete el campo.</div>
    		</div>
                <div class="form-group">
                    <br>Seleccione el Género<br>
                    <input type="radio" name ="radioGenero" value = "Femenino" /> Femenino 
                    <input type="radio" name ="radioGenero" value = "Masculino" /> Masculino <br>
                    <div class="valid-feedback">Valido.</div>
                    <div class="invalid-feedback">complete el campo.</div>
    		</div>
                
                <div class="form-group">
                    <br>Seleccione el Estado Civil<br>
                    <input type="radio" name ="radioEstadoCivil" value = "Soltero" /> Soltero 
                    <input type="radio" name ="radioEstadoCivil" value = "Casado" /> Casado <br>
                    <div class="valid-feedback">Valido.</div>
                    <div class="invalid-feedback">complete el campo.</div>
    		</div>
                <div class="form-group">
                    Si actua como Representante legal o es Propietario de un negocio marque la casilla:
                    <input type="checkbox" name ="checkboxEmpresa" id="checkboxEmpresa" value = "Empresa" onclick="activarempresa()"/> Empresa
                    
    		</div>
                
    		<div class="form-group">
      			Ingrese Datos de la Empresa: <input pattern="[A-Za-Z]" class="form-control" maxlength="30" name="txtContacoEmpresa" id ="txtContacoEmpresa" disabled=""required>
      			<div class="valid-feedback">Valido.</div>
      			<div class="invalid-feedback">complete el campo.</div>
    		</div>
    		<div class="form-group">
                    Ingrese Contacto de la empresa: <input pattern="[A-Za-Z]" class="form-control" maxlength="30" name="txtNombreEmpresa" id ="txtNombreEmpresa" disabled="" required>
      			<div class="valid-feedback">Valido.</div>
      			<div class="invalid-feedback">complete el campo.</div>
    		</div>
   			<div class="form-group">
   				<button type="submit" onclick="Grabar" class="btn btn-outline-success" name="Boton_Entrar_Principal" id="Boton_Entrar_Principal" >Ingresar</button>
   			</div>
                    </form>
        <%
            }else{
                ClienteIndividual ClienteIndividual;
                ClienteEmpresa ClienteEmpresa;
                 
                 String empresa = (String) request.getParameter("checkboxEmpresa");
               
                if(empresa == null){
                    ClienteIndividual = new ClienteIndividual(DPI, Nombre, NIT, "fecha", Genero, EstadoCivil,1);
                    VariablesGlobales.gestion.saveCarrera(ClienteIndividual, null, null);
                   
                    
                }else{
                    ClienteEmpresa = new ClienteEmpresa(Nombre, NIT, "fecha", Genero, EstadoCivil, DatosEmpresa,ContactoEmpresa, 8,0);
                    VariablesGlobales.gestion.saveCarrera(null, ClienteEmpresa, null);                                        
                  
                }     
                
            %>
            <div class="alert alert-success" role="alert">
                El cliente fue almacenado con exito. <a href="GestionConsultaClientes.jsp" class="alert-link">Ver Listado Clientes</a>. 
            </div>
            <%
                }
                %>
                
            <form action="IngresoClientes.jsp">
          	<button type="submit" class="btn btn-secondary">Ingresar otro Cliente</button>
            </form>
        </div></center>
</section>
</body>
</html>