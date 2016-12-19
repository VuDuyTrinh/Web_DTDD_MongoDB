package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DSLoaiSP.LoaiSP;
import Model.sanpham;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            LoaiSP x = new LoaiSP();

            for (sanpham y : x.DSloaisp()) {
        
      out.write("\n");
      out.write("        ");
      out.print(y.getTenloai());
      out.write("\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div id=\"welcomeLine\" class=\"row\">\n");
      out.write("                    <div class=\"span6\">Welcome!<strong> User</strong></div>\n");
      out.write("                    <div class=\"span6\">\n");
      out.write("                        <div class=\"pull-right\">\n");
      out.write("                            <a href=\"product_summary.html\"><span class=\"\">Fr</span></a>\n");
      out.write("                            <a href=\"product_summary.html\"><span class=\"\">Es</span></a>\n");
      out.write("                            <span class=\"btn btn-mini\">En</span>\n");
      out.write("                            <a href=\"product_summary.html\"><span>&pound;</span></a>\n");
      out.write("                            <span class=\"btn btn-mini\">$155.00</span>\n");
      out.write("                            <a href=\"product_summary.html\"><span class=\"\">$</span></a>\n");
      out.write("                            <a href=\"product_summary.html\"><span class=\"btn btn-mini btn-primary\"><i class=\"icon-shopping-cart icon-white\"></i> [ 3 ] Itemes in your cart </span> </a> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Navbar ================================================== -->\n");
      out.write("                <div id=\"logoArea\" class=\"navbar\">\n");
      out.write("                    <a id=\"smallScreen\" data-target=\"#topMenu\" data-toggle=\"collapse\" class=\"btn btn-navbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"navbar-inner\">\n");
      out.write("                        <a class=\"brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"Bootsshop\"/></a>\n");
      out.write("                        <form class=\"form-inline navbar-search\" method=\"post\" action=\"products.html\" >\n");
      out.write("                            <input id=\"srchFld\" class=\"srchTxt\" type=\"text\" />\n");
      out.write("                            <select class=\"srchTxt\">\n");
      out.write("                                <option>All</option>\n");
      out.write("                                <option>CLOTHES </option>\n");
      out.write("                                <option>FOOD AND BEVERAGES </option>\n");
      out.write("                                <option>HEALTH & BEAUTY </option>\n");
      out.write("                                <option>SPORTS & LEISURE </option>\n");
      out.write("                                <option>BOOKS & ENTERTAINMENTS </option>\n");
      out.write("                            </select> \n");
      out.write("                            <button type=\"submit\" id=\"submitButton\" class=\"btn btn-primary\">Go</button>\n");
      out.write("                        </form>\n");
      out.write("                        <ul id=\"topMenu\" class=\"nav pull-right\">\n");
      out.write("                            <li class=\"\"><a href=\"special_offer.html\">Specials Offer</a></li>\n");
      out.write("                            <li class=\"\"><a href=\"normal.html\">Delivery</a></li>\n");
      out.write("                            <li class=\"\"><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                            <li class=\"\">\n");
      out.write("                                <a href=\"#login\" role=\"button\" data-toggle=\"modal\" style=\"padding-right:0\"><span class=\"btn btn-large btn-success\">Login</span></a>\n");
      out.write("                                <div id=\"login\" class=\"modal hide fade in\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"login\" aria-hidden=\"false\" >\n");
      out.write("                                    <div class=\"modal-header\">\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("                                        <h3>Login Block</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        <form class=\"form-horizontal loginFrm\">\n");
      out.write("                                            <div class=\"control-group\">\t\t\t\t\t\t\t\t\n");
      out.write("                                                <input type=\"text\" id=\"inputEmail\" placeholder=\"Email\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"control-group\">\n");
      out.write("                                                <input type=\"password\" id=\"inputPassword\" placeholder=\"Password\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"control-group\">\n");
      out.write("                                                <label class=\"checkbox\">\n");
      out.write("                                                    <input type=\"checkbox\"> Remember me\n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\t\t\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-success\">Sign in</button>\n");
      out.write("                                        <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Close</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
