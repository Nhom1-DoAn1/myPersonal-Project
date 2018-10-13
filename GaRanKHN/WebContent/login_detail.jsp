<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<section id="form" style="margin-top: 0px">
	<!--form-->
	<a href="home" style="text-align: center; margin-left: 250px"> <img alt="" src="images/home/img_panner_login.png"></a>
	<div class="container">
		<div class="row">
			<div class="col-sm-4 col-sm-offset-1">
				<div class="login-form">
					<!--login form-->
					<h2 style ="color: #f6f676; font-weight: 300">Đăng nhập tài khoản của bạn</h2>
					<form action="checking" method="post">
						<input type="text" placeholder="Tài khoản"  name ="txtTaiKhoan" /> <input type="password"
							placeholder="Mật khẩu" name ="txtMatKhau" /> <span> <input
							type="checkbox" class="checkbox"> Lưu mật khẩu
						</span>
						<button type="submit" class="btn btn-default">Đăng nhập</button>
					</form>
				</div>
				<!--/login form-->
			</div>
			<div class="col-sm-1">
				<h2 class="or">HOẶC</h2>
			</div>
			<div class="col-sm-4">
				<div class="signup-form">
					<!--sign up form-->
					<h2 style ="color: #f6f676; font-weight: 300">Tạo tài khoản mới!</h2>
					<form action="signup" method ="post">
						<input type="text" placeholder="Tài khoản" name="txtTaiKhoan_DK" /> <input type="email"
							placeholder="Địa chỉ mail" name = "txtMail"/> <input type="password"
							placeholder="Mật khẩu" name ="txtMatKhau_DK" />
						<button type="submit" class="btn btn-default">Đăng ký</button>
						<br style="color: blue; font-weight: 400" >
						<%String mess =(String) request.getAttribute("message");
							if(mess != null)
							{
						%>
						<%=mess%>
						<%} %>
						
						
						</br>
					</form>
				</div>
				<!--/sign up form-->
			</div>
		</div>
	</div>
</section>
<!--/form-->
