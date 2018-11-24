package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_005fthemSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<li><a href=\"tabel_dm.jsp\">QL User</a></li>\n");
      out.write("\t\t<li><a href=\"tabel_sp.jsp\">Sản Phẩm</a></li>\n");
      out.write("                <li><a href=\"tabel_hd.jsp\">Hóa Đơn</a></li>\n");
      out.write("                <li><a href=\"form.jsp\">xxxx</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"rightContent\">\n");
      out.write("\t<h3>Nhập thông tin sản phẩm</h3>\n");
      out.write("           <form method=\"post\" action=\"../uploadSP\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t<table width=\"95%\">\n");
      out.write("                    <tr><td width=\"125px\"><b>Tên sản phẩm</b></td><td><input type=\"text\" class=\"pendek\" name=\"tenSP\"></td></tr>\n");
      out.write("                        <tr><td><b>Loại sản phẩm</b></td><td><input type=\"text\" class=\"sedang\" name=\"loaiSP\"></td></tr>\n");
      out.write("                        <tr><td><b>giá cũ</b></td><td><input type=\"text\" class=\"panjang\" name=\"giaCu\"></td></tr>\n");
      out.write("                        <tr><td><b>giá mới</b></td><td><input type=\"text\" class=\"panjang\" name=\"giaMoi\"></td></tr>\n");
      out.write("                        <tr><td><b>Kích thước</b></td><td><input type=\"text\" class=\"panjang\" name=\"kichThuoc\"></td></tr>\n");
      out.write("                        <tr><td><b>Màu sắc</b></td><td><input type=\"text\" class=\"panjang\" name=\"mauSac\"></td></tr>\n");
      out.write("                        <tr><td><b>Ảnh trước sản phẩm</b></td><td><input type=\"file\" class=\"panjang\" name=\"anhTruoc\"></td></tr>\n");
      out.write("                        <tr><td><b>Ảnh sau sản phẩm</b></td><td><input type=\"file\" class=\"panjang\" name=\"anhsau\"></td></tr>\n");
      out.write("                        <tr><td><b>Ngày sản xuất</b></td><td><input type=\"date\" class=\"panjang\" name=\"ngaySX\"></td></tr>\n");
      out.write("                        <tr><td><b>Ngày hết hạn</b></td><td><input type=\"date\" class=\"panjang\" name=\"ngayHetHan\"></td></tr>\n");
      out.write("                        <tr><td><b>Hạng sản xuất</b></td><td><input type=\"text\" class=\"panjang\" name=\"hangSX\"></td></tr>\n");
      out.write("\t\t\t<tr><td><b>Giới tính</b></td><td>\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"nam\" id=\"radio\" value=\"Nam\">Nam\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"nu\" id=\"radio\" value=\"NU\">Nữ\n");
      out.write("                                <input type=\"radio\" name=\"khac\" id=\"radio\" value=\"Khac\">Khác\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                        <tr><td><b>Số lượng</b></td><td><input type=\"number\" class=\"pendek\" name=\"soLuong\"></td></tr>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t<tr><td></td><td>\n");
      out.write("\t\t\t<input type=\"submit\" class=\"button\" value=\"Submit\">\n");
      out.write("\t\t\t<input type=\"reset\" class=\"button\" value=\"Reset\">\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t</table>\n");
      out.write("           </form>\n");
      out.write("\t</div>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                &copy; code by thao | <a href=\"#\">thaonguyen.com</a> | design <a href=\"http://arirusmanto.com\" target=\"_blank\">thaonguyen.com</a><br>\n");
      out.write("                redesign <a href=\"#\">by thao</a> | hihi <a href=\"lisensi.txt\" target=\"_blank\">hihi</a>\n");
      out.write("            </div>\n");
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
