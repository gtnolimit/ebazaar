package com.ebazaar.transferobject.dto;

import java.sql.Timestamp;

import com.ebazaar.databaseobject.dto.Product;

public class ItemDTO {
	private Long itemId;
	private Product product;
	private String subject;
	private String description;
	private Long specilaOfferPrice;
	private Long specialPriceStart;
	private Long specialPriceEnd;
	private Long salePrice;
	private Long listedPrice;
	private Long qty;
	private Long rebate;
	private String instock;
	private String manufactureModelNumber;
	private String barCode;
	private String pageLocator;
	private String status;
	private Timestamp upd;
	private Timestamp cpd;
	
	private Long product_id;
	
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
	public Long getSpecilaOfferPrice() {
		return specilaOfferPrice;
	}
	public void setSpecilaOfferPrice(Long specilaOfferPrice) {
		this.specilaOfferPrice = specilaOfferPrice;
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
