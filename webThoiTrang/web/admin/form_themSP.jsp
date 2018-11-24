<%-- 
    Document   : form
    Created on : Sep 14, 2018, 11:06:25 PM
    Author     : thao
--%>

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
<link rel="stylesheet" type="text/css" href="mos-css/mos-style.css"> <!--pemanggilan file css-->
</head>

<body>
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
	<h3>Nhập thông tin sản phẩm</h3>
           <form method="post" action="../uploadSP" enctype="multipart/form-data">
		<table width="95%">
                    <tr><td width="125px"><b>Tên sản phẩm</b></td><td><input type="text" class="pendek" name="tenSP"></td></tr>
                        <tr><td><b>Loại sản phẩm</b></td><td><input type="text" class="sedang" name="loaiSP"></td></tr>
                        <tr><td><b>giá cũ</b></td><td><input type="text" class="panjang" name="giaCu"></td></tr>
                        <tr><td><b>giá mới</b></td><td><input type="text" class="panjang" name="giaMoi"></td></tr>
                        <tr><td><b>Kích thước</b></td><td><input type="text" class="panjang" name="kichThuoc"></td></tr>
                        <tr><td><b>Màu sắc</b></td><td><input type="text" class="panjang" name="mauSac"></td></tr>
                        <tr><td><b>Ảnh trước sản phẩm</b></td><td><input type="file" class="panjang" name="anhTruoc"></td></tr>
                        <tr><td><b>Ảnh sau sản phẩm</b></td><td><input type="file" class="panjang" name="anhsau"></td></tr>
                        <tr><td><b>Ngày sản xuất</b></td><td><input type="date" class="panjang" name="ngaySX"></td></tr>
                        <tr><td><b>Ngày hết hạn</b></td><td><input type="date" class="panjang" name="ngayHetHan"></td></tr>
                        <tr><td><b>Hạng sản xuất</b></td><td><input type="text" class="panjang" name="hangSX"></td></tr>
			<tr><td><b>Giới tính</b></td><td>
				<input type="radio" name="nam" id="radio" value="Nam">Nam
				<input type="radio" name="nu" id="radio" value="NU">Nữ
                                <input type="radio" name="khac" id="radio" value="Khac">Khác
			</td></tr>
                        <tr><td><b>Số lượng</b></td><td><input type="number" class="pendek" name="soLuong"></td></tr>

		
			<tr><td></td><td>
			<input type="submit" class="button" value="Submit">
			<input type="reset" class="button" value="Reset">
			</td></tr>
		</table>
           </form>
	</div>
<div class="clear"></div>
            <div id="footer">
                &copy; code by thao | <a href="#">thaonguyen.com</a> | design <a href="http://arirusmanto.com" target="_blank">thaonguyen.com</a><br>
                redesign <a href="#">by thao</a> | hihi <a href="lisensi.txt" target="_blank">hihi</a>
            </div>
</div>
</body>
</html>