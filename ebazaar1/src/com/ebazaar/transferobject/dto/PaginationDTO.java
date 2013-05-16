package com.ebazaar.transferobject.dto;

import java.util.List;

public class PaginationDTO {
	private Long productId;
	private Long subCategoryId;
	private int pageNumber;
	private int pageSize;
	private List<PageDisplayIndexesDTO> pageDisplayIndexes;
	private List<ManufactureDTO> items;
	private Long totalRecords;
	
	
	private String pageDisplayStatus;
	private String productSort;
	private String productListSize;
	private boolean productRefresh;
	
	public boolean isProductRefresh() {
		return productRefresh;
	}
	public void setProductRefresh(boolean productRefresh) {
		this.productRefresh = productRefresh;
	}
	public String getProductListSize() {
		return productListSize;
	}
	public void setProductListSize(String productListSize) {
		this.productListSize = productListSize;
	}
	public String getProductSort() {
		return productSort;
	}
	public void setProductSort(String productSort) {
		this.productSort = productSort;
	}
	public String getPageDisplayStatus() {
		return pageDisplayStatus;
	}
	public void setPageDisplayStatus(String pageDisplayStatus) {
		this.pageDisplayStatus = pageDisplayStatus;
	}
	public Long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<ManufactureDTO> getItems() {
		return items;
	}
	public void setItems(List<ManufactureDTO> items) {
		this.items = items;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<PageDisplayIndexesDTO> getPageDisplayIndexes() {
		return pageDisplayIndexes;
	}
	public void setPageDisplayIndexes(List<PageDisplayIndexesDTO> pageDisplayIndexes) {
		this.pageDisplayIndexes = pageDisplayIndexes;
	}
}
