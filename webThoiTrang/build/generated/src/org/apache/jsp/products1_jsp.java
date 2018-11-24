package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import Model.sanPham;
import ConnectToDataBase.sanPhamDao;

public final class products1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>New Shop a E-Commerce Online Shopping Category Flat Bootstrap Responsive Website Template | Products1 :: w3layouts</title>\n");
      out.write("        <!--css-->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery-ui.css\">\n");
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
      out.write("        ");

            ArrayList<sanPham> DS_hienThi = new ArrayList<sanPham>();
            sanPhamDao x = new sanPhamDao();
            int l = x.DS_SP().size();
            int pages = 3;
            ArrayList<sanPham> ss = (ArrayList<sanPham>) request.getAttribute("DSHienThi");
            //  int d=(int)request.getAttribute("pages");
            if (ss == null) {
                if (l < 8) {
                    pages = 1;
                } else {
                    pages = l / 8;
                    if (l % 8 != 0) {
                        pages += 1;
                    }
                }

                for (int j = 0; j < 8; j++) {
                    DS_hienThi.add(x.DS_SP().get(j));
                }

            } else {
                DS_hienThi.clear();
                // pages=(int)request.getAttribute("pages");
                for (sanPham y : ss) {
                    DS_hienThi.add(y);
                }
                if (l < 8) {
                    pages = 1;
                } else {
                    pages = l / 8;
                    if (l % 8 != 0) {
                        pages += 1;
                    }
                }
            }

        
      out.write("\n");
      out.write("\n");
      out.write("        <!--header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header.jsp", out, false);
      out.write("\n");
      out.write("            <!--header-->\n");
      out.write("            <!--banner-->\n");
      out.write("            <div class=\"banner1\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h3><a href=\"index.jsp\">Home</a> / <span>Products</span></h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--banner-->\n");
      out.write("            <!--content-->\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"products-agileinfo\">\n");
      out.write("                    <h2 class=\"tittle\">Men's Wear</h2>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"product-agileinfo-grids w3l\">\n");
      out.write("                            <div class=\"col-md-3 product-agileinfo-grid\">\n");
      out.write("                                <div class=\"categories\">\n");
      out.write("                                    <h3>Categories</h3>\n");
      out.write("                                    <ul class=\"tree-list-pad\">\n");
      out.write("                                        <li><input type=\"checkbox\" checked=\"checked\" id=\"item-0\" /><label for=\"item-0\"><span></span>Men's Wear</label>\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li><input type=\"checkbox\" id=\"item-0-0\" /><label for=\"item-0-0\">Ethnic Wear</label>\n");
      out.write("                                                    <ul>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shirts</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Caps</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shoes</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Pants</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">SunGlasses</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Trousers</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li><input type=\"checkbox\"  id=\"item-0-1\" /><label for=\"item-0-1\">Party Wear</label>\n");
      out.write("                                                    <ul>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shirts</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Caps</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shoes</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Pants</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">SunGlasses</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Trousers</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li><input type=\"checkbox\"  id=\"item-0-2\" /><label for=\"item-0-2\">Casual Wear</label>\n");
      out.write("                                                    <ul>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shirts</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Caps</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shoes</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Pants</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">SunGlasses</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Trousers</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><input type=\"checkbox\" id=\"item-1\" checked=\"checked\" /><label for=\"item-1\">Best Collections</label>\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li><input type=\"checkbox\" checked=\"checked\" id=\"item-1-0\" /><label for=\"item-1-0\">New Arrivals</label>\n");
      out.write("                                                    <ul>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shirts</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shoes</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Pants</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">SunGlasses</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </li>\n");
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><input type=\"checkbox\" checked=\"checked\" id=\"item-2\" /><label for=\"item-2\">Best Offers</label>\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li><input type=\"checkbox\"  id=\"item-2-0\" /><label for=\"item-2-0\">Summer Discount Sales</label>\n");
      out.write("                                                    <ul>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shirts</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shoes</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Pants</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">SunGlasses</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li><input type=\"checkbox\" id=\"item-2-1\" /><label for=\"item-2-1\">Exciting Offers</label>\n");
      out.write("                                                    <ul>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shirts</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shoes</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Pants</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">SunGlasses</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li><input type=\"checkbox\" id=\"item-2-2\" /><label for=\"item-2-2\">Flat Discounts</label>\n");
      out.write("                                                    <ul>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shirts</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Shoes</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">Pants</a></li>\n");
      out.write("                                                        <li><a href=\"products.jsp\">SunGlasses</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"price\">\n");
      out.write("                                    <h3>Price Range</h3>\n");
      out.write("                                    <ul class=\"dropdown-menu6\">\n");
      out.write("                                        <li>                \n");
      out.write("                                            <div id=\"slider-range\"></div>\t\t\t\t\t\t\t\n");
      out.write("                                            <input type=\"text\" id=\"amount\" style=\"border: 0; color: #ffffff; font-weight: normal;\" />\n");
      out.write("                                        </li>\t\t\t\n");
      out.write("                                    </ul>\n");
      out.write("                                    <script type='text/javascript'>//<![CDATA[ \n");
      out.write("                                        $(window).load(function () {\n");
      out.write("                                            $(\"#slider-range\").slider({\n");
      out.write("                                                range: true,\n");
      out.write("                                                min: 0,\n");
      out.write("                                                max: 9000,\n");
      out.write("                                                values: [1000, 7000],\n");
      out.write("                                                slide: function (event, ui) {\n");
      out.write("                                                    $(\"#amount\").val(\"$\" + ui.values[ 0 ] + \" - $\" + ui.values[ 1 ]);\n");
      out.write("                                                }\n");
      out.write("                                            });\n");
      out.write("                                            $(\"#amount\").val(\"$\" + $(\"#slider-range\").slider(\"values\", 0) + \" - $\" + $(\"#slider-range\").slider(\"values\", 1));\n");
      out.write("\n");
      out.write("                                        });//]]>  \n");
      out.write("\n");
      out.write("                                    </script>\n");
      out.write("                                    <script type=\"text/javascript\" src=\"js/jquery-ui.js\"></script>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"top-rates\">\n");
      out.write("                                    <h3>Top Rates products</h3>\n");
      out.write("                                    <div class=\"recent-grids\">\n");
      out.write("                                        <div class=\"recent-left\">\n");
      out.write("                                            <a href=\"single.jsp\"><img class=\"img-responsive \" src=\"images/r.jpg\" alt=\"\"></a>\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"recent-right\">\n");
      out.write("                                            <h6 class=\"best2\"><a href=\"single.jsp\">Lorem ipsum dolor </a></h6>\n");
      out.write("                                            <p><del>$100.00</del> <em class=\"item_price\">$09.00</em></p>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        <div class=\"clearfix\"> </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"recent-grids\">\n");
      out.write("                                        <div class=\"recent-left\">\n");
      out.write("                                            <a href=\"single.jsp\"><img class=\"img-responsive \" src=\"images/r1.jpg\" alt=\"\"></a>\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"recent-right\">\n");
      out.write("                                            <h6 class=\"best2\"><a href=\"single.jsp\">Duis aute irure </a></h6>\n");
      out.write("                                            <p><del>$100.00</del> <em class=\"item_price\">$19.00</em></p>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        <div class=\"clearfix\"> </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"recent-grids\">\n");
      out.write("                                        <div class=\"recent-left\">\n");
      out.write("                                            <a href=\"single.jsp\"><img class=\"img-responsive \" src=\"images/r2.jpg\" alt=\"\"></a>\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"recent-right\">\n");
      out.write("                                            <h6 class=\"best2\"><a href=\"single.jsp\">Lorem ipsum dolor </a></h6>\n");
      out.write("                                            <p><del>$100.00</del> <em class=\"item_price\">$39.00</em></p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"> </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"recent-grids\">\n");
      out.write("                                        <div class=\"recent-left\">\n");
      out.write("                                            <a href=\"single.jsp\"><img class=\"img-responsive \" src=\"images/r3.jpg\" alt=\"\"></a>\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"recent-right\">\n");
      out.write("                                            <h6 class=\"best2\"><a href=\"single.jsp\">Ut enim ad minim </a></h6>\n");
      out.write("                                            <p><em class=\"item_price\">$39.00</em></p>\n");
      out.write("                                        </div>\t\n");
      out.write("                                        <div class=\"clearfix\"> </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"brand-w3l\">\n");
      out.write("                                    <h3>Brands Filter</h3>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\">Ralph Lauren</a></li>\n");
      out.write("                                        <li><a href=\"#\">adidas</a></li>\n");
      out.write("                                        <li><a href=\"#\">Bottega Veneta</a></li>\n");
      out.write("                                        <li><a href=\"#\">Valentino</a></li>\n");
      out.write("                                        <li><a href=\"#\">Nike</a></li>\n");
      out.write("                                        <li><a href=\"#\">Burberry</a></li>\n");
      out.write("                                        <li><a href=\"#\">Michael Kors</a></li>\n");
      out.write("                                        <li><a href=\"#\">Louis Vuitton</a></li>\n");
      out.write("                                        <li><a href=\"#\">Jimmy Choo</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"cat-img\">\n");
      out.write("                                    <img class=\"img-responsive \" src=\"images/45.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-9 product-agileinfon-grid1\">\n");
      out.write("                                <div class=\"product-agileinfon-top\">\n");
      out.write("                                    <div class=\"col-md-6 product-agileinfon-top-left\">\n");
      out.write("                                        <img class=\"img-responsive \" src=\"images/img3.jpg\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6 product-agileinfon-top-left\">\n");
      out.write("                                        <img class=\"img-responsive \" src=\"images/img4.jpg\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mens-toolbar\">\n");
      out.write("                                    <p >Showing 1–8 of 21 results</p>\n");
      out.write("                                    <p class=\"showing\">Sorting By\n");
      out.write("                                        <select>\n");
      out.write("                                            <option value=\"\"> Name</option>\n");
      out.write("                                            <option value=\"\">  Rate</option>\n");
      out.write("                                            <option value=\"\"> Color </option>\n");
      out.write("                                            <option value=\"\"> Price </option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </p> \n");
      out.write("                                    <p>Show\n");
      out.write("                                        <select>\n");
      out.write("                                            <option value=\"\"> 8</option>\n");
      out.write("                                            <option value=\"\"> 9</option>\n");
      out.write("                                            <option value=\"\"> 10 </option>\n");
      out.write("                                            <option value=\"\"> 11 </option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"clearfix\"></div>\t\t\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"bs-example bs-example-tabs\" role=\"tabpanel\" data-example-id=\"togglable-tabs\">\n");
      out.write("                                    <ul id=\"myTab\" class=\"nav1 nav1-tabs left-tab\" role=\"tablist\">\n");
      out.write("                                        <ul id=\"myTab\" class=\"nav nav-tabs left-tab\" role=\"tablist\">\n");
      out.write("                                            <li role=\"presentation\" class=\"active\"><a href=\"#home\" id=\"home-tab\" role=\"tab\" data-toggle=\"tab\" aria-controls=\"home\" aria-expanded=\"true\"><img src=\"images/menu1.png\"></a></li>\n");
      out.write("                                            <li role=\"presentation\"><a href=\"#profile\" role=\"tab\" id=\"profile-tab\" data-toggle=\"tab\" aria-controls=\"profile\"><img src=\"images/menu.png\"></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("                                            <div role=\"tabpanel\" class=\"tab-pane fade in active\" id=\"home\" aria-labelledby=\"home-tab\">\n");
      out.write("                                                <div class=\"product-tab\">\n");
      out.write("                                                ");
for (sanPham vv : DS_hienThi) {
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"col-md-4 product-tab-grid simpleCart_shelfItem\">\n");
      out.write("                                                    <div class=\"grid-arr\">\n");
      out.write("                                                        <div  class=\"grid-arrival\">\n");
      out.write("                                                            <figure>\t\t\n");
      out.write("                                                                <a href=\"#\" class=\"new-gri\" data-toggle=\"modal\" data-target=\"#myModal1\">\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img  src=");
      out.print(vv.getAnhTruoc());
      out.write("  class=\"img-responsive\" alt=\"\" style=\"width: 300; height: 400\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"grid-img\">\n");
      out.write("                                                                        <img src=");
      out.print(vv.getAnhSau());
      out.write("  class=\"img-responsive\"  alt=\"\" style=\"width: 300; height: 400\">\n");
      out.write("                                                                    </div>\t\t\t\n");
      out.write("                                                                </a>\t\t\n");
      out.write("                                                            </figure>\t\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"block\">\n");
      out.write("                                                            <div class=\"starbox small ghosting\"> </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"women\">\n");
      out.write("                                                            <h6><a href=\"single.jsp\">S");
      out.print(vv.getTen());
      out.write("</a></h6>\n");
      out.write("                                                            <span class=\"size\">size: ");
      out.print(vv.getSize());
      out.write(" </span>\n");
      out.write("                                                            <p ><del>$");
      out.print(vv.getGiaCu());
      out.write("</del><em class=\"item_price\">$");
      out.print(vv.getGiaMoi());
      out.write("</em></p>\n");
      out.write("                                                            <a href=\"gioHang?maHang=");
      out.print(vv.getMa());
      out.write("&tenHang=");
      out.print(vv.getTen());
      out.write("\" data-text=\"Add To Cart\" class=\"my-cart-b item_add\">Add To Cart</a>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!--\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-tab prod1\">\n");
      out.write("                                                                                                                                            <div class=\"col-md-4 product-tab-grid simpleCart_shelfItem\">\n");
      out.write("                                                                                                         <div class=\"clearfix\"></div>\n");
      out.write("                                                                                                                                    </div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <nav aria-label=\"Page navigation example\">\n");
      out.write("                                                <ul class=\"pagination\">\n");
      out.write("                                                    <li class=\"page-item\"><a class=\"page-link\" href=\"phanTrang?pageid=");
      out.print(request.getAttribute("previous"));
      out.write("\">Previous</a></li>\n");
      out.write("                                                        ");
  for (int i = 1; i <= pages; i++) {
      out.write("\n");
      out.write("\n");
      out.write("                                                    <li class=\"page-item\"><a class=\"page-link\" href=\"phanTrang?pageid=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("                                                        ");
}
      out.write("\n");
      out.write("                                                    <li class=\"page-item\"><a class=\"page-link\" href=\"phanTrang?pageid=");
      out.print(request.getAttribute("next"));
      out.write("\">Next</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </nav>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div role=\"tabpanel\" class=\"tab-pane fade\" id=\"profile\" aria-labelledby=\"profile-tab\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--content-->\n");
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
