package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.sanPham;
import java.util.ArrayList;
import ConnectToDataBase.sanPhamDao;

public final class tabel_005fsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>Admin MOS Template</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"description\" content=\"Admin MOS Template\">\n");
      out.write("<meta name=\"keywords\" content=\"Admin Page\">\n");
      out.write("<meta name=\"author\" content=\"Ari Rusmanto\">\n");
      out.write("<meta name=\"language\" content=\"Bahasa Indonesia\">\n");
      out.write("\n");
      out.write("<link rel=\"shortcut icon\" href=\"stylesheet/img/devil-icon.png\"> <!--Pemanggilan gambar favicon-->\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"mos-css/mos-style.css\"> pemanggilan file css-->\n");
      out.write("<link href=\"mos-css/mos-style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");

        sanPhamDao x=new sanPhamDao(); 
        ArrayList<sanPham> DS =x.DS_SP();
        
    
      out.write("\n");
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
      out.write("\t<h3>Quản lí sản phẩm</h3>\n");
      out.write("        <a href=\"form.jsp\" style=\"text-decoration: #03a9f4\">Thêm sản phẩm</a>\n");
      out.write("\t\t<table class=\"data\">\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<th class=\"data\" width=\"50px\">Mã</th>\n");
      out.write("\t\t\t\t<th class=\"data\">Tên SP</th>\n");
      out.write("\t\t\t\t<th class=\"data\">Giá mới</th>\n");
      out.write("\t\t\t\t<th class=\"data\">Ảnh</th>\n");
      out.write("\t\t\t\t<th class=\"data\" width=\"75px\">Tùy chọn</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        ");
if(DS!=null){
                            for(sanPham y:DS){
                        
      out.write("\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"50px\">");
      out.print(y.getMa());
      out.write("</td>\n");
      out.write("\t\t\t\t<td class=\"data\">");
      out.print(y.getTen());
      out.write("</td>\n");
      out.write("\t\t\t\t<td class=\"data\">");
      out.print(y.getGiaMoi());
      out.write("</td>\n");
      out.write("\t\t\t\t<td class=\"data\">");
      out.print(y.getAnhTruoc());
      out.write("</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("                                    <a href=\"#\" style=\"color: red\">Sửa</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                                    <a href=\"/webThoiTrang/adminQuanLi?maXoaSP=");
      out.print(y.getMa());
      out.write("\" style=\"color: red\">Xóa</a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        ");
}};
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t&copy; 2012 MOS css template | <a href=\"#\">Nama Website Anda</a> | design <a href=\"http://arirusmanto.com\" target=\"_blank\">arirusmanto.com</a><br>\n");
      out.write("\tredesign <a href=\"#\">Tulis nama anda disini</a> | Silahkan baca <a href=\"lisensi.txt\" target=\"_blank\">Lisensi</a>\n");
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
