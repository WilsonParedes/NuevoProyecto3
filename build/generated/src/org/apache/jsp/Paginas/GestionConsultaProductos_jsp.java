package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modulos.Herramientas.VariablesGlobales;
import Modulos.Herramientas.GestionBDDs;
import Modulos.DataSistema.Productos;
import java.util.ArrayList;

public final class GestionConsultaProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:300,400,600|Open+Sans\" rel=\"stylesheet\"> \n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\">  \n");
      out.write("  \t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  \t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  \t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("<title>Ingreso Productos</title>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\n");
      out.write("    ");

        String nombreproductobuscar = request.getParameter("getbuscar");
        String cambiarElemento=request.getParameter("txtNombreProductoVentanaEmergente");
        
        request.getSession().setAttribute("namesession", request.getParameter("getbuscar"));
        request.getSession().setAttribute("cambiarElemento", cambiarElemento);
      
        
    
      out.write("\n");
      out.write("<figure>\n");
      out.write("\t<img src=\"Imagenes/LogoPaginaPrincipal.png\" alt =\"LogoPaginaPrincipal\" width=100% height=\"120\">\n");
      out.write("</figure>\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav id=\"navegacionPrincipal\" class=\"navbar  bg-dark navbar-dark\">\n");
      out.write("    \n");
      out.write("    <div id=\"header1\">\n");
      out.write("        \n");
      out.write("        <ul class=\"navegacionotraspaginas\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"navbar-brand\" >Navegacion Consulta de Productos</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <form class=\"form-inline\"action=\"GestionConsultaProductos.jsp\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" name =\"getbuscar\"id=\"buscar\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Buscar</button>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </li>  \n");
      out.write("            <li>\n");
      out.write("               \n");
      out.write("                <a href=\"PruebaEliminar.jsp\"><button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\" > Eliminar </button></a>\n");
      out.write("   \n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("               \n");
      out.write("                <button id=\"btn-abrir-popup\" class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\" > Modificar </button>\n");
      out.write("   \n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a class=\"nav-link\" href=\"IngresoProductos.jsp\">Ingreso Productos</a>\n");
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
      out.write("    ");

        if(cambiarElemento==null){
            
        
    
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

        if(nombreproductobuscar == null ||nombreproductobuscar==""){
                
    
      out.write("  \n");
      out.write("    <center><table id=\"TablaProductos\"class=\"table table-hover\">\n");
      out.write("        <thead class=\"thead-dark\">\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">ID </th>\n");
      out.write("                <th scope=\"col\">Nombre Producto</th>\n");
      out.write("                <th scope=\"col\">Marca</th>\n");
      out.write("                <th scope=\"col\">Categoria</th>\n");
      out.write("                <th scope=\"col\">Precio</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("         ");

            //1. Crear una instancia DAO correpondiente a las carreras
            ArrayList<Productos> productos= VariablesGlobales.gestion.getBDDProductos();
            int i=0;
            for( Productos produ: productos){
            //4. Pintar el HTML que correponde a cada carrera
             i++;
         
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">");
      out.print(i);
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(produ.getProducto());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(produ.getMarca());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(produ.getCategoria());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(produ.getPrecio());
      out.write("</th>\n");
      out.write("                <th scope=\"row\">\n");
      out.write("                    <figure>\n");
      out.write("                        <a><img src=\"Imagenes/Eliminar.png\" width=\"27\" height=\"27\"></a>                      \n");
      out.write("                    </figure>\n");
      out.write("                </th>\n");
      out.write("                <th scope=\"row\">\n");
      out.write("                    <figure>\n");
      out.write("                        <img src=\"Imagenes/Modificar.png\" width=\"27\" height=\"27\">                    \n");
      out.write("                    </figure>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("              ");
 
                  
               }
              
      out.write("              \n");
      out.write("        </tbody>\n");
      out.write("    </table></center>\n");
      out.write("    ");
  }else{
            
    
      out.write("\n");
      out.write("        <center><table id=\"TablaProductos\"class=\"table table-hover\">\n");
      out.write("        <thead class=\"thead-dark\">\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">ID </th>\n");
      out.write("                <th scope=\"col\">Nombre Producto</th>\n");
      out.write("                <th scope=\"col\">Marca</th>\n");
      out.write("                <th scope=\"col\">Categoria</th>\n");
      out.write("                <th scope=\"col\">Precio</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("         ");

            //1. Crear una instancia DAO correpondiente a las carreras
            ArrayList<Productos> productos= VariablesGlobales.gestion.busquedapreparadaProductos(nombreproductobuscar);
            int i=0;
            for( Productos produ: productos){
            //4. Pintar el HTML que correponde a cada carrera
             i++;
         
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">");
      out.print(i);
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(produ.getProducto());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(produ.getMarca());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(produ.getCategoria());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(produ.getPrecio());
      out.write("</th>\n");
      out.write("                <th scope=\"row\">\n");
      out.write("                    <figure>\n");
      out.write("                        <a href=\"PruebaEliminar.jsp\"><img src=\"Imagenes/Eliminar.png\" width=\"27\" height=\"27\"></a>                      \n");
      out.write("                    </figure>\n");
      out.write("                </th>\n");
      out.write("                <th scope=\"row\">\n");
      out.write("                    <figure id=\"btn-abrir-popupdesdelatabla\" >\n");
      out.write("                        <a href=\"#\"><img src=\"Imagenes/Modificar.png\" width=\"27\" height=\"27\"></a>                      \n");
      out.write("                    </figure>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("              ");
 
                  
               }
              
      out.write("              \n");
      out.write("        </tbody>\n");
      out.write("    </table></center>\n");
      out.write("   \n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");
}else{
           
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <center> <div class=\"container\" id=\"contenedorIngresoProductos\">\n");
      out.write("            <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                El producto fue modificado con exito. <a href=\"GestionConsultaProductos.jsp\" class=\"alert-link\">Volver Listado Productos</a>. \n");
      out.write("            </div>\n");
      out.write("        </div></center>\n");
      out.write("        ");

}
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"PaginaPrincipal.jsp\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-secondary\">Regresar</button>\n");
      out.write("        </form>\n");
      out.write("    <!-- ----------------\n");
      out.write("    VETANA EMERGENTE\n");
      out.write("    ------------------ --> \n");
      out.write("    <div class=\"overlay\" id=\"overlay\">\n");
      out.write("\t<div class=\"popup\" id=\"popup\">\n");
      out.write("            <a href=\"#\" id=\"btn-cerrar-popup\" class=\"btn-cerrar-popup\"><i class=\"fas fa-times\"></i></a>\n");
      out.write("                    <form action=\"ModificarElementosBDDProductos.jsp\">\n");
      out.write("                        <div class=\"contenedor-inputs\">\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ModificarElementosBDDProductos.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </form>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\t<script src=\"EventosVentanaEmergente.js\"></script>\n");
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
