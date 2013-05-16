<%@page import="com.ebazaar.enumDef.ProductListSizeEnum"%>
<%@page import="com.ebazaar.enumDef.ProductSortEnum"%>
<%@page import="com.ebazaar.transferobject.dto.PaginationDTO"%>
<%@page import="com.ebazaar.transferobject.dto.ServerConfigDTO"%>
<script language="javascript" type="text/javascript">
<!-- 
//Browser Support Code

function ajaxUpdateProductList(){
	var ajaxRequest;  // The variable that makes Ajax possible!
	try{
		// Opera 8.0+, Firefox, Safari
		ajaxRequest = new XMLHttpRequest();
	} catch (e){
		// Internet Explorer Browsers
		try{
			ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try{
				ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e){
				// Something went wrong
				alert("Your browser broke!");
				return false;
			}
		}
	}
	// Create a function that will receive data sent from the server
	ajaxRequest.onreadystatechange = function(){
		if(ajaxRequest.readyState == 4){
			var ajaxDisplay = document.getElementById('productListPanel');
			alert(ajaxRequest.responseText);
			ajaxDisplay.innerHTML = ajaxRequest.responseText;
		}
	}
	
	
	/* var age = document.getElementById('age').value;
	var wpm = document.getElementById('wpm').value;
	var sex = document.getElementById('sex').value; */
	var queryString = "<%=ServerConfigDTO.getServerConfiguration().getServerURL()%>productRefresh.htm?"+
								"pageNumber="+document.getElementById('pageNumber_hidden').value+
								"&pageSize="+document.getElementById('per_page').value+
								"&product_id="+document.getElementById('productId_hidden').value+
								"&order_by="+document.getElementById('order_by_post').value+

								
								"&productViewDisplayed=productRefreshStatus";
	ajaxRequest.open("GET", queryString, true);
	//var queryString = "?age=" + age + "&wpm=" + wpm + "&sex=" + sex;
	//ajaxRequest.open("GET", "ajax-example.php" + queryString, true);
	ajaxRequest.send(null);
}

//-->
</script>
<%
	PaginationDTO paginationDTO = (PaginationDTO)request.getAttribute("paginatedResults");
%>
<input type = "hidden" name="pageNumber_hidden" id="pageNumber_hidden" value="<%=paginationDTO.getPageNumber()%>"/>
<input type = "hidden" name="productId_hidden" id="productId_hidden" value="<%=paginationDTO.getProductId()%>"/>
<FORM id=sort_form method=get
	action=/category/402/All-Flat-Panel-TVs.html>
	<DIV
		style="BORDER-BOTTOM: #cdcdcd 1px solid; BORDER-LEFT: #cdcdcd 1px solid; BACKGROUND-COLOR: #f3f4f4; PADDING-LEFT: 10px; MARGIN-BOTTOM: 0px; BORDER-TOP: #cdcdcd 1px solid; BORDER-RIGHT: #cdcdcd 1px solid"
		id=sort_options>
		<DIV style="FLOAT: right">
			<TABLE align=right>
				<TBODY>
					<TR>
						<TD style="PADDING-LEFT: 10px; FONT-SIZE: 9px" vAlign=bottom>SORT
							BY:</TD>
						<TD><SELECT id=order_by_post name=order_by_post onchange="ajaxUpdateProductList()">
						<% System.out.println("Here 3");%>
								<%
								
									for(ProductSortEnum productSortEnum : ProductSortEnum.values()) {
								%>
								<OPTION
								<%
										if(paginationDTO.getProductSort().equalsIgnoreCase(productSortEnum.getProductSortValue())) {
								%> 
											selected
								<%
										}
								%>
								value="<%= productSortEnum.getProductSortValue() %>"><%=productSortEnum.getProductSortDesc()%></OPTION>
								<%
									}
								%>
								
						</SELECT></TD>
						<TD style="PADDING-LEFT: 10px; FONT-SIZE: 9px" vAlign=bottom>RESULTS
							PER PAGE:</TD>
						<TD><SELECT id=per_page name=per_page onchange="ajaxUpdateProductList()">
								<%
									for(ProductListSizeEnum productListSizeEnum : ProductListSizeEnum.values()) {
								%>
								<OPTION
								<%
										if(paginationDTO.getProductListSize().equalsIgnoreCase(productListSizeEnum.getProductListSize())) {
								%> 
									selected
								<%
										}
								%>
									value="<%= productListSizeEnum.getProductListSize()%>"><%= productListSizeEnum.getProductListSize() %></OPTION>
								<%
									}
								%>
						</SELECT>
							<!-- <NOSCRIPT>
								<INPUT id=sort_submit value=Go type=submit>
							</NOSCRIPT></TD> -->
					</TR>
				</TBODY>
			</TABLE>
		</DIV>
		<INPUT id=category_id value=402 type=hidden name=category_id>
		<INPUT type=hidden name=store> <INPUT id=cache_killer
			value=256 type=hidden>
		<DIV style="CLEAR: both"></DIV>
	</DIV>
</FORM>
<A id=results_anchor
	href="http:///category/402/All-Flat-Panel-TVs.html#"></A>

<!--form starts here-->
<FORM id=compare_form method=get
	action=/resources/pages/product_compare.php>
	<INPUT value=402 type=hidden name=category_id>
	<DIV
		style="POSITION: relative; PADDING-BOTTOM: 0px; PADDING-LEFT: 0px; WIDTH: 230px; PADDING-RIGHT: 0px; PADDING-TOP: 10px"
		id=compare_top>
		<INPUT class=compare_submit value=Compare alt=Compare
			src="./OnlineStore_files/compare_active.jpg" type=image> <INPUT
			style="DISPLAY: none" class=compare_submit_inactive disabled
			alt=Compare src="./OnlineStore_files/compare_inactive.jpg" type=image>
		<DIV class=compare_helper>Select up to 4 products.</DIV>
	</DIV>
	<DIV style="CLEAR: both"></DIV>
	<DIV id=category_products>
			<DIV id=category_results>