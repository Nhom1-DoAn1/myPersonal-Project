<%@page import="java.sql.ResultSet"%>
<%@page import="Database.Management.getFood"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="myProduct">
	<div class="features_items"
		style="margin-left: 130px; margin-right: 120px">
		<!--features_items-->

		<%
			int key = (int) request.getAttribute("key");
			getFood GF = new getFood();
			ResultSet rs = GF.getFoodswithKind(key);
			while (rs.next()) {
		%>

		<div class="col-sm-3">
			<a href="" target="#"> <img
				src="img_database_food/<%=rs.getString(1)%>.jpg"></a>
			<h4 style="text-align: center; font-weight: 600; color: #f6f676;"><%=rs.getString(6)%></h4>
			<h4 style="text-align: center; font-weight: 600; color: #d5dad1;"><%=rs.getString(2)%>
				VNĐ
			</h4>

			<a href="addtocart?idFood=${rs.getString(1)}" class="btn btn-default add-to-cart cd-popup-trigger"
				style="margin-left: 85px"><i class="fa fa-shopping-cart"></i>Giỏ
				hàng</a>
		</div>

		<%
			}
		%>

	</div>
</div>
