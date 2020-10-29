package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modulos.Herramientas.GestionBDDs;
import Modulos.DataSistema.Productos;
import javax.swing.JOptionPane;

public final class IngresoProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<script>\n");
      out.write("    Grabar(\"El registro fue almacenado con éxito\");\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<figure>\n");
      out.write("\t<img src=\"Imagenes/LogoPaginaPrincipal.png\" alt =\"LogoPaginaPrincipal\" width=100% height=\"120\">\n");
      out.write("</figure>\n");
      out.write("<nav id=\"navegacionPrincipal\" class=\"navbar navbar-expand-md bg-dark navbar-dark\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Navegacion Ingreso Productos</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("    <center><div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"GestionConsultaProductos.jsp\">Listado de Productos</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"PaginaPrincipal.jsp\">Regresar</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div></center>\n");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <center><div class=\"container\" id=\"contenedorIngresoProductos\" >\n");
      out.write("    ");
 
    	String NombreProducto= request.getParameter("txtNProductos");
	String Marca= request.getParameter("txtMarca");
	String Categoria= request.getParameter("txtCategoria");
	String Precio = request.getParameter("txtPrecio");
        if(NombreProducto==null && Marca==null && Categoria==null && Precio==null){
        
      out.write("\t\n");
      out.write("        <form action=\"IngresoProductos.jsp\" class=\"was-validated\" id=\"TablaPrincipalIngresoClientes\" method=\"POST\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("      \t\tIngrese Nombre Producto <input type=\"text\" class=\"form-control\" name=\"txtNProductos\" id =\"txtNProductos\" required autofocus>\n");
      out.write("      \t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("      \t\tIngrese Marca <input type=\"text\" class=\"form-control\" name=\"txtMarca\" id =\"txtMarca\" required>\n");
      out.write("      \t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                Seleccione Categoria\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"Categoria\" list=\"ListaCategoria\" > \n");
      out.write("      \t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("                    <datalist id=\"ListaCategoria\"> \n");
      out.write("                        <option value=\"Aceites y Lubricantes\"> \n");
      out.write("                        <option value=\"Llantas\"> \n");
      out.write("                        <option value=\"Accesorios\"> \n");
      out.write("                    </datalist>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type =\"number\" min=\"1\" max=\"160000\" class=\"form-control\" name=\"txtPrecio\" id =\"txtPrecio\" required\n");
      out.write("            \t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("   \t\t<button type=\"submit\" onclick=\"Grabar\" class=\"btn btn-outline-success\" name=\"Boton_Entrar_Principal\" id=\"Boton_Entrar_Principal\" >Ingresar</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        ");

            }else{
       
            	//1. Crear una instancia de CarreraDAO
              	GestionBDDs gestion = new GestionBDDs();
                //2. Crear una instancia de Carrera
                Productos productos = new Productos(Categoria,NombreProducto,Marca,Integer.parseInt(Precio));
                
                //3. Insertar en la DB la carrera
                gestion.saveCarrera(null,productos);
            
      out.write("\n");
      out.write("            <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                El Producto fue ingresado con éxito. <a href=\"GestionConsultaProductos.jsp\" class=\"alert-link\">Ver Listado de Productos</a>. \n");
      out.write("            </div>\n");
      out.write("            ");

                }
                
      out.write("\n");
      out.write("                \n");
      out.write("            <form action=\"IngresoProductos.jsp\">\n");
      out.write("          \t<button type=\"submit\" class=\"btn btn-secondary\">Regresar Menu</button>\n");
      out.write("            </form>\n");
      out.write("    </div></center>\n");
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
