<%@page import="java.util.List"%>
<%@page import="Database.Model.Item"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="Database.Model.Order"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<section id="cart_items">
	<div class="container">

		<div class="table-responsive cart_info">
			<table class="table table-condensed">
				<thead>
					<tr class="cart_menu">
						<td class="image" style="color: black;">Sản phẩm</td>
						<td class="description" style="color: black;"></td>
						<td class="price" style="color: black;">Giá</td>
						<td class="quantity" style="color: black;">Số lượng</td>
						<td class="total" style="color: black;">Tổng giá</td>
						<td></td>
					</tr>
				</thead>
				<tbody>


					<%
						int money = 0;
						if (session.getAttribute("order") != null) {

							Order order = (Order) session.getAttribute("order");
							if (!order.getItems().isEmpty()) {
								List<Item> ListItems = order.getItems();
					%>

					<%
						for (Item item : ListItems) {
									money += item.getPrice() * item.getQuantity();
					%>
					<tr>
						<td class="cart_product"><a href=""><img
								src="img_database_food/<%=item.getFood().getIdFood()%>.jpg"
								alt="" style="width: 180px; height: 150px"></a></td>
						<td class="cart_description">
							<h4>
								<a href=""
									style="color: yellow; font-weight: 400; font-size: 20px"><%=item.getFood().getFood_name()%></a>
							</h4>

						</td>
						<td class="cart_price">
							<p
								style="color: yellow; font-weight: 600; font-size: 30px; margin-top: 20px"><%=item.getPrice()%></p>
						</td>
						<td class="cart_quantity">
							<div class="cart_quantity_button">
								<a class="cart_quantity_down"
									href="down?idFood=<%=item.getFood().getIdFood()%>"> - </a> <input
									class="cart_quantity_input" type="text" name="quantity"
									value="<%=item.getQuantity()%>" autocomplete="off" size="2">
								<a class="cart_quantity_up"
									href="up?idFood=<%=item.getFood().getIdFood()%>"> + </a>

							</div>
						</td>
						<td class="cart_total">
							<p class="cart_total_price"
								style="color: yellow; font-weight: 600; font-size: 30px; margin-top: 20px"><%=item.getQuantity() * item.getPrice()%></p>
						</td>
						<td class="cart_delete"><a class="cart_quantity_delete"
							style="background: #d660f3"
							href="deleteproduct?idFood=<%=item.getFood().getIdFood()%>"><i
								class="fa fa-times"></i></a></td>
					</tr>

					<%
						}
							}
						}
					%>
				</tbody>
			</table>
		</div>
	</div>
</section>
<!--/#cart_items-->

<section id="do_action">
	<div class="container">
		<div class="heading">
			<h4 style="color: orange;">KHN Delivery hân hạnh phục vụ bạn
				trên mọi nẻo đường</h4>
			<p>Mời bạn chọn địa chỉ cần giao hàng</p>
		</div>
		<div class="row">
			<div class="col-sm-6">
				<div class="chose_area">

					<ul>
						<li class="single_field" style="width: 200px;"><label
							style="color: orange;">Chọn tỉnh/thành phố:</label> <select>
								<option>Hà Nội</option>
								<option>Hồ Chí Minh</option>
								<option>Dubai</option>
						</select></li>

						<li style="margin-top: 10px"><label style="color: orange;">Địa
								chỉ:</label> <input type="text" style="width: 500px; height: 30px">
						</li>
					</ul>

				</div>
			</div>
			<div class="col-sm-6">
				<div class="total_area">
					<ul>
						<li>Tổng giá giỏ hàng <span><%=money%></span></li>
						<li>Phí ship <span>Free</span></li>
						<li>Tổng <span><%=money%></span></li>
					</ul>
					<a class="btn btn-default check_out" href=""
						style="margin-left: 250px">Đặt hàng</a>
				</div>
			</div>
		</div>
	</div>
</section>
<!--/#do_action-->
