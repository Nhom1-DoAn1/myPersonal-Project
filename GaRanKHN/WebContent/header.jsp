<%@page import="Database.Model.User"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header id="header">
	<!--header-->
	<div class="header_top">
		<!--header_top-->
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<div class="contactinfo">
						<ul class="nav nav-pills">
							<li><a href="#"><i class="fa fa-phone"></i> +84 984 182
									205</a></li>
							<li><a href="#"><i class="fa fa-envelope"></i>
									khnvietnam@gmail.com</a></li>
						</ul>
					</div>
				</div>

			</div>
		</div>
	</div>
	<!--/header_top-->
			<%int activekey = (int) session.getAttribute("activekey"); 
			User user =(User) session.getAttribute("user");
			%>
	<div class="header-middle">
		<!--header-middle-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4">
					<div class="logo pull-left">
						<a href="khn"><img src="images/home/Logo1.png" width="300"
							height="80" /></a>
					</div>

				</div>
				<div class="col-sm-8">
					<div class="shop-menu pull-right">
						<ul class="nav navbar-nav">
							<li><a href="#"><i class="fa fa-user"></i> <% 			
							if(user == null)
							{
							
							%> Tài khoản <%} else
							{%> <%=user.getAccount().getIdAccount() %> <%} %> </a></li>


							<%if(activekey !=6){ %>
							<li><a href="cart"><i class="fa fa-shopping-cart"></i>
									Giỏ hàng</a></li>
								<%} %>

							<%if(activekey ==6){ %>
							<li><a href="cart" style="color: yellow;"><i class="fa fa-shopping-cart"></i>
									Giỏ hàng</a></li>
								<%} %>
				

							<%if(activekey !=5){ %>
							<li><a href="login"><i class="fa fa-lock"></i> <%
							if(user == null)
							{
							
							%> Đăng nhập <%} else
							{%> Đăng xuất <%} %> </a></li>
							
							<%} %>
							
							
							<%if(activekey ==5){ %>
							<li><a href="login" style="color: yellow;"><i class="fa fa-lock"></i> <%
							if(user == null)
							{
							
							%> Đăng nhập <%} else
							{%> Đăng xuất <%} %> </a></li>
							
							<%} %>
							
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--/header-middle-->

	<div class="header-bottom">
		<!--header-bottom-->
		<div class="container">
			<div class="row">

				<div class="mainmenu pull-left">
					<ul class="nav navbar-nav collapse navbar-collapse">



						<%if(activekey == 0) { %>
						<li><a href="khn" style="color: yellow;">Trang chủ</a></li>
						<li><a href="garanngonngon">Gà rán quay </a></li>
						<li><a href="burgerngonngon">Burger</a></li>
						<li><a href="nuocngonngon">Nước giải khát</a></li>
						<li><a href="trangmiengngonngon">Tráng miệng</a></li>
						<li><a href="contact-us.html">Liên hệ</a></li>
						<%} %>



						<%if(activekey == 1) { %>
						<li><a href="khn">Trang chủ</a></li>
						<li><a href="garanngonngon" style="color: yellow;">Gà rán
								quay </a></li>
						<li><a href="burgerngonngon">Burger</a></li>
						<li><a href="nuocngonngon">Nước giải khát</a></li>
						<li><a href="trangmiengngonngon">Tráng miệng</a></li>
						<li><a href="contact-us.html">Liên hệ</a></li>
						<%} %>





						<%if(activekey == 2) { %>
						<li><a href="khn">Trang chủ</a></li>
						<li><a href="garanngonngon">Gà rán quay </a></li>
						<li><a href="burgerngonngon" style="color: yellow;">Burger</a></li>
						<li><a href="nuocngonngon">Nước giải khát</a></li>
						<li><a href="trangmiengngonngon">Tráng miệng</a></li>
						<li><a href="contact-us.html">Liên hệ</a></li>
						<%} %>





						<%if(activekey == 3) { %>
						<li><a href="khn">Trang chủ</a></li>
						<li><a href="garanngonngon">Gà rán quay </a></li>
						<li><a href="burgerngonngon">Burger</a></li>
						<li><a href="nuocngonngon" style="color: yellow;">Nước
								giải khát</a></li>
						<li><a href="trangmiengngonngon">Tráng miệng</a></li>
						<li><a href="contact-us.html">Liên hệ</a></li>
						<%} %>




						<%if(activekey == 4) { %>
						<li><a href="khn">Trang chủ</a></li>
						<li><a href="garanngonngon">Gà rán quay </a></li>
						<li><a href="burgerngonngon">Burger</a></li>
						<li><a href="nuocngonngon">Nước giải khát</a></li>
						<li><a href="trangmiengngonngon" style="color: yellow;">Tráng
								miệng</a></li>
						<li><a href="contact-us.html">Liên hệ</a></li>
						<%} %>



						<%if(activekey > 4) { %>
						<li><a href="khn">Trang chủ</a></li>
						<li><a href="garanngonngon">Gà rán quay </a></li>
						<li><a href="burgerngonngon">Burger</a></li>
						<li><a href="nuocngonngon">Nước giải khát</a></li>
						<li><a href="trangmiengngonngon">Tráng miệng</a></li>
						<li><a href="contact-us.html">Liên hệ</a></li>
						<%} %>
					</ul>
				</div>
			</div>

		</div>
	</div>
	<!--/header-bottom-->
</header>