package com.ebazaar.databaseobject.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CATEGORY_ID")
	
	private Long categoryId;
	@Column
	private String attribute;
	@Column
	private Date cpd;
	@Column
	private Date upd;
	@OneToMany(fetch = FetchType.LAZY,mappedBy="category")
	private List<SubCategory> subCategories;
	
	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
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