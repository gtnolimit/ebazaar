package com.ebazaar.databaseobject.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Item entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ITEM_ID")
	private Long itemId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	@Column
	private String subject;
	@Column
	private String description;
	@Column
	private Long specialOfferPrice;
	@Column
	private Long specialPriceStart;
	@Column
	private Long specialPriceEnd;
	@Column
	private Long salePrice;
	@Column
	private Long listedPrice;
	@Column
	private Long qty;
	@Column
	private Long rebate;
	@Column
	private String instock;
	@Column
	private String manufactureModelNumber;
	@Column
	private String barCode;
	@Column
	private String pageLocator;
	@Column
	private String status;
	@Column
	private Timestamp upd;
	@Column
	private Timestamp cpd;

	private Long product_id;
	
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public Long getSpecialOfferPrice() {
		return specialOfferPrice;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getSpecilaOfferPrice() {
		return specialOfferPrice;
	}
	public void setSpecialOfferPrice(Long specialOfferPrice) {
		this.specialOfferPrice = specialOfferPrice;
	}
	public Long getSpecialPriceStart() {
		return specialPriceStart;
	}
	public void setSpecialPriceStart(Long specialPriceStart) {
		this.specialPriceStart = specialPriceStart;
	}
	public Long getSpecialPriceEnd() {
		return specialPriceEnd;
	}
	public void setSpecialPriceEnd(Long specialPriceEnd) {
		this.specialPriceEnd = specialPriceEnd;
	}
	public Long getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}
	public Long getListedPrice() {
		return listedPrice;
	}
	public void setListedPrice(Long listedPrice) {
		this.listedPrice = listedPrice;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	public Long getRebate() {
		return rebate;
	}
	public void setRebate(Long rebate) {
		this.rebate = rebate;
	}
	public String getInstock() {
		return instock;
	}
	public void setInstock(String instock) {
		this.instock = instock;
	}
	public String getManufactureModelNumber() {
		return manufactureModelNumber;
	}
	public void setManufactureModelNumber(String manufactureModelNumber) {
		this.manufactureModelNumber = manufactureModelNumber;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getPageLocator() {
		return pageLocator;
	}
	public void setPageLocator(String pageLocator) {
		this.pageLocator = pageLocator;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getUpd() {
		return upd;
	}
	public void setUpd(Timestamp upd) {
		this.upd = upd;
	}
	public Timestamp getCpd() {
		return cpd;
	}
	public void setCpd(Timestamp cpd) {
		this.cpd = cpd;
	}
	
}
