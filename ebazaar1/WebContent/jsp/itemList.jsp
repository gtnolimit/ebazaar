<%@page import="com.ebazaar.transferobject.dto.ItemDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.ebazaar.transferobject.dto.ProductDTO"%>
<DIV id=category_products>
			<DIV id=category_results>
			  	
			  <!--outer loop for brand starts-->
				<UL id=category_results_list class=category_list>
					<LI class="brand_header "><A href="http:///store/sony"><IMG border=0 alt=Sony src="./OnlineStore_files/sony_ico.png"></A>
					
						<% 
							List<ItemDTO> items = (List<ItemDTO>)request.getAttribute("items"); 
								if(items != null) {
	  								for(ItemDTO item : items) {
						%>
						<!--inner loop for items starts-->
						<LI>
						<DIV class=cl_outer_box>
							<DIV class=cl_img_container><IMG class=energy alt="Energy Star Qualified"src="./OnlineStore_files/energy_star_sm.jpg">
														<A href="http:///product/63205/Sony-KDL32EX340.html"><IMG alt="Sony KDL32EX340"src="./OnlineStore_files/thumb1-63205.jpg"> </A>
								<DIV class=cl_view_product><A href="http:///product/63205/Sony-KDL32EX340.html">View Product</A> </DIV>
								<DIV id=63205_compare_div class=compare_option>
									<INPUT id=compare_chk_63205 class=compare_checkbox value=63205 type=checkbox name=product_ids[]> 
									<LABEL class=compare_link for=compare_chk_63205>Compare</LABEL> 
								</DIV>
							</DIV>
							<DIV class=cl_prod_container>
								<DIV class=cl_but_container><A href="http:///resources/pages/cart.php?quantity=1&amp;action=add&amp;product_id=63205&amp;return_to_referer=0">
															<IMG border=0 alt="Add to Cart"src="./OnlineStore_files/n_add_to_cart.gif"> </A>
									<DIV class=lists><A href="https:///resources/pages/gift_lists.php?mode=modal&amp;action=add&amp;type=registry&amp;product_id=63205">+ Add to Registry </A>
													<BR>
													<A href="https:///resources/pages/gift_lists.php?mode=modal&amp;action=add&amp;type=list&amp;product_id=63205">+ Add to List </A>
									</DIV>
								</DIV>
								<DIV class=cl_title_container>
									<DIV class=cl_title><A href="http:///product/63205/Sony-KDL32EX340.html">Sony 32" Black 720P LED HDTV - KDL-32EX340</A> </DIV>
									<DIV class=cl_abt_model><%=item.getManufactureModelNumber() %></DIV>
									<DIV class=cl_price>
										<DIV class=deal_price>
											<DIV class=regular_price>Regular Price <%=item.getListedPrice() %> </DIV>
											Your Price <%=item.getSalePrice() %>
										</DIV>
									</DIV>
								</DIV>
								<DIV class=clearing_div></DIV>
								<DIV class=cl_description><%=item.getDescription() %></DIV>
								<DIV class=cl_status_container><SPAN class=instock><%=item.getInstock() %></SPAN>| <STRONG class=free_ship>Free Shipping</STRONG> </DIV>
								<DIV>
									<DIV style="BACKGROUND-POSITION: 0px -180px" class=cl_rating></DIV>
									<DIV class=cl_reviews>8 reviews </DIV>
								</DIV>
								<DIV class=clearing_div></DIV>
							</DIV>
							<DIV class=clearing_div></DIV>
						</DIV>								
						<!--inner loop ends for items-->
						<%}} %>
					</LI>		
				</UL>
				<!--outer loop for brand ends-->
						
			</DIV>
		</DIV>