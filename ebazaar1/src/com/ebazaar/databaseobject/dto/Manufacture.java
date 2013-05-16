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
@Table(name="manufacture")
public class Manufacture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MANUFACTURE_ID")
	private int manufacture_id;
	@OneToMany(fetch = FetchType.LAZY,mappedBy="manufacture")
	private List<Item> item;
	@Column
	private String name;
	
	
	@Column
	private Integer manufacturenumber;
	@Column(name="AUTHORIZE_PICTURE")
	private String authorizePicture;
	@Column
	private String status;
	@Column
	private Date cpd;
	@Column
	private Date upd;
	public Integer getManufacture_id() {
		return manufacture_id;
	}
	
	public void setManufacture_id(Integer manufacture_id) {
		this.manufacture_id = manufacture_id;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getManufacturenumber() {
		return manufacturenumber;
	}
	public void setManufacturenumber(int manufacturenumber) {
		this.manufacturenumber = manufacturenumber;
	}
	public String getAuthorizePicture() {
		return authorizePicture;
	}
	public void setAuthorizePicture(String authorizePicture) {
		this.authorizePicture = authorizePicture;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
