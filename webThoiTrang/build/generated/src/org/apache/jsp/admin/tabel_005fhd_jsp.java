package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tabel_005fhd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin MOS Template</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"description\" content=\"Admin MOS Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"Admin Page\">\n");
      out.write("        <meta name=\"author\" content=\"Ari Rusmanto\">\n");
      out.write("        <meta name=\"language\" content=\"Bahasa Indonesia\">\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"stylesheet/img/devil-icon.png\"> <!--Pemanggilan gambar favicon-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"mos-css/mos-style.css\"> <!--pemanggilan file css-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div class=\"inHeader\">\n");
      out.write("                <div class=\"mosAdmin\">\n");
      out.write("                    Hallo, Mas Administrator<br>\n");
      out.write("                    <a href=\"\">Lihat website</a> | <a href=\"\">Help</a> | <a href=\"login.jsp\">Keluar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div id=\"leftBar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Trang chủ</a></li>\n");
      out.write("                    <li><a href=\"tabel_dm.jsp\">Danh Mục</a></li>\n");
      out.write("                    <li><a href=\"tabel_sp.jsp\">Sản Phẩm</a></li>\n");
      out.write("                    <li><a href=\"tabel_hd.jsp\">Hóa Đơn</a></li>\n");
      out.write("                    <li><a href=\"form.jsp\">xxxx</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"rightContent\">\n");
      out.write("                <h3>Quản lí hóa đơn</h3>\n");
      out.write("                <table class=\"data\">\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <th class=\"data\" width=\"30px\">số TT</th>\n");
      out.write("                        <th class=\"data\">email</th>\n");
      out.write("                        <th class=\"data\">Địa chỉ nhận hàng</th>\n");
      out.write("                        <th class=\"data\">số điện thoại</th>\n");
      out.write("                        <th class=\"data\" >ngày nhận</th>\n");
      out.write("                        <th class=\"data\" >tổng tiền</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">số TT</th>\n");
      out.write("                        <td class=\"data\">email</th>\n");
      out.write("                        <td class=\"data\">Địa chỉ nhận hàng</th>\n");
      out.write("                        <td class=\"data\">số điện thoại</th>\n");
      out.write("                        <td class=\"data\" >ngày nhận</th>\n");
      out.write("                        <td class=\"data\" >tổng tiền</th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                &copy; 2012 MOS css template | <a href=\"#\">Nama Website Anda</a> | design <a href=\"http://arirusmanto.com\" target=\"_blank\">arirusmanto.com</a><br>\n");
      out.write("                redesign <a href=\"#\">Tulis nama anda disini</a> | Silahkan baca <a href=\"lisensi.txt\" target=\"_blank\">Lisensi</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
