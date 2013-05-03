package com.ebazaar.transferobject.dto;

import java.util.Date;

public class SubCategoryDTO {
	private Long categoryId;
	private Long subCategoryId;
	private String attribute;
	private Date cpd;
	private Date upd;
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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
