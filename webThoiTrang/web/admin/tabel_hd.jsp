<%-- 
    Document   : tabel
    Created on : Sep 14, 2018, 11:07:56 PM
    Author     : thao
--%>

<%@page import="Model.user"%>
<%@page import="Model.hoaDon"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ConnectToDataBase.hoaDonDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin MOS Template</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="description" content="Admin MOS Template">
        <meta name="keywords" content="Admin Page">
        <meta name="author" content="Ari Rusmanto">
        <meta name="language" content="Bahasa Indonesia">

        <link rel="shortcut icon" href="stylesheet/img/devil-icon.png"> <!--Pemanggilan gambar favicon-->
        <link rel="stylesheet" type="text/css" href="mos-css/mos-style.css"> <!--pemanggilan file css-->
    </head>

    <body>
        <%
            hoaDonDao xx=new hoaDonDao();
            ArrayList<hoaDon> yy=xx.list();
      
        %>

        <div id="header">
            <div class="inHeader">
                <div class="mosAdmin">
                    Hallo, Mas Administrator<br>
                    <a href="">Lihat website</a> | <a href="">Help</a> | <a href="login.jsp">Keluar</a>
                </div>
                <div class="clear"></div>
            </div>
        </div>

        <div id="wrapper">
            <div id="leftBar">
                <ul>
                    <li><a href="index.jsp">Trang chủ</a></li>
                    <li><a href="tabel_dm.jsp">QL User</a></li>
                    <li><a href="tabel_sp.jsp">Sản Phẩm</a></li>
                    <li><a href="tabel_hd.jsp">Hóa Đơn</a></li>
                    <li><a href="form.jsp">xxxx</a></li>
                </ul>
            </div>
            <div id="rightContent">
                <h3>Quản lí hóa đơn</h3>
                <table class="data">
                    <tr class="data">
                        <th class="data" width="30px">số TT</th>
                        <th class="data">email</th>
                        <th class="data">Địa chỉ nhận hàng</th>
                        <th class="data">số điện thoại</th>
                        <th class="data" >ngày nhận</th>
                        <th class="data" >tổng tiền</th>
                        <th class="data" width="75px">Tùy chọn</th>
                    </tr>
                    <%
                        for(int i=0;i<yy.size();i++){
                    %>
                    <tr class="data">
                        <td class="data" width="30px"><%=i%></th>
                        <td class="data"><%=yy.get(i).getEmail()%></th>
                        <td class="data"><%=yy.get(i).getDiaChiNguoiNhan()%></th>
                        <td class="data"><%=yy.get(i).getSoDT()%></th>
                        <td class="data" ><%=yy.get(i).getThoiGianNhan()%></th>
                        <td class="data" ><%=yy.get(i).getTongTien()%></th>
                        <td class="data" width="75px">
                    <center>
                        <a href="/webThoiTrang/adminQuanLi?mailXoa=<%=yy.get(i).getEmail()%>" style="color: red">xóa</a>&nbsp;&nbsp;&nbsp;
                        <a href="#" style="color: red">duyệt</a>
                    </center>
                    </td>
                    </tr>
                    <%}%>
                  
                </table>

            </div>
                    
            <div class="clear"></div>
            <div id="footer">
                &copy; code by thao | <a href="#">thaonguyen.com</a> | design <a href="http://arirusmanto.com" target="_blank">thaonguyen.com</a><br>
                redesign <a href="#">by thao</a> | hihi <a href="lisensi.txt" target="_blank">hihi</a>
            </div>
        </div>
    </body>
</html>