package com.ebazaar.transferobject.dto;

import java.util.Date;
import java.util.List;

public class ProductDTO {
	
	
	private Long productId;
	private Long subCategoryId;
	private String attribute;
	private Date cpd;
	private Date upd;
	
	private Boolean productCategory;
	public Boolean getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(Boolean productCategory) {
		this.productCategory = productCategory;
	}
	private List<ItemDTO> items;
	
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
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
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public Date getCpd() {
		return cpd;
	}
	public void setCpd(Date cpd) {
		this.cpd = cpd;
	}
	public Date getUpd() {
		return upd;
	}
	public void setUpd(Date upd) {
		this.upd = upd;
	}
}
