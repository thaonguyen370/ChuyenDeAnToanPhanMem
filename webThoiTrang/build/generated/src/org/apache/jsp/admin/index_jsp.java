package org.apache.jsp.admin;

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
      out.write("<head>\n");
      out.write("<title>Admin MOS Template</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"description\" content=\"Admin MOS Template\">\n");
      out.write("<meta name=\"keywords\" content=\"Admin Page\">\n");
      out.write("<meta name=\"author\" content=\"Ari Rusmanto\">\n");
      out.write("<meta name=\"language\" content=\"Bahasa Indonesia\">\n");
      out.write("\n");
      out.write("<link rel=\"shortcut icon\" href=\"stylesheet/img/devil-icon.png\"> <!--Pemanggilan gambar favicon-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"mos-css/mos-style.css\"> <!--pemanggilan file css-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div class=\"inHeader\">\n");
      out.write("\t\t<div class=\"mosAdmin\">\n");
      out.write("\t\tHallo, Mas Administrator<br>\n");
      out.write("\t\t<a href=\"\">Lihat website</a> | <a href=\"\">Help</a> | <a href=\"login.jsp\">Keluar</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\t<div id=\"leftBar\">\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li><a href=\"index.jsp\">Trang chủ</a></li>\n");
      out.write("\t\t<li><a href=\"tabel_dm.jsp\">Danh Mục</a></li>\n");
      out.write("\t\t<li><a href=\"tabel_sp.jsp\">Sản Phẩm</a></li>\n");
      out.write("                <li><a href=\"tabel_hd.jsp\">Hóa Đơn</a></li>\n");
      out.write("                <li><a href=\"form.jsp\">xxxx</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"rightContent\">\n");
      out.write("\t<h3>Trang Chủ</h3>\n");
      out.write("\t<div class=\"quoteOfDay\">\n");
      out.write("\t<b>Quote of the day :</b><br>\n");
      out.write("\t<i style=\"color: #5b5b5b;\">\"If you think you can, you really can\"</i>\n");
      out.write("\t</div>\n");
      out.write("\t\t<div class=\"shortcutHome\">\n");
      out.write("\t\t<a href=\"\"><img src=\"mos-css/img/posting.png\"><br>Tambah Posting</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"shortcutHome\">\n");
      out.write("\t\t<a href=\"\"><img src=\"mos-css/img/photo.png\"><br>Upload Foto</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"shortcutHome\">\n");
      out.write("\t\t<a href=\"\"><img src=\"mos-css/img/halaman.png\"><br>Tambah Halaman</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"shortcutHome\">\n");
      out.write("\t\t<a href=\"\"><img src=\"mos-css/img/template.png\"><br>Pengaturan Template</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"shortcutHome\">\n");
      out.write("\t\t<a href=\"\"><img src=\"mos-css/img/quote.png\"><br>Tambah QOD</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"shortcutHome\">\n");
      out.write("\t\t<a href=\"\"><img src=\"mos-css/img/bukutamu.png\"><br>Data Buku Tamu</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"smallRight\"><h3>Informasi web anda</h3>\n");
      out.write("\t\t<table style=\"border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;\">\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Jumlah posting</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Jumlah kategori</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Jumlah komentar diterbitkan</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Jumlah komentar belum diterbitkan</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Jumlah foto dalam galeri</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Jumlah data buku tamu</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"smallRight\"><h3>Statistik pengunjung web</h3>\n");
      out.write("\t\t\n");
      out.write("\t\t<table style=\"border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;\">\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Pengunjung online</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Pengunjung hari ini</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Total pengunjung</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Hit hari ini</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t\t<tr><td style=\"border: none;padding: 4px;\">Total hit</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t&copy; 2012 MOS css template | <a href=\"#\">Nama Website Anda</a> | design <a href=\"http://arirusmanto.com\" rel=\"nofollow\" target=\"_blank\">arirusmanto.com</a><br>\n");
      out.write("\tredesign <a href=\"#\">Tulis nama anda disini</a> \n");
      out.write("</div>\n");
      out.write("</div>\n");
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
