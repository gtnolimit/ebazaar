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
@Table(name = "product_catergory")
public class ProductCatergory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_category_Id")
	private Long product_category_Id;
	@Column
	private String attribute;
	@Column
	private Date cpd;
	@Column
	private Date upd;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID")
	private Product Product;
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
	public Product getProduct() {
		return Product;
	}
	public void setProduct(Product product) {
		Product = product;
	}

}
