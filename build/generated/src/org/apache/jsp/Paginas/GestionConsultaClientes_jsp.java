package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modulos.Herramientas.VariablesGlobales;
import Modulos.DataSistema.ClienteIndividual;
import Modulos.Herramientas.GestionBDDs;
import Modulos.DataSistema.Clientes;
import java.util.ArrayList;

public final class GestionConsultaClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Ingreso Clintes</title>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("    \n");
      out.write("  ");

        String nitclienteabuscar = request.getParameter("getbuscarcliente");
        
        request.getSession().setAttribute("clientebusqueda", request.getParameter("getbuscarcliente"));
      
        
    
      out.write("    \n");
      out.write("    \n");
      out.write("<figure>\n");
      out.write("\t<img src=\"Imagenes/LogoPaginaPrincipal.png\" alt =\"LogoPaginaPrincipal\" width=100% height=\"120\">\n");
      out.write("</figure>\n");
      out.write("<nav id=\"navegacionPrincipal\" class=\"navbar  bg-dark navbar-dark\">\n");
      out.write("    \n");
      out.write("    <div id=\"header1\">\n");
      out.write("        <ul class=\"navegacionotraspaginas\">\n");
      out.write("            <li>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Navegacion Consulta de Clientes</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <form class=\"form-inline\"action=\"GestionConsultaClientes.jsp\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" name =\"getbuscarcliente\"id=\"buscar\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Buscar</button>\n");
      out.write("                </form>\n");
      out.write("            </li>  \n");
      out.write("            <li>\n");
      out.write("               \n");
      out.write("                <a href=\"PruebaEliminar.jsp\"><button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\" > Eliminar </button></a>\n");
      out.write("   \n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("               \n");
      out.write("                <a href=\"#\"><button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\" > Modificar </button></a>\n");
      out.write("   \n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a class=\"nav-link\" href=\"IngresoClientes.jsp\">Ingreso Clientes</a>\n");
      out.write("                    \n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a class=\"nav-link\" href=\"PaginaPrincipal.jsp\">Regresar</a>     \n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>  \n");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<section class=\"section EfectosReporteria\">\n");
      out.write("    \n");
      out.write("     ");

    
    
    if(nitclienteabuscar == null || nitclienteabuscar==""){
                
    
      out.write("  \n");
      out.write("    <center><table id=\"TablaClientes\"class=\"table table-hover\">\n");
      out.write("        <thead class=\"thead-dark\">\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">ID</th>\n");
      out.write("                <th scope=\"col\">NIT</th>\n");
      out.write("                <th scope=\"col\">DPI</th>\n");
      out.write("                <th scope=\"col\">Nombre</th>\n");
      out.write("                <th scope=\"col\">Fecha Nacimiento</th>\n");
      out.write("                <th scope=\"col\">Genero</th>\n");
      out.write("                <th scope=\"col\">Estado Civil</th>\n");
      out.write("                <th scope=\"col\">Nombre Empresa</th>\n");
      out.write("                <th scope=\"col\">Estado Civil</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("         ");

            //1. Crear una instancia DAO correpondiente a las carreras
            ArrayList<Clientes> clientes= VariablesGlobales.gestion.getBDDClientes();
            int i=0;
            for( Clientes clien : clientes){
            //4. Pintar el HTML que correponde a cada carrera
             i++;
         
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">");
      out.print(i);
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print( clien.getNit());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">\"12345678\"</th>\n");
      out.write("                <th scope=\"col\">");
      out.print( clien.getNombre());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(clien.getFecha());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(clien.getGenero());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(clien.getEstadocivil());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">\"PatitoFeliz\"</th>\n");
      out.write("                <th scope=\"col\">\"Hola\"</th>\n");
      out.write("                </tr>\n");
      out.write("              ");
 
               }
              
      out.write("              \n");
      out.write("        </tbody>\n");
      out.write("    </table></center>\n");
      out.write("        \n");
      out.write("        ");
 }else{
            
        
      out.write("\n");
      out.write("        <center><table id=\"TablaClientes\"class=\"table table-hover\">\n");
      out.write("        <thead class=\"thead-dark\">\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">ID</th>\n");
      out.write("                <th scope=\"col\">NIT</th>\n");
      out.write("                <th scope=\"col\">DPI</th>\n");
      out.write("                <th scope=\"col\">Nombre</th>\n");
      out.write("                <th scope=\"col\">Fecha Nacimiento</th>\n");
      out.write("                <th scope=\"col\">Genero</th>\n");
      out.write("                <th scope=\"col\">Estado Civil</th>\n");
      out.write("                <th scope=\"col\">Nombre Empresa</th>\n");
      out.write("                <th scope=\"col\">Estado Civil</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("         ");

            //1. Crear una instancia DAO correpondiente a las carreras
            ArrayList<Clientes> clientes= VariablesGlobales.gestion.busquedapreparadaClientes(nitclienteabuscar);
            int i=0;
            for( Clientes clien : clientes){
            //4. Pintar el HTML que correponde a cada carrera
             i++;
         
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">");
      out.print(i);
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print( clien.getNit());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">\"12345678\"</th>\n");
      out.write("                <th scope=\"col\">");
      out.print( clien.getNombre());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(clien.getFecha());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(clien.getGenero());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(clien.getEstadocivil());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">\"PatitoFeliz\"</th>\n");
      out.write("                <th scope=\"col\">\"Hola\"</th>\n");
      out.write("                </tr>\n");
      out.write("              ");
 
               }
              
      out.write("              \n");
      out.write("        </tbody>\n");
      out.write("    </table></center>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"PaginaPrincipal.jsp\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-secondary\">Regresar</button>\n");
      out.write("        </form>\n");
      out.write("</section>\n");
      out.write("\n");
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
