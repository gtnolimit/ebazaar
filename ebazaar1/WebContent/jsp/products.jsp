<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<H1 class=header1>All Flat Panel TVs </H1>
<TABLE style="MARGIN-TOP: 15px" border=0 cellSpacing=0 cellPadding=0 
width="100%" align=center>
  <TBODY>
  <TR>
  	<tiles:insertAttribute name="leftPanel" />
  	<tiles:insertAttribute name="productCaptionTop" />
	<tiles:insertAttribute name="pagination" />
	<tiles:insertAttribute name="itemListHeader" />
	<tiles:insertAttribute name="itemList" />
	<tiles:insertAttribute name="itemListFooter" />
	<tiles:insertAttribute name="pagination" />
	<tiles:insertAttribute name="productCaptionBottom" />
	<tiles:insertAttribute name="rightPanel" />
</TR>
</TBODY></TABLE>