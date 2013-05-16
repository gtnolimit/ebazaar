<%@page import="com.ebazaar.transferobject.dto.ProductCatergoryDTO"%>
<%@page import="com.ebazaar.transferobject.dto.ProductDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.ebazaar.transferobject.dto.CategoryDTO"%>
<%@page import="com.ebazaar.transferobject.dto.SubCategoryDTO"%>


<DIV id=topNav>
<TABLE cellSpacing=0 summary="" cellPadding=0 width="100%">
  <TBODY>
  <TR>
    
  	<% 
  		List<CategoryDTO> categorys = (List<CategoryDTO>)request.getServletContext().getAttribute("categorys");
  
  		if(categorys != null) {
  			for(CategoryDTO category : categorys) {
  	%>
 	
    <TD>
      <DIV class=flyoutPosition><A class=top_cat_link_alt 
      href="category/5/TV-amp-Video.html">
      	<%= category.getAttribute() %>
      </A>
      <DIV class="topNavFlyout  flyoutLeft">
      <DIV style="WIDTH: 600px" class=topNavFlyoutInner>
      
      <% 
      	int subCategoryColumnSelectValue = 0;       
      	boolean newColumn = true;
      	for(SubCategoryDTO subCategory : category.getSubCategoryDTOs()) {
      %>      
			  <% 			  	
			  	if((subCategoryColumnSelectValue != 0 && subCategoryColumnSelectValue % (Math.abs(category.getSubCategoryCount()/2)) == 0) && newColumn) { 
			  		newColumn = false;
			  //out.print("inside %2::"+subCategoryColumnSelect % 2);
			  %>
			  	</DIV>
				<DIV class=topNavFlyoutColumn>
			  <% 
			  	} else if(subCategoryColumnSelectValue == 0) { 
			  %>	
			  	<DIV class=topNavFlyoutColumn>
			  <% 
			  	} 
			  %>		  
				  <DIV class=categories_listing>
					<DIV class=title><A href="category/90/Televisions-TV.html"><%= subCategory.getAttribute()%></A></DIV>
			  <%
			  		for(ProductDTO productDTO : subCategory.getProducts()) {			  		
			  %>

				  <A class=cl_link href="itemListing.htm?product_id=<%=productDTO.getProductId()%>&amp;pageNumber=1&amp;pageSize=20"><%= productDTO.getAttribute() %></A>
			  <%
			  		}
			  %>
				  </DIV>
			  <%
				  subCategoryColumnSelectValue++;
  				}
			  %>
			  	</DIV>
				<DIV class="topNavFlyoutColumn end">
					<UL class=categories_listing>
							<LI class=title2>Buying Guides
							<LI><A class=sg_link href="LandingPages/3D_HDTV_in_your_home.php3">3D Television</A>
							<LI><A class=sg_link href="brands/blu-ray/bluray_main.php3">Blu-ray Players</A>
							<LI><A class=sg_link href="about/Buying_HDTV.php3">HDTV</A>
							<LI><A class=sg_link href="about/Buying_HDMI.php3">HDMI</A> </LI>
					</UL>
					<UL class=categories_listing>
						<LI class=title2>Trade In Your Gear
						<LI><A class=sg_link href="tradein">Trade-In Program</A> </LI>
					</UL>
				</DIV>
		</DIV>		
		</DIV>
		</DIV>
		</TD>
		<%
  				}
  			}
		%>
    </TR></TBODY></TABLE></DIV><!-- BEGIN: Google Trusted Store -->