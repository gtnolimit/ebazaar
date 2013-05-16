package com.ebazaar.transferobject.dto;

public class PageDisplayIndexesDTO {
	private String displayPageIndex;
	private boolean currentPage;
	private boolean enabled;
	
	private String pageNavigationHref;
	
	public String getPageNavigationHref() {
		return pageNavigationHref;
	}
	public void setPageNavigationHref(String pageNavigationHref) {
		this.pageNavigationHref = pageNavigationHref;
	}
	public String getDisplayPageIndex() {
		return displayPageIndex;
	}
	public void setDisplayPageIndex(String displayPageIndex) {
		this.displayPageIndex = displayPageIndex;
	}
	public boolean isCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(boolean currentPage) {
		this.currentPage = currentPage;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}