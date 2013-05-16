package com.ebazaar.transferobject.dto;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;

import com.ebazaar.databaseobject.dto.Product;

public class ItemDTO {
	private Long itemId;
	private Product product;
	private String subject;

	private String description;

	private double specialOfferPrice;

	private Date specialPriceStart;

	private Date specialPriceEnd;

	private double salePrice;

	private double listedPrice;

	private Long qty;
	
	private double rebate;
	
	private Long instock;
	
	private String manufactureModelNumber;
	
	private String barCode;
	
	private String pageLocator;
	
	private String status;
	
	private Timestamp upd;
	
	private Timestamp cpd;

	private Long product_id;
	
	private Long manufacture_id;
	
	
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
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

	public Date getSpecialPriceStart() {
		return specialPriceStart;
	}
	public void setSpecialPriceStart(Date specialPriceStart) {
		this.specialPriceStart = specialPriceStart;
	}
	public Date getSpecialPriceEnd() {
		return specialPriceEnd;
	}
	public void setSpecialPriceEnd(Date specialPriceEnd) {
		this.specialPriceEnd = specialPriceEnd;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getListedPrice() {
		return listedPrice;
	}
	public void setListedPrice(double listedPrice) {
		this.listedPrice = listedPrice;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	public double getRebate() {
		return rebate;
	}
	public void setRebate(double rebate) {
		this.rebate = rebate;
	}
	public Long getInstock() {
		return instock;
	}
	public void setInstock(Long instock) {
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
