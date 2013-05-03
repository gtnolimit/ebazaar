package com.ebazaar.transferobject.dto;

import java.util.Date;
import java.util.List;

public class CategoryDTO {
	private Long categoryId;
	private String attribute;
	private Date cpd;
	private Date upd;
	private List<SubCategoryDTO> subCategoryDTOs;
	
	public List<SubCategoryDTO> getSubCategoryDTOs() {
		return subCategoryDTOs;
	}
	public void setSubCategoryDTOs(List<SubCategoryDTO> subCategoryDTOs) {
		this.subCategoryDTOs = subCategoryDTOs;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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
