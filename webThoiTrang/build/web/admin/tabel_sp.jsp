<%-- 
    Document   : tabel
    Created on : Sep 14, 2018, 11:07:56 PM
    Author     : thao
--%>

<%@page import="Model.sanPham"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ConnectToDataBase.sanPhamDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<!--<link rel="stylesheet" type="text/css" href="mos-css/mos-style.css"> pemanggilan file css-->
<link href="mos-css/mos-style.css" rel="stylesheet" type="text/css"/>
</head>

<body>
    <%
        sanPhamDao x=new sanPhamDao(); 
        ArrayList<sanPham> DS =x.DS_SP();
        
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
	<h3>Quản lí sản phẩm</h3>
        <a href="form_themSP.jsp" style="text-decoration: #03a9f4">Thêm sản phẩm</a>
		<table class="data">
			<tr class="data">
				<th class="data" width="50px">Mã</th>
				<th class="data">Tên SP</th>
				<th class="data">Giá mới</th>
				<th class="data">Ảnh</th>
				<th class="data" width="75px">Tùy chọn</th>
			</tr>
                        <%if(DS!=null){
                            for(sanPham y:DS){
                        %>
			<tr class="data">
				<td class="data" width="50px"><%=y.getMa()%></td>
				<td class="data"><%=y.getTen()%></td>
				<td class="data"><%=y.getGiaMoi()%></td>
				<td class="data"><%=y.getAnhTruoc()%></td>
				<td class="data" width="75px">
				<center>
                                    <a href="#" style="color: red">Sửa</a>&nbsp;&nbsp;&nbsp;
                                    <a href="/webThoiTrang/adminQuanLi?maXoaSP=<%=y.getMa()%>" style="color: red">Xóa</a>
				</center>
				</td>
			</tr>
                        <%}};%>
	

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