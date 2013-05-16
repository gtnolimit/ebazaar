<%@page import="com.ebazaar.util.EBazaarConstants"%>
<%@page import="com.ebazaar.transferobject.dto.PageDisplayIndexesDTO"%>
<%@page import="com.ebazaar.transferobject.dto.PaginationDTO"%>
<%
	PaginationDTO paginationDTO = (PaginationDTO)request.getAttribute("paginatedResults");
%>

<TABLE style="MARGIN-BOTTOM: 10px" border=0 cellSpacing=0 cellPadding=0 
      width="100%">
        <TBODY>
        <TR>
          <TD>
            <DIV id=paging_stats1>
            <DIV class=paging_summary>Showing 
            <%=paginationDTO.getPageDisplayStatus()%> 
          products</DIV></DIV></TD>
          <TD noWrap align=right>
            <DIV id=category_paging1 class=pagination>
            <%
            	for(PageDisplayIndexesDTO pageDisplayIndexesDTO : paginationDTO.getPageDisplayIndexes()) {
            		if(pageDisplayIndexesDTO.getDisplayPageIndex().equals(EBazaarConstants.previousIndex)) {
						if(pageDisplayIndexesDTO.isEnabled()) {         			
	        %>
	        	<A id=20 href="<%=pageDisplayIndexesDTO.getPageNavigationHref()%>">« Previous</A>
	        <%
						} else {
	        %>
            	
            	<SPAN class=paging_disabled>« Previous</SPAN>
            <%
						}
            		} else if(pageDisplayIndexesDTO.getDisplayPageIndex().equals(EBazaarConstants.nextIndex)) {
						if(pageDisplayIndexesDTO.isEnabled()) {            			
            %>
            	<A id=20 href="<%=pageDisplayIndexesDTO.getPageNavigationHref()%>">Next »</A>
            <%
						} else {
            %>
            	<SPAN class=paging_disabled>Next »</SPAN> 
            	
            <%
						}
            		} else if(pageDisplayIndexesDTO.getDisplayPageIndex().equals(EBazaarConstants.paginationGap)) {
            %>
            	...
            <%		} else {
            			if(pageDisplayIndexesDTO.isCurrentPage()) {
            %>
            		<SPAN class=paging_current><%=pageDisplayIndexesDTO.getDisplayPageIndex() %></SPAN>
            <%
            	
            			} else {
            %>
            		<A id="<%= Integer.parseInt(pageDisplayIndexesDTO.getDisplayPageIndex()) * paginationDTO.getPageSize() %>" href="<%=pageDisplayIndexesDTO.getPageNavigationHref()%>"><%= pageDisplayIndexesDTO.getDisplayPageIndex() %></A>
            <%
            			}
            		}
               	}
            %>
            </DIV></TD></TR></TBODY></TABLE>