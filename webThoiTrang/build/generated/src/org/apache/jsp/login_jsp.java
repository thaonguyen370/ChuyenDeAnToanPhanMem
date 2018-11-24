package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>New Shop a E-Commerce Online Shopping Category Flat Bootstrap Responsive Website Template | Login :: w3layouts</title>\n");
      out.write("<!--css-->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("<!--css-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"New Shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>\n");
      out.write("<!--search jQuery-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("<!--search jQuery-->\n");
      out.write("\n");
      out.write(" <!--mycart-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write(" <!-- cart -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- cart -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header.jsp", out, false);
      out.write("\n");
      out.write("\t\t<!--header-->\n");
      out.write("\t\t<!--banner-->\n");
      out.write("\t\t<div class=\"banner1\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<h3><a href=\"index.jsp\">Home</a> / <span>Login</span></h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<!--banner-->\n");
      out.write("\n");
      out.write("\t<!--content-->\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t<!--login-->\n");
      out.write("\t\t\t<div class=\"login\">\n");
      out.write("\t\t\t\t<div class=\"main-agileits\">\n");
      out.write("\t\t\t\t\t<div class=\"form-w3agile\">\n");
      out.write("\t\t\t\t\t\t<h3>Login To New Shop</h3>\n");
      out.write("                                                <form action=\"login?action=login\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"key\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<input  type=\"text\" value=\"Email\" name=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"key\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<input  type=\"password\" value=\"Password\" name=\"Password\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Password';}\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"forg\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"forg-left\">Forgot Password</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"registered.jsp\" class=\"forg-right\">Register</a>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<!--login-->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--content-->\n");
      out.write("\t\t<!---footer--->\n");
      out.write("\t\t\t\t\t<div class=\"footer-w3l\">\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"footer-grids\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>About </h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"social-icon\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"icon\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"icon1\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"icon2\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"icon3\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>My Account</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"checkout.jsp\">Checkout</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"registered.jsp\"> Create Account </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Information</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp\">Products</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"codes.jsp\">Short Codes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"mail.jsp\">Mail Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products1.jsp\">products1</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 footer-grid foot\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Contacts</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i><a href=\"#\">E Comertown Rd, Westby, USA</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i><a href=\"#\">1 599-033-5036</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:example@mail.com\"> example@mail.com</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!---footer--->\n");
      out.write("\t\t\t\t\t<!--copy-->\n");
      out.write("\t\t\t\t\t<div class=\"copy-section\">\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"copy-left\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>&copy; 2016 New Shop . All rights reserved | Design by <a href=\"http://w3layouts.com\">W3layouts</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"copy-right\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/card.png\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--copy-->\n");
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
