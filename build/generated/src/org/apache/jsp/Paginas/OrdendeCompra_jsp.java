package org.apache.jsp.Paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modulos.Herramientas.VariablesGlobales;
import Modulos.Herramientas.*;
import Modulos.DataSistema.Productos;
import Modulos.DataSistema.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public final class OrdendeCompra_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Orden de Compra</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<figure>\n");
      out.write("\t<img src=\"Imagenes/LogoPaginaPrincipal.png\" alt =\"LogoPaginaPrincipal\" width=100% height=\"120\">\n");
      out.write("</figure>\n");
      out.write("<nav id=\"navegacionPrincipal\" class=\"navbar  bg-dark navbar-dark\">\n");
      out.write("    <div id=\"header1\">\n");
      out.write("        <ul class=\"navegacionotraspaginas\">\n");
      out.write("            <li>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Navegacion Orden de Compra</a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            <li>\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Ver Listado de Compras</a> \n");
      out.write("            </li>  \n");
      out.write("            <li>\n");
      out.write("                <a class=\"nav-link\" href=\"PaginaPrincipal.jsp\">Regresar</a>\n");
      out.write("            </li> \n");
      out.write("        </ul>\n");
      out.write("    </div>  \n");
      out.write("</nav>\n");
      out.write("<br>\n");

    String idcliente=request.getParameter("txtnitclienteorden");
    String idproducto = request.getParameter("idproducto");
    String metodoenvio = request.getParameter("listaenvio");
    String precioenvio = request.getParameter("txtPrecio");
    String diasenvio = request.getParameter("txtdiasenvio");
    String cantidadenvio = request.getParameter("txtCantidad");


      out.write("\n");
      out.write("            \n");
      out.write("        ");

        if(idcliente !=null && idproducto !=null ){
        
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"container\" id=\"contenedorOrdendeCompra\">\n");
      out.write("  \n");
      out.write("        <form action=\"OrdendeCompra.jsp\" class=\"was-validated\" id=\"TablaPrincipalIngresoClientes\" autocomplete=\"off\"method=\"POST\">\n");
      out.write("            <div>\n");
      out.write("            <input type=\"text\" name=\"txtnitclienteorden\" id =\"txtnitclienteorden\" width=\"10%\" placeholder=\"Ingrese Nit de Cliente\" required autofocus>\n");
      out.write("      \t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("\n");
      out.write("            <input type=\"text\" name=\"idproducto\" id =\"idproducto\" width=\"30\" placeholder=\"Ingrese Nombre Producto\"required>\n");
      out.write("      \t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("            </div>\n");
      out.write("            <br><br><br>\n");
      out.write("            <center><div >\n");
      out.write("                  <input type=\"text\" id=\"Categoria\" name=\"Categoria\" list=\"listaenvio\" placeholder=\"Seleccione\" autocomplete=\"off\" > \n");
      out.write("                    <datalist id=\"listaenvio\"> \n");
      out.write("                        <option value=\"Aereo\"> \n");
      out.write("                        <option value=\"Terrestre\">  \n");
      out.write("                    </datalist>\n");
      out.write("                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("                <input type =\"number\" min=\"1\" max=\"160000\"  name=\"txtPrecio\" id =\"txtPrecio\" placeholder=\"Precio Envío\" width=\"40\" required>\n");
      out.write("                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type =\"number\" min=\"1\" max=\"160000\"  name=\"txtdiasenvio\" id =\"txtdiasenvio\" placeholder=\"Días envio\" width=\"40\" required>\n");
      out.write("                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type =\"number\" min=\"1\" max=\"160000\"  name=\"txtCantidad\" id =\"txtCantidad\" placeholder=\"Cantida del producto\" width=\"40\" required>\n");
      out.write("                </div></center>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("         <div>\n");
      out.write("            <lable> ");
      out.print( idcliente);
      out.write(" </lable> \n");
      out.write("            <lable> ");
      out.print( idproducto);
      out.write(" </lable> \n");
      out.write("        </div>\n");
      out.write("        <br><br><br>\n");
      out.write("        <center><div >\n");
      out.write("                <label>");
      out.print( metodoenvio);
      out.write("</label>\n");
      out.write("                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("                <label>");
      out.print( precioenvio);
      out.write("</label>\n");
      out.write("                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <label>");
      out.print( diasenvio);
      out.write("</label>\n");
      out.write("                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <label>");
      out.print( cantidadenvio);
      out.write("</label>\n");
      out.write("                </div></center>\n");
      out.write("           \n");
      out.write("        <center><table id=\"TablaClientes\"class=\"table table-hover\">\n");
      out.write("        <thead class=\"thead-dark\">\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">ID</th>\n");
      out.write("                <th scope=\"col\">Producto</th>\n");
      out.write("                <th scope=\"col\">Marca</th>\n");
      out.write("                <th scope=\"col\">Cantidad</th>\n");
      out.write("                <th scope=\"col\">Precio</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("         ");

            //1. Crear una instancia DAO correpondiente a las carreras
     
            ArrayList<Productos> producto = VariablesGlobales.gestion.busquedapreparadaProductos(idproducto);
            int i=0;
            for( Productos produ : producto){
            //4. Pintar el HTML que correponde a cada carrera
             i++;
             
         
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">");
      out.print(i);
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print( produ.getProducto());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print( produ.getMarca());
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print(cantidadenvio );
      out.write("</th>\n");
      out.write("                <th scope=\"col\">");
      out.print( produ.getPrecio());
      out.write("</th>\n");
      out.write("                \n");
      out.write("              ");
 
               }             
      out.write("              \n");
      out.write("        </tbody>\n");
      out.write("    </table></center> \n");
      out.write("        \n");
      out.write("          \n");
      out.write("    ");

    
    }
    
      out.write("\n");
      out.write(" <div class=\"form-group\">\n");
      out.write("                <center><button type=\"submit\" onclick=\"Grabar\" class=\"btn btn-outline-success\" name=\"Boton_Entrar_Principal\" id=\"Boton_Entrar_Principal\" >Generar</button></center>\n");
      out.write("            </div>\n");
      out.write("             </form> \n");
      out.write("        \n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("          <form action=\"OrdendeCompra.jsp\">\n");
      out.write("          \t<button type=\"submit\" class=\"btn btn-secondary\">Regresar Menu</button>\n");
      out.write("            </form>\n");
      out.write("  \n");
      out.write("          \n");
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
