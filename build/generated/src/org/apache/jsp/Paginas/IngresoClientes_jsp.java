package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modulos.Herramientas.VariablesGlobales;
import Modulos.Herramientas.GestionBDDs;
import Modulos.DataSistema.Clientes;
import Modulos.DataSistema.ClienteIndividual;
import Modulos.DataSistema.ClienteEmpresa;
import javax.swing.JOptionPane;

public final class IngresoClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\n");
      out.write("\t<meta http-equiv=\"Expires\" content=\"0\">\n");
      out.write(" \t<meta http-equiv=\"Last-Modified\" content=\"0\">\n");
      out.write(" \t<meta http-equiv=\"Cache-Control\" content=\"no-cache, mustrevalidate\">\n");
      out.write("  \t<meta http-equiv=\"Pragma\" content=\"no-cache\">\n");
      out.write("\t<link rel=\"stylesheet\"  href=\"Estilos.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  \t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  \t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  \t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("<title>Ingreso Clientes</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function activarempresa(){\n");
      out.write("        var checkboxEmpresa = document.getElementById('checkboxEmpresa');\n");
      out.write("        if(checkboxEmpresa.value!==null && checkboxEmpresa.value!== \"\"){\n");
      out.write("            document.getElementById('txtContacoEmpresa').disabled =false;\n");
      out.write("            document.getElementById('txtNombreEmpresa').disabled =false;\n");
      out.write("        }else{\n");
      out.write("            document.getElementById('txtContacoEmpresa').disabled =true;\n");
      out.write("            document.getElementById('txtNombreEmpresa').disabled =true;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<figure>\n");
      out.write("\t<img src=\"Imagenes/LogoPaginaPrincipal.png\" alt =\"LogoPaginaPrincipal\" width=100% height=\"120\">\n");
      out.write("</figure>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<nav id=\"navegacionPrincipal\" class=\"navbar  bg-dark navbar-dark\">\n");
      out.write("    \n");
      out.write("    <div id=\"header1\">\n");
      out.write("        <ul class=\"navegacionotraspaginas\">\n");
      out.write("            <li>\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">Navegacion Ingreso Clientes</a>  \n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a class=\"nav-link\" href=\"GestionConsultaClientes.jsp\">Ver Listado de CLientes</a> \n");
      out.write("            </li>  \n");
      out.write("            <li>\n");
      out.write("                <a class=\"nav-link\" href=\"PaginaPrincipal.jsp\">Regresar</a>\n");
      out.write("            </li> \n");
      out.write("        </ul>\n");
      out.write("    </div>  \n");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <center><div class=\"container\" id=\"contendorIngresoClientes\" >\n");
      out.write("    ");
 
    	String NIT= request.getParameter("txtNITIngresoClientes");
	  	String DPI= request.getParameter("txtDPIIngresoClientes");
	   	String Nombre= request.getParameter("txtNombreCompletoIngresoClientes");
	   	String DatosEmpresa = request.getParameter("txtNombreEmpresa");
	   	String ContactoEmpresa = request.getParameter("txtContacoEmpresa");
                String Genero = request.getParameter("radioGenero");
                String EstadoCivil = request.getParameter("radioEstadoCivil");
            if(NIT==null && DPI==null && Nombre==null && DatosEmpresa==null&&ContactoEmpresa==null){
        
      out.write("\t\n");
      out.write("            <form action=\"IngresoClientes.jsp\" class=\"was-validated\" id=\"TablaPrincipalIngresoClientes\" method=\"POST\">\n");
      out.write("    \t\t<div class=\"form-group\">\n");
      out.write("      \t\t\tIngrese NIT: <input pattern=\"[0-9]{8}\" class=\"form-control\" maxlength=\"8\" name=\"txtNITIngresoClientes\" id =\"txtNITIngresoClientes\" required>\n");
      out.write("      \t\t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("      \t\t</div>\n");
      out.write("      \t\t<div class=\"form-group\">\n");
      out.write("      \t\t\tIngrese DPI: <input pattern=\"[0-9]{13}\" class=\"form-control\" maxlength=\"13\" name=\"txtDPIIngresoClientes\" id =\"txtDPIIngresoClientes\" required>\n");
      out.write("      \t\t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("      \t\t</div>\n");
      out.write("      \t\t<div class=\"form-group\">\n");
      out.write("      \t\t\tIngrese Nombre Completo: <input pattern=\"[A-Za-Z]\" class=\"form-control\" maxlength=\"30\" name=\"txtNombreCompletoIngresoClientes\" id =\"txtNombreCompletoIngresoClientes\" required>\n");
      out.write("      \t\t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("    \t\t</div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <br>Seleccione el Género<br>\n");
      out.write("                    <input type=\"radio\" name =\"radioGenero\" value = \"Femenino\" /> Femenino \n");
      out.write("                    <input type=\"radio\" name =\"radioGenero\" value = \"Masculino\" /> Masculino <br>\n");
      out.write("                    <div class=\"valid-feedback\">Valido.</div>\n");
      out.write("                    <div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("    \t\t</div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <br>Seleccione el Estado Civil<br>\n");
      out.write("                    <input type=\"radio\" name =\"radioEstadoCivil\" value = \"Soltero\" /> Soltero \n");
      out.write("                    <input type=\"radio\" name =\"radioEstadoCivil\" value = \"Casado\" /> Casado <br>\n");
      out.write("                    <div class=\"valid-feedback\">Valido.</div>\n");
      out.write("                    <div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("    \t\t</div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    Si actua como Representante legal o es Propietario de un negocio marque la casilla:\n");
      out.write("                    <input type=\"checkbox\" name =\"checkboxEmpresa\" id=\"checkboxEmpresa\" value = \"Empresa\" onclick=\"activarempresa()\"/> Empresa\n");
      out.write("                    \n");
      out.write("    \t\t</div>\n");
      out.write("                \n");
      out.write("    \t\t<div class=\"form-group\">\n");
      out.write("      \t\t\tIngrese Datos de la Empresa: <input pattern=\"[A-Za-Z]\" class=\"form-control\" maxlength=\"30\" name=\"txtContacoEmpresa\" id =\"txtContacoEmpresa\" disabled=\"\"required>\n");
      out.write("      \t\t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"form-group\">\n");
      out.write("                    Ingrese Contacto de la empresa: <input pattern=\"[A-Za-Z]\" class=\"form-control\" maxlength=\"30\" name=\"txtNombreEmpresa\" id =\"txtNombreEmpresa\" disabled=\"\" required>\n");
      out.write("      \t\t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("    \t\t</div>\n");
      out.write("   \t\t\t<div class=\"form-group\">\n");
      out.write("   \t\t\t\t<button type=\"submit\" onclick=\"Grabar\" class=\"btn btn-outline-success\" name=\"Boton_Entrar_Principal\" id=\"Boton_Entrar_Principal\" >Ingresar</button>\n");
      out.write("   \t\t\t</div>\n");
      out.write("                    </form>\n");
      out.write("        ");

            }else{
                ClienteIndividual ClienteIndividual;
                ClienteEmpresa ClienteEmpresa;

                 String empresa = (String) request.getParameter("checkboxEmpresa");
                 out.print(empresa);
                 
                 out.print(request.getParameter("radioEstadoCivil"));
                if(empresa.equals("Empresa")){
                    ClienteEmpresa = new ClienteEmpresa(Nombre, NIT, "fecha", Genero, EstadoCivil, DatosEmpresa,ContactoEmpresa, 8,0);
                    VariablesGlobales.gestion.saveCarrera(null, ClienteEmpresa, null);
                }else{
                                                            
                    ClienteIndividual = new ClienteIndividual(DPI, Nombre, NIT, "fecha", Genero, EstadoCivil,1);
                    VariablesGlobales.gestion.saveCarrera(ClienteIndividual, null, null);

                }     
                
            
      out.write("\n");
      out.write("            <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                El cliente fue almacenado con exito. <a href=\"GestionConsultaClientes.jsp\" class=\"alert-link\">Ver Listado Clientes</a>. \n");
      out.write("            </div>\n");
      out.write("            ");

                }
                
      out.write("\n");
      out.write("                \n");
      out.write("            <form action=\"IngresoClientes.jsp\">\n");
      out.write("          \t<button type=\"submit\" class=\"btn btn-secondary\">Ingresar otro Cliente</button>\n");
      out.write("            </form>\n");
      out.write("        </div></center>\n");
      out.write("</section>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
