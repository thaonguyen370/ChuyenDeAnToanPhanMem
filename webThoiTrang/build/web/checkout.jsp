<%-- 
    Document   : checkout
    Created on : Aug 28, 2018, 10:28:24 AM
    Author     : thao
--%>

<%@page import="Model.gioHang_sp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.sanPham"%>
<%@page import="Model.sanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>New ShopS a E-Commerce Online Shopping Category Flat Bootstrap Responsive Website Template | Checkout :: w3layouts</title>
        <!--css-->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/font-awesome.css" rel="stylesheet">
        <!--css-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="New Shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <script src="js/jquery.min.js"></script>
        <link href='//fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>
        <!--search jQuery-->
        <script src="js/main.js"></script>
        <!--search jQuery-->

        <!--mycart-->
        <script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
        <!-- cart -->
        <script src="js/simpleCart.min.js"></script>
        <!-- cart -->
    </head>
    <body>
        <!--header-->
        <jsp:include page="header/header.jsp"></jsp:include>
            <!--header-->
            <!--banner-->
            <div class="banner1">
                <div class="container">
                    <h3><a href="index.jsp">Home</a> / <span>Checkout</span></h3>
                </div>
            </div>
            <!--banner-->

            <!--content-->
        <%ArrayList<gioHang_sp> list_sp = new ArrayList<gioHang_sp>();%>
        <div class="content">
            <div class="cart-items">
                <div class="container">
                    <h2>Danh sách giỏ hàng<%
                        ArrayList<gioHang_sp> list1 = (ArrayList<gioHang_sp>) session.getAttribute("gioHang");
                        list_sp.clear();
                        if (list1 != null) {
                            for (gioHang_sp x : list1) {
                                list_sp.add(x);
                            }

                        }
                        out.println("(" + list_sp.size() + ")");
                        %></h2>
                    <!--                                        <script>$(document).ready(function (c) {
                                                                    $('.close1').on('click', function (c) {
                                                                        $('.cart-header').fadeOut('slow', function (c) {
                                                                            $('.cart-header').remove();
                                                                        });
                                                                    });
                                                                });
                                                            </script>-->
                    <%
                        for (int i = 0; i < list_sp.size(); i++) {%>
                    <div class="cart-header">
                        <div class="close1"><a href="gioHang?maXoa=<%=list_sp.get(i).getMa()%>&emailXoa=<%=list_sp.get(i).getEmail()%>&ghiChuXoa=<%=list_sp.get(i).getGhiChu()%>">------</a></div>
                        <div class="cart-sec simpleCart_shelfItem">
                            <div class="cart-item cyc">
                                <img src="<%=list_sp.get(i).getAnhTruoc()%>" class="img-responsive" alt="">
                            </div>
                            <div class="cart-item-info">
                                <h3><a href="#"> xem thông tin chi tiết </a><span>Mã: <%=list_sp.get(i).getMa()%></span></h3>
                                <ul class="qty">
                                    <li><p>Tên sản phẩm:</p></li>
                                    <li><p> <%=list_sp.get(i).getTen()%></p></li>
                                </ul>
                                <div class="delivery">
                                    <p>giá : $ <%=list_sp.get(i).getGiaMoi()%></p>
                                    <span>Thời gian mua:  <%=list_sp.get(i).getThoiGianMua()%></span>
                                    <div class="clearfix"></div>
                                </div>	
                            </div>
                            <div class="clearfix"></div>

                        </div>
                    </div>
                    <%}%>


                </div>
                <div>
                    <h1 style="text-align: center; color: blue">Nhap thong tin</h1><br/>
                    <form action="thanhToanHang?action=thanhToan" method="post" style="text-align: center" >
                        Tên người nhận:<input type="text" name="TenNguoiNhan" style="margin-right: 30px"/>
                        Địa chỉ:<input type="text" name="diaChi" style="margin-right: 30px"/>
                        Thời Gian nhận hàng:<input type="date" name="ThoiGianNhan"style="margin-right: 30px"/>
                        Sô ĐT:<input type="text" name="SODT"/><br/>
                        <input type="submit" value="Thanh Toán" style="margin-top: 50px"/>

                    </form>
                </div>
            </div>
            <!-- checkout -->	
        </div>
        <!---footer--->
        <div class="footer-w3l">
            <div class="container">
                <div class="footer-grids">
                    <div class="col-md-3 footer-grid">
                        <h4>About </h4>
                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>
                        <div class="social-icon">
                            <a href="#"><i class="icon"></i></a>
                            <a href="#"><i class="icon1"></i></a>
                            <a href="#"><i class="icon2"></i></a>
                            <a href="#"><i class="icon3"></i></a>
                        </div>
                    </div>
                    <div class="col-md-3 footer-grid">
                        <h4>My Account</h4>
                        <ul>
                            <li><a href="checkout.jsp">Checkout</a></li>
                            <li><a href="login.jsp">Login</a></li>
                            <li><a href="registered.jsp"> Create Account </a></li>
                        </ul>
                    </div>
                    <div class="col-md-3 footer-grid">
                        <h4>Information</h4>
                        <ul>
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="products.jsp">Products</a></li>
                            <li><a href="codes.jsp">Short Codes</a></li>
                            <li><a href="mail.jsp">Mail Us</a></li>
                            <li><a href="products1.jsp">products1</a></li>
                        </ul>
                    </div>
                    <div class="col-md-3 footer-grid foot">
                        <h4>Contacts</h4>
                        <ul>
                            <li><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i><a href="#">E Comertown Rd, Westby, USA</a></li>
                            <li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i><a href="#">1 599-033-5036</a></li>
                            <li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><a href="mailto:example@mail.com"> example@mail.com</a></li>

                        </ul>
                    </div>
                    <div class="clearfix"> </div>
                </div>

            </div>
        </div>
        <!---footer--->
        <!--copy-->
        <div class="copy-section">
            <div class="container">
                <div class="copy-left">
                    <p>&copy; 2016 New Shop . All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
                </div>
                <div class="copy-right">
                    <img src="images/card.png" alt=""/>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <!--copy-->

    </body>
</html>