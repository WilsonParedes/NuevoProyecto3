package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaginaPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\n");
      out.write("\t<link rel=\"stylesheet\"  href=\"Estilos.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  \t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  \t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  \t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\t<title>Pagina Principal</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<figure>\n");
      out.write("\t<img src=\"Imagenes/LogoPaginaPrincipal.png\" alt =\"LogoPaginaPrincipal\" width=100% height=\"120\">\n");
      out.write("</figure>\n");
      out.write("<nav id=\"navegacionPrincipal\" class=\"navbar navbar-expand-md bg-dark navbar-dark\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Navegacion Pagina Principal\t</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item\">Ingresos\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"IngresoClientes.jsp\">Ingreso Clientes</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"IngresoProductos.jsp\">Ingreso Productos</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>    \n");
      out.write("            <li>Consultas</li>\n");
      out.write("            <li class=\"nav-item\">Ingresos\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"GestionConsultaClientes.jsp\">Consulta Clientes</a>\n");
      out.write("                    </li>    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"GestionConsultaProductos.jsp\">Consulta Productos</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>   \n");
      out.write("            <li class=\"nav-item\">Orden de Compra</li>  \n");
      out.write("            <li id=\"LiLogoSalida\">\n");
      out.write("                <figure>\n");
      out.write("                    <a href=\"index.jsp\"><img src=\"Imagenes/Exit.png\" width=\"30\" height=\"30\"></a>\n");
      out.write("                </figure>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>  \n");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <h3>Servicios</h3>\n");
      out.write("  \n");
      out.write("  <section id=\"SeccionPaginaPrincipal\">\n");
      out.write("    <figure class=\"figur\"> \n");
      out.write("\t\t<img src=\"Imagenes/TrenDelantero.jpg\" alt=\"Tren Delantero\" width=\"300\" height=\"300\" class=\"destacar\">\n");
      out.write("      \t<figcaption>Tren Delantero  </figcaption>\n");
      out.write("    </figure> \n");
      out.write("    <figure class=\"figur\">\n");
      out.write("     \t<img src=\"Imagenes/Llantas.png\" alt=\"Venta de Llantas\" width=\"300\" height=\"300\" class=\"destacar\">\n");
      out.write("\t\t<figcaption>Venta de llantas</figcaption>\n");
      out.write("    </figure> \n");
      out.write("    <figure class=\"figur\"> \n");
      out.write("      \t<img src=\"Imagenes/Asesoria.jpg\" alt=\"Asesoria Personalizada\" width=\"300\" height=\"300\" class=\"destacar\">\n");
      out.write("\t\t<figcaption>Asesoria Personalizada.</figcaption>\n");
      out.write("    </figure>      \n");
      out.write(" </section>   \n");
      out.write("<footer><p>Copyright 2020, www.proyecto3UMG.com</p></footer>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
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
