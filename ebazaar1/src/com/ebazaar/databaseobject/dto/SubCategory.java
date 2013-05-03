package com.ebazaar.databaseobject.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Entity;
@Entity
public class SubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SUBCATEGORY_ID")

	private Long subCategoryId;
	@Column
	private String attribute;
	@Column
	private Date cpd;
	@Column
	private Date upd;
	
	@ManyToOne
    @JoinColumn(name="CATEGORY_ID")
	private Long categoryId;
	
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
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
}