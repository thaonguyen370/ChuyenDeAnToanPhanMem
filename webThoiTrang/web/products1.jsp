<%-- 
    Document   : products1
    Created on : Aug 28, 2018, 10:39:08 AM
    Author     : thao
--%>

<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.sanPham"%>
<%@page import="ConnectToDataBase.sanPhamDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
    <head>
        <title>New Shop a E-Commerce Online Shopping Category Flat Bootstrap Responsive Website Template | Products1 :: w3layouts</title>
        <!--css-->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/jquery-ui.css">
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
        <%
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

        %>

        <!--header-->
        <jsp:include page="header/header.jsp"></jsp:include>
            <!--header-->
            <!--banner-->
            <div class="banner1">
                <div class="container">
                    <h3><a href="index.jsp">Home</a> / <span>Products</span></h3>
                </div>
            </div>
            <!--banner-->
            <!--content-->
            <div class="content">
                <div class="products-agileinfo">
                    <h2 class="tittle">Men's Wear</h2>
                    <div class="container">
                        <div class="product-agileinfo-grids w3l">
                            <div class="col-md-3 product-agileinfo-grid">
                                <div class="categories">
                                    <h3>Categories</h3>
                                    <ul class="tree-list-pad">
                                        <li><input type="checkbox" checked="checked" id="item-0" /><label for="item-0"><span></span>Men's Wear</label>
                                            <ul>
                                                <li><input type="checkbox" id="item-0-0" /><label for="item-0-0">Ethnic Wear</label>
                                                    <ul>
                                                        <li><a href="products.jsp">Shirts</a></li>
                                                        <li><a href="products.jsp">Caps</a></li>
                                                        <li><a href="products.jsp">Shoes</a></li>
                                                        <li><a href="products.jsp">Pants</a></li>
                                                        <li><a href="products.jsp">SunGlasses</a></li>
                                                        <li><a href="products.jsp">Trousers</a></li>
                                                    </ul>
                                                </li>
                                                <li><input type="checkbox"  id="item-0-1" /><label for="item-0-1">Party Wear</label>
                                                    <ul>
                                                        <li><a href="products.jsp">Shirts</a></li>
                                                        <li><a href="products.jsp">Caps</a></li>
                                                        <li><a href="products.jsp">Shoes</a></li>
                                                        <li><a href="products.jsp">Pants</a></li>
                                                        <li><a href="products.jsp">SunGlasses</a></li>
                                                        <li><a href="products.jsp">Trousers</a></li>
                                                    </ul>
                                                </li>
                                                <li><input type="checkbox"  id="item-0-2" /><label for="item-0-2">Casual Wear</label>
                                                    <ul>
                                                        <li><a href="products.jsp">Shirts</a></li>
                                                        <li><a href="products.jsp">Caps</a></li>
                                                        <li><a href="products.jsp">Shoes</a></li>
                                                        <li><a href="products.jsp">Pants</a></li>
                                                        <li><a href="products.jsp">SunGlasses</a></li>
                                                        <li><a href="products.jsp">Trousers</a></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <li><input type="checkbox" id="item-1" checked="checked" /><label for="item-1">Best Collections</label>
                                            <ul>
                                                <li><input type="checkbox" checked="checked" id="item-1-0" /><label for="item-1-0">New Arrivals</label>
                                                    <ul>
                                                        <li><a href="products.jsp">Shirts</a></li>
                                                        <li><a href="products.jsp">Shoes</a></li>
                                                        <li><a href="products.jsp">Pants</a></li>
                                                        <li><a href="products.jsp">SunGlasses</a></li>
                                                    </ul>
                                                </li>

                                            </ul>
                                        </li>
                                        <li><input type="checkbox" checked="checked" id="item-2" /><label for="item-2">Best Offers</label>
                                            <ul>
                                                <li><input type="checkbox"  id="item-2-0" /><label for="item-2-0">Summer Discount Sales</label>
                                                    <ul>
                                                        <li><a href="products.jsp">Shirts</a></li>
                                                        <li><a href="products.jsp">Shoes</a></li>
                                                        <li><a href="products.jsp">Pants</a></li>
                                                        <li><a href="products.jsp">SunGlasses</a></li>
                                                    </ul>
                                                </li>
                                                <li><input type="checkbox" id="item-2-1" /><label for="item-2-1">Exciting Offers</label>
                                                    <ul>
                                                        <li><a href="products.jsp">Shirts</a></li>
                                                        <li><a href="products.jsp">Shoes</a></li>
                                                        <li><a href="products.jsp">Pants</a></li>
                                                        <li><a href="products.jsp">SunGlasses</a></li>
                                                    </ul>
                                                </li>
                                                <li><input type="checkbox" id="item-2-2" /><label for="item-2-2">Flat Discounts</label>
                                                    <ul>
                                                        <li><a href="products.jsp">Shirts</a></li>
                                                        <li><a href="products.jsp">Shoes</a></li>
                                                        <li><a href="products.jsp">Pants</a></li>
                                                        <li><a href="products.jsp">SunGlasses</a></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>
                                <div class="price">
                                    <h3>Price Range</h3>
                                    <ul class="dropdown-menu6">
                                        <li>                
                                            <div id="slider-range"></div>							
                                            <input type="text" id="amount" style="border: 0; color: #ffffff; font-weight: normal;" />
                                        </li>			
                                    </ul>
                                    <script type='text/javascript'>//<![CDATA[ 
                                        $(window).load(function () {
                                            $("#slider-range").slider({
                                                range: true,
                                                min: 0,
                                                max: 9000,
                                                values: [1000, 7000],
                                                slide: function (event, ui) {
                                                    $("#amount").val("$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ]);
                                                }
                                            });
                                            $("#amount").val("$" + $("#slider-range").slider("values", 0) + " - $" + $("#slider-range").slider("values", 1));

                                        });//]]>  

                                    </script>
                                    <script type="text/javascript" src="js/jquery-ui.js"></script>
                                </div>
                                <div class="top-rates">
                                    <h3>Top Rates products</h3>
                                    <div class="recent-grids">
                                        <div class="recent-left">
                                            <a href="single.jsp"><img class="img-responsive " src="images/r.jpg" alt=""></a>	
                                        </div>
                                        <div class="recent-right">
                                            <h6 class="best2"><a href="single.jsp">Lorem ipsum dolor </a></h6>
                                            <p><del>$100.00</del> <em class="item_price">$09.00</em></p>
                                        </div>	
                                        <div class="clearfix"> </div>
                                    </div>
                                    <div class="recent-grids">
                                        <div class="recent-left">
                                            <a href="single.jsp"><img class="img-responsive " src="images/r1.jpg" alt=""></a>	
                                        </div>
                                        <div class="recent-right">
                                            <h6 class="best2"><a href="single.jsp">Duis aute irure </a></h6>
                                            <p><del>$100.00</del> <em class="item_price">$19.00</em></p>
                                        </div>	
                                        <div class="clearfix"> </div>
                                    </div>
                                    <div class="recent-grids">
                                        <div class="recent-left">
                                            <a href="single.jsp"><img class="img-responsive " src="images/r2.jpg" alt=""></a>	
                                        </div>
                                        <div class="recent-right">
                                            <h6 class="best2"><a href="single.jsp">Lorem ipsum dolor </a></h6>
                                            <p><del>$100.00</del> <em class="item_price">$39.00</em></p>
                                        </div>
                                        <div class="clearfix"> </div>
                                    </div>
                                    <div class="recent-grids">
                                        <div class="recent-left">
                                            <a href="single.jsp"><img class="img-responsive " src="images/r3.jpg" alt=""></a>	
                                        </div>
                                        <div class="recent-right">
                                            <h6 class="best2"><a href="single.jsp">Ut enim ad minim </a></h6>
                                            <p><em class="item_price">$39.00</em></p>
                                        </div>	
                                        <div class="clearfix"> </div>
                                    </div>
                                </div>
                                <div class="brand-w3l">
                                    <h3>Brands Filter</h3>
                                    <ul>
                                        <li><a href="#">Ralph Lauren</a></li>
                                        <li><a href="#">adidas</a></li>
                                        <li><a href="#">Bottega Veneta</a></li>
                                        <li><a href="#">Valentino</a></li>
                                        <li><a href="#">Nike</a></li>
                                        <li><a href="#">Burberry</a></li>
                                        <li><a href="#">Michael Kors</a></li>
                                        <li><a href="#">Louis Vuitton</a></li>
                                        <li><a href="#">Jimmy Choo</a></li>
                                    </ul>
                                </div>
                                <div class="cat-img">
                                    <img class="img-responsive " src="images/45.jpg" alt="">
                                </div>
                            </div>
                            <div class="col-md-9 product-agileinfon-grid1">
                                <div class="product-agileinfon-top">
                                    <div class="col-md-6 product-agileinfon-top-left">
                                        <img class="img-responsive " src="images/img3.jpg" alt="">
                                    </div>
                                    <div class="col-md-6 product-agileinfon-top-left">
                                        <img class="img-responsive " src="images/img4.jpg" alt="">
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="mens-toolbar">
                                    <p >Showing 1–8 of 21 results</p>
                                    <p class="showing">Sorting By
                                        <select>
                                            <option value=""> Name</option>
                                            <option value="">  Rate</option>
                                            <option value=""> Color </option>
                                            <option value=""> Price </option>
                                        </select>
                                    </p> 
                                    <p>Show
                                        <select>
                                            <option value=""> 8</option>
                                            <option value=""> 9</option>
                                            <option value=""> 10 </option>
                                            <option value=""> 11 </option>
                                        </select>
                                    </p>
                                    <div class="clearfix"></div>		
                                </div>
                                <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
                                    <ul id="myTab" class="nav1 nav1-tabs left-tab" role="tablist">
                                        <ul id="myTab" class="nav nav-tabs left-tab" role="tablist">
                                            <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true"><img src="images/menu1.png"></a></li>
                                            <li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile"><img src="images/menu.png"></a></li>
                                        </ul>
                                        <div id="myTabContent" class="tab-content">
                                            <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
                                                <div class="product-tab">
                                                <%for (sanPham vv : DS_hienThi) {%>

                                                <div class="col-md-4 product-tab-grid simpleCart_shelfItem">
                                                    <div class="grid-arr">
                                                        <div  class="grid-arrival">
                                                            <figure>		
                                                                <a href="#" class="new-gri" data-toggle="modal" data-target="#myModal1">
                                                                    <div class="grid-img">
                                                                        <img  src=<%=vv.getAnhTruoc()%>  class="img-responsive" alt="">
                                                                    </div>
                                                                    <div class="grid-img">
                                                                        <img src=<%=vv.getAnhSau()%>  class="img-responsive"  alt="">
                                                                    </div>			
                                                                </a>		
                                                            </figure>	
                                                        </div>
                                                        <div class="block">
                                                            <div class="starbox small ghosting"> </div>
                                                        </div>
                                                        <div class="women">
                                                            <h6><a href="single.jsp"><%=vv.getTen()%></a></h6>
                                                            <span class="size">size: <%=vv.getSize()%> </span>
                                                            <p ><del>$<%=vv.getGiaCu()%></del><em class="item_price">$<%=vv.getGiaMoi()%></em></p>
                                                            <a href="gioHang?maHang=<%=vv.getMa()%>&tenHang=<%=vv.getTen()%>" data-text="Add To Cart" class="my-cart-b item_add">Add To Cart</a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <%}%>
                                                <div class="clearfix"></div>
                                            </div>
                                            <!--											<div class="product-tab prod1">
                                                                                                                                            <div class="col-md-4 product-tab-grid simpleCart_shelfItem">
                                                                                                         <div class="clearfix"></div>
                                                                                                                                    </div>-->



                                            <nav aria-label="Page navigation example">
                                                <ul class="pagination">
                                                    <li class="page-item"><a class="page-link" href="phanTrang?pageid=<%=request.getAttribute("previous")%>">Previous</a></li>
                                                        <%  for (int i = 1; i <= pages; i++) {%>

                                                    <li class="page-item"><a class="page-link" href="phanTrang?pageid=<%=i%>"><%=i%></a></li>
                                                        <%}%>
                                                    <li class="page-item"><a class="page-link" href="phanTrang?pageid=<%=request.getAttribute("next")%>">Next</a></li>
                                                </ul>
                                            </nav>
                                        </div>

                                        <div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">


                                        </div>
                                    </div>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>
        </div>
        <!--content-->
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