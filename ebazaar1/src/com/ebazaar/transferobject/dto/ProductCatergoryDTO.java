package com.ebazaar.transferobject.dto;

import java.util.Date;

import com.ebazaar.databaseobject.dto.Product;

public class ProductCatergoryDTO {
	private Long product_category_Id;
	private String attribute;
	private Date cpd;
	private Date upd;

	public Long getProduct_category_Id() {
		return product_category_Id;
	}
	public void setProduct_category_Id(Long product_category_Id) {
		this.product_category_Id = product_category_Id;
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
