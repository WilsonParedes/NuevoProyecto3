package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write(" \t<meta http-equiv=\"Expires\" content=\"0\">\n");
      out.write(" \t<meta http-equiv=\"Last-Modified\" content=\"0\">\n");
      out.write(" \t<meta http-equiv=\"Cache-Control\" content=\"no-cache, mustrevalidate\">\n");
      out.write("  \t<meta http-equiv=\"Pragma\" content=\"no-cache\">\n");
      out.write("\t<link rel=\"stylesheet\"  href=\"Estilos.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  \t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  \t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  \t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("<title>Pagina Principal</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body> \n");
      out.write("\n");
      out.write("\t\n");
      out.write("<section>\n");
      out.write("<div id=\"DivPrincipal\">\n");
      out.write("\t<header id=\"CabeceraPaginaPrincipal\">\n");
      out.write("\t<figure id=\"IMGLogoPrincipal\">\n");
      out.write("        <img src=\"Imagenes/LogoAutoPartes.png\" width=\"260\" height=\"150\">\n");
      out.write("    </figure>\n");
      out.write("    </header>\t\n");
      out.write("    <div class=\"container\" id=\"contenedorprincipal\" >\n");
      out.write("    <figure id=\"IMGLoginPaginaPrincipal\">\n");
      out.write("        <img src=\"Imagenes/Login.png\" width=\"100\" height=\"100\">\n");
      out.write("    </figure>\n");
      out.write("  \t\t<form action=\"GestionIngresoPrincipal.jsp\" class=\"was-validated\" id=\"TablaPrincipal\">\n");
      out.write("    \t\t<div class=\"form-group\">\n");
      out.write("      \t\t\t<input pattern=\"[A-Za-Z]{6}\" class=\"form-control\" maxlength=\"6\" name=\"txtUsuario\" id =\"txtUsuario\" placeholder=\"Inrese Usuario\" required>\n");
      out.write("      \t\t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t\t<div class=\"invalid-feedback\">complete el campo.</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t\t<br>\n");
      out.write("    \t\t\t<div class=\"form-group\">\n");
      out.write("      \t\t\t<input type=\"password\" class=\"form-control\" name=\"txtContra\" id=\"txtContra\" placeholder=\"Ingrese Contrasenia\" required>\n");
      out.write("      \t\t\t<div class=\"valid-feedback\">Valido.</div>\n");
      out.write("      \t\t\t<div class=\"invalid-feedback\">Complete el campo.</div>\n");
      out.write("   \t\t\t </div> \n");
      out.write("   \t\t\t <div>\n");
      out.write("   \t\t\t \t<button type=\"submit\" class=\"btn btn-outline-success\" name=\"Boton_Entrar_Principal\" id=\"Boton_Entrar_Principal\" >Ingresar</button>\n");
      out.write("   \t\t\t </div>\n");
      out.write(" \t\t </form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
