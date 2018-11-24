<%@page import="Model.gioHang_sp"%>
<%@page import="Model.sanPham"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.user"%>

<div class="header">
    <% user user = (user) session.getAttribute("KH");%>
    <%String abc="khong co";
    if(session.getAttribute("KH")!=null){
        abc=user.getEmail();
    }
    
    %>
    <a href="header.jsp"></a>
    <div class="header-top">
        <div class="container">
            <div class="top-left">
                <a href="#"> Help  <i class="glyphicon glyphicon-phone" aria-hidden="true"></i> +0123-456-789</a>
            </div>
            <div class="top-right">
                <ul>
                    <li><a href="checkout.jsp">Checkout</a></li>
                    <li><a href="login.jsp"><%if (user != null) {
                            out.println("hello -" + user.getUser());
                        } else {
                            out.println("Login");
                                                    }%></a></li>
                    <li><a href="registered.jsp"> Create Account </a></li>
                    <li><a href="profile?action=<%=abc%>">Profile</a></li>
                    <li><a href="login?action=logout">Logout</a></li>
                </ul>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <div class="heder-bottom">
        <div class="container">
            <div class="logo-nav">
                <div class="logo-nav-left">
                    <h1><a href="index.jsp">New Shop <span>Shop anywhere</span></a></h1>
                </div>
                <div class="logo-nav-left1">
                    <nav class="navbar navbar-default">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header nav_2">
                            <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div> 
                        <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="index.jsp" class="act">Home</a></li>	
                                <!-- Mega Menu -->
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Women<b class="caret"></b></a>
                                    <ul class="dropdown-menu multi-column columns-3">
                                        <div class="row">
                                            <div class="col-sm-3  multi-gd-img">
                                                <ul class="multi-column-dropdown">
                                                    <h6>Submenu1</h6>
                                                    <li><a href="products.jsp">Clothing</a></li>
                                                    <li><a href="products.jsp">Wallets</a></li>
                                                    <li><a href="products.jsp">Shoes</a></li>
                                                    <li><a href="products.jsp">Watches</a></li>
                                                    <li><a href="products.jsp"> Underwear </a></li>
                                                    <li><a href="products.jsp">Accessories</a></li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-3  multi-gd-img">
                                                <ul class="multi-column-dropdown">
                                                    <h6>Submenu2</h6>
                                                    <li><a href="products.jsp">Sunglasses</a></li>
                                                    <li><a href="products.jsp">Wallets,Bags</a></li>
                                                    <li><a href="products.jsp">Footwear</a></li>
                                                    <li><a href="products.jsp">Watches</a></li>
                                                    <li><a href="products.jsp">Accessories</a></li>
                                                    <li><a href="products.jsp">Jewellery</a></li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-3  multi-gd-img">
                                                <a href="products.jsp"><img src="images/woo.jpg" alt=" "/></a>
                                            </div> 
                                            <div class="col-sm-3  multi-gd-img">
                                                <a href="products.jsp"><img src="images/woo1.jpg" alt=" "/></a>
                                            </div>
                                            <div class="clearfix"></div>
                                        </div>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Men <b class="caret"></b></a>
                                    <ul class="dropdown-menu multi-column columns-3">
                                        <div class="row">
                                            <div class="col-sm-3  multi-gd-img">
                                                <ul class="multi-column-dropdown">
                                                    <h6>Submenu1</h6>
                                                    <li><a href="products.jsp">Clothing</a></li>
                                                    <li><a href="products.jsp">Wallets</a></li>
                                                    <li><a href="products.jsp">Shoes</a></li>
                                                    <li><a href="products.jsp">Watches</a></li>
                                                    <li><a href="products.jsp"> Underwear </a></li>
                                                    <li><a href="products.jsp">Accessories</a></li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-3  multi-gd-img">
                                                <ul class="multi-column-dropdown">
                                                    <h6>Submenu 2</h6>
                                                    <li><a href="products.jsp">Sunglasses</a></li>
                                                    <li><a href="products.jsp">Wallets,Bags</a></li>
                                                    <li><a href="products.jsp">Footwear</a></li>
                                                    <li><a href="products.jsp">Watches</a></li>
                                                    <li><a href="products.jsp">Accessories</a></li>
                                                    <li><a href="products.jsp">Jewellery</a></li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-3  multi-gd-img">
                                                <a href="products1.jsp"><img src="images/woo3.jpg" alt=" "/></a>
                                            </div> 
                                            <div class="col-sm-3  multi-gd-img">
                                                <a href="products1.jsp"><img src="images/woo4.jpg" alt=" "/></a>
                                            </div>
                                            <div class="clearfix"></div>
                                        </div>
                                    </ul>
                                </li>
                                <li><a href="codes.jsp">Short Codes</a></li>
                                <li><a href="abc">Mail Us</a></li>
                            </ul>
                        </div>
                    </nav>
                </div>
                <div class="logo-nav-right">
                    <ul class="cd-header-buttons">
                        <li><a class="cd-search-trigger" href="#cd-search"> <span></span></a></li>
                    </ul> <!-- cd-header-buttons -->
                    <div id="cd-search" class="cd-search">
                        <form action="#" method="post">
                            <input name="Search" type="search" placeholder="Search...">
                        </form>
                    </div>	
                </div>
                <div class="header-right2">
                    <div class="cart box_1">
                        <a href="checkout.jsp">
                            <h3> <div class="total">
                                    <span><%
                                        ArrayList<gioHang_sp> list = (ArrayList<gioHang_sp>) session.getAttribute("gioHang");
                                        if (list != null) {
                                            int tien = 0;
                                            for (sanPham s : list) {
                                                tien += Integer.parseInt(s.getGiaMoi());
                                            }
                                            out.println("$"+tien);
                                        }else{
                                            out.println("$0");
                                        }
                                        %></span> (<span ><%
                                          ArrayList<gioHang_sp> list1 = (ArrayList<gioHang_sp>) session.getAttribute("gioHang");
                                          if(list1!=null){
                                              out.println(list1.size());
                                          }else{
                                              out.println(0);
                                          }
                                            %></span> items)</div>
                                <img src="images/bag.png" alt="" />
                            </h3>
                        </a>
                        <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
                        <div class="clearfix"> </div>
                    </div>	
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
    </div>
</div>