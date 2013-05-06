package com.ebazaar.databaseobject.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column
	private String attribute;
	@Column
	private Date cpd;
	@Column
	private Date upd;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUBCATEGORY_ID")

	private SubCategory subCategory;

	public Long getProductId() {
		return productId;
	}



	public void setProductId(Long productId) {
		this.productId = productId;
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



	public SubCategory getSubCategory() {
		return subCategory;
	}



	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

}
