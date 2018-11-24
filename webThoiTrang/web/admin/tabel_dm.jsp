<%-- 
    Document   : tabel
    Created on : Sep 14, 2018, 11:07:56 PM
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
	<h3>Quản lí danh mục</h3>
		<table class="data">
			<tr class="data">
				
				<th class="data">User</th>
				<th class="data">Email</th>
				<th class="data">Pass</th>
				<th class="data" width="75px">Tùy chọn</th>
			</tr>
			<tr class="data">
                            <td class="data"><script>document.body.style.backgroundColor="#FFFF"</script></td>
				<td class="data">Data Anda</td>
				<td class="data">Data Anda</td>
				<td class="data" width="75px">
				<center>
				<a href="#">khóa</a>&nbsp;&nbsp;&nbsp;
				<a href="#">xóa</a>
				</center>
				</td>
			</tr>
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