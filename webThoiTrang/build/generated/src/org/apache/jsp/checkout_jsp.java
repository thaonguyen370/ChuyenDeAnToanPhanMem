package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.gioHang_sp;
import java.util.ArrayList;
import Model.sanPham;
import Model.sanPham;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>New ShopS a E-Commerce Online Shopping Category Flat Bootstrap Responsive Website Template | Checkout :: w3layouts</title>\n");
      out.write("        <!--css-->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <!--css-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"New Shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--search jQuery-->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <!--search jQuery-->\n");
      out.write("\n");
      out.write("        <!--mycart-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("        <!-- cart -->\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("        <!-- cart -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header.jsp", out, false);
      out.write("\n");
      out.write("            <!--header-->\n");
      out.write("            <!--banner-->\n");
      out.write("            <div class=\"banner1\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h3><a href=\"index.jsp\">Home</a> / <span>Checkout</span></h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--banner-->\n");
      out.write("\n");
      out.write("            <!--content-->\n");
      out.write("        ");
ArrayList<gioHang_sp> list_sp = new ArrayList<gioHang_sp>();
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"cart-items\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h2>Danh sách giỏ hàng");

                        ArrayList<gioHang_sp> list1 = (ArrayList<gioHang_sp>) session.getAttribute("gioHang");
                        list_sp.clear();
                        if (list1 != null) {
                            for (gioHang_sp x : list1) {
                                list_sp.add(x);
                            }

                        }
                        out.println("(" + list_sp.size() + ")");
                        
      out.write("</h2>\n");
      out.write("                    <!--                                        <script>$(document).ready(function (c) {\n");
      out.write("                                                                    $('.close1').on('click', function (c) {\n");
      out.write("                                                                        $('.cart-header').fadeOut('slow', function (c) {\n");
      out.write("                                                                            $('.cart-header').remove();\n");
      out.write("                                                                        });\n");
      out.write("                                                                    });\n");
      out.write("                                                                });\n");
      out.write("                                                            </script>-->\n");
      out.write("                    ");

                        for (int i = 0; i < list_sp.size(); i++) {
      out.write("\n");
      out.write("                    <div class=\"cart-header\">\n");
      out.write("                        <div class=\"close1\"><a href=\"gioHang?maXoa=");
      out.print(list_sp.get(i).getMa());
      out.write("&emailXoa=");
      out.print(list_sp.get(i).getEmail());
      out.write("&ghiChuXoa=");
      out.print(list_sp.get(i).getGhiChu());
      out.write("\">------</a></div>\n");
      out.write("                        <div class=\"cart-sec simpleCart_shelfItem\">\n");
      out.write("                            <div class=\"cart-item cyc\">\n");
      out.write("                                <img src=\"");
      out.print(list_sp.get(i).getAnhTruoc());
      out.write("\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cart-item-info\">\n");
      out.write("                                <h3><a href=\"#\"> xem thông tin chi tiết </a><span>Mã: ");
      out.print(list_sp.get(i).getMa());
      out.write("</span></h3>\n");
      out.write("                                <ul class=\"qty\">\n");
      out.write("                                    <li><p>Tên sản phẩm:</p></li>\n");
      out.write("                                    <li><p> ");
      out.print(list_sp.get(i).getTen());
      out.write("</p></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"delivery\">\n");
      out.write("                                    <p>giá : $ ");
      out.print(list_sp.get(i).getGiaMoi());
      out.write("</p>\n");
      out.write("                                    <span>Thời gian mua:  ");
      out.print(list_sp.get(i).getThoiGianMua());
      out.write("</span>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\t\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <h1 style=\"text-align: center; color: blue\">Nhập thêm thông tin</h1><br/>\n");
      out.write("                    <form action=\"thanhToanHang?action=thanhToan\" style=\"text-align: center\" >\n");
      out.write("                        Tên người nhận:<input type=\"text\" name=\"TenNguoiNhan\" style=\"margin-right: 30px\"/>\n");
      out.write("                        Địa chỉ:<input type=\"text\" name=\"diaChi\" style=\"margin-right: 30px\"/>\n");
      out.write("                        Thời Gian nhận hàng:<input type=\"date\" name=\"ThoiGianNhan\"style=\"margin-right: 30px\"/>\n");
      out.write("                       Sô ĐT:<input type=\"text\" name=\"SODT\"/><br/>\n");
      out.write("                       <input type=\"submit\" value=\"Thanh Toán\" style=\"margin-top: 50px\"/>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- checkout -->\t\n");
      out.write("        </div>\n");
      out.write("        <!---footer--->\n");
      out.write("        <div class=\"footer-w3l\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"footer-grids\">\n");
      out.write("                    <div class=\"col-md-3 footer-grid\">\n");
      out.write("                        <h4>About </h4>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>\n");
      out.write("                        <div class=\"social-icon\">\n");
      out.write("                            <a href=\"#\"><i class=\"icon\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"icon1\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"icon2\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"icon3\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 footer-grid\">\n");
      out.write("                        <h4>My Account</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"checkout.jsp\">Checkout</a></li>\n");
      out.write("                            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                            <li><a href=\"registered.jsp\"> Create Account </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 footer-grid\">\n");
      out.write("                        <h4>Information</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"products.jsp\">Products</a></li>\n");
      out.write("                            <li><a href=\"codes.jsp\">Short Codes</a></li>\n");
      out.write("                            <li><a href=\"mail.jsp\">Mail Us</a></li>\n");
      out.write("                            <li><a href=\"products1.jsp\">products1</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 footer-grid foot\">\n");
      out.write("                        <h4>Contacts</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i><a href=\"#\">E Comertown Rd, Westby, USA</a></li>\n");
      out.write("                            <li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i><a href=\"#\">1 599-033-5036</a></li>\n");
      out.write("                            <li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:example@mail.com\"> example@mail.com</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!---footer--->\n");
      out.write("        <!--copy-->\n");
      out.write("        <div class=\"copy-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"copy-left\">\n");
      out.write("                    <p>&copy; 2016 New Shop . All rights reserved | Design by <a href=\"http://w3layouts.com\">W3layouts</a></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"copy-right\">\n");
      out.write("                    <img src=\"images/card.png\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--copy-->\n");
      out.write("\n");
      out.write("    </body>\n");
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
