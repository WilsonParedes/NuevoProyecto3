package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modulos.Herramientas.VariablesGlobales;
import Modulos.Herramientas.GestionBDDs;
import Modulos.DataSistema.Productos;
import java.util.ArrayList;

public final class ModificarElementosBDD_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Ingreso Productos</title>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("  \n");
      out.write("<figure>\n");
      out.write("\t<img src=\"Imagenes/LogoPaginaPrincipal.png\" alt =\"LogoPaginaPrincipal\" width=100% height=\"120\">\n");
      out.write("</figure>\n");
      out.write("    \n");
      out.write("<nav id=\"navegacionPrincipal\" class=\"navbar  bg-dark navbar-dark\">\n");
      out.write("    \n");
      out.write("    <div id=\"header1\">\n");
      out.write("        \n");
      out.write("        <ul class=\"navegacionotraspaginas\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"navbar-brand\" >MODIFICAR</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a class=\"nav-link\" href=\"GestionConsultaProductos.jsp\">Regresar</a>     \n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>  \n");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    ");

        String cambiarElemento= request.getParameter("txtNombreProductoVentanaEmergente");
        
        String buscarElemento = (String) request.getSession().getAttribute("namesession");
                    
        out.print(cambiarElemento);
        out.print(buscarElemento);
    
      out.write("\n");
      out.write("    \n");
      out.write("    ");

        if(cambiarElemento==null){
                    
    
      out.write("\n");
      out.write("    <form action=\"ModificarElementosBDD.jsp\" class=\"was-validated\" id=\"TablaPrincipalIngresoClientes\" method=\"POST\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <h5>El dato que se cambiara de la tabla es el nombre de producto: ");
 out.print(buscarElemento);
      out.write("</h5>\n");
      out.write("            <br>\n");
      out.write("            Ingrese Nombre Completo: <input pattern=\"[A-Za-Z]\" class=\"form-control\" maxlength=\"30\" name=\"txtNombreProductoVentanaEmergente\" id =\"txtNombreProductoVentanaEmergente\" required>\n");
      out.write("      \t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("        </div>\t\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-outline-success\" name=\"Boton_Entrar_Principal\" id=\"Boton_Entrar_Principal\" >Modificar</button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("            \n");
      out.write("    ");

    }else{
    
      out.write("\n");
      out.write("         ");

            out.print(cambiarElemento);
            out.print(buscarElemento);
           VariablesGlobales.gestion.modificarregistro(buscarElemento, cambiarElemento);
           request.getSession().getAttribute("");
        
      out.write("\n");
      out.write("        <center> <div class=\"container\" id=\"contenedorIngresoProductos\">\n");
      out.write("            <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                El producto fue modificado con exito. <a href=\"GestionConsultaProductos.jsp\" class=\"alert-link\">Volver Listado Productos</a>. \n");
      out.write("            </div>\n");
      out.write("        </div></center>\n");
      out.write("    ");

        }
        
      out.write("\n");
      out.write("</section>   \n");
      out.write("    \n");
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
