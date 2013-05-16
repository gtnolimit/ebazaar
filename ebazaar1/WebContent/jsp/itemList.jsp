<%@page import="com.ebazaar.transferobject.dto.PaginationDTO"%>
<%@page import="com.ebazaar.transferobject.dto.ManufactureDTO"%>
<%@page import="com.ebazaar.transferobject.dto.ItemDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.ebazaar.transferobject.dto.ProductDTO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


			  	
			  <!--outer loop for brand starts-->
				<UL id=category_results_list class=category_list>
					<%
						
						PaginationDTO paginationDTO = (PaginationDTO)request.getAttribute("paginatedResults");
						List<ManufactureDTO> manufactureDTOs = (List<ManufactureDTO>) paginationDTO.getItems();
					  	if(manufactureDTOs != null) {
					  		for(ManufactureDTO manufactureDTO : manufactureDTOs) {
					%>
					<LI class="brand_header "><A href="http:///store/sony"><IMG border=0 alt=Sony src="<%=manufactureDTO.getImagePath()%>"></A>
					
						<% 
								List<ItemDTO> items =  manufactureDTO.getItems();
									if(items != null) {
		  								for(ItemDTO item : items) {
						%>
						<!--inner loop for items starts-->
						<LI>
						<DIV class=cl_outer_box>
							<DIV class=cl_img_container><IMG class=energy alt="Energy Star Qualified"src="./OnlineStore_files/energy_star_sm.jpg">
														<A href="http:///product/63205/Sony-KDL32EX340.html"><IMG alt="Sony KDL32EX340"src="./OnlineStore_files/thumb1-63205.jpg"> </A>
								<DIV class=cl_view_product><A href="itemDetail.htm?item_id=<%=item.getItemId()%>">View Product</A> </DIV>
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
									<DIV class=cl_title><A href="itemDetail.htm?item_id=<%=item.getItemId()%>"><%=item.getSubject() %></A> </DIV>
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
								<DIV class=cl_status_container><SPAN class=instock><%
																						if(item != null && item.getInstock() > 0) {
																							out.println("In Stock");
																						} else {
																							out.println("No Stock");
																						}
																					%></SPAN>| <STRONG class=free_ship>Free Shipping</STRONG> </DIV>
								<DIV>
									<DIV style="BACKGROUND-POSITION: 0px -180px" class=cl_rating></DIV>
									<DIV class=cl_reviews>8 reviews </DIV>
								</DIV>
								<DIV class=clearing_div></DIV>
							</DIV>
							<DIV class=clearing_div></DIV>
						</DIV>								
						<!--inner loop ends for items-->
						<%
										}
		  							}
						%>
							</LI>
						<%
								}
							}
						%>
							
				</UL>
				<!--outer loop for brand ends-->
						
			