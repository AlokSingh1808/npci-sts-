package com.example.ecommerce.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@Column(name ="id")
	private Integer id;
	
	@Column(name ="sku")
	private String sku;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="description")
	private String description;
	
	@Column(name ="unitprice")
	private Integer unitPrice;
	
	@Column(name ="imageurl")
	private String imageurl;
	
	@Column(name ="unitsinstock")
	private Integer unitsinStock;
	
	@Column(name ="datecreated")
	private Date dateCreated;
	
	@Column(name ="lastupdated")
	private Date lastUpdated;
	
	@Column(name ="categoryid")
	private Integer categoryId;
	
	public Product() {
		
	}

	public Product(Integer id, String sku, String name, String description, Integer unitPrice, String imageurl,
			Integer unitsinStock, Date dateCreated, Date lastUpdated, Integer categoryId) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.imageurl = imageurl;
		this.unitsinStock = unitsinStock;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.categoryId = categoryId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected String getSku() {
		return sku;
	}

	protected void setSku(String sku) {
		this.sku = sku;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getDescription() {
		return description;
	}

	protected void setDescription(String description) {
		this.description = description;
	}

	protected Integer getUnitPrice() {
		return unitPrice;
	}

	protected void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	protected String getImageurl() {
		return imageurl;
	}

	protected void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	protected Integer getUnitsinStock() {
		return unitsinStock;
	}

	protected void setUnitsinStock(Integer unitsinStock) {
		this.unitsinStock = unitsinStock;
	}

	protected Date getDateCreated() {
		return dateCreated;
	}

	protected void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	protected Date getLastUpdated() {
		return lastUpdated;
	}

	protected void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	protected Integer getCategoryId() {
		return categoryId;
	}

	protected void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description + ", unitPrice="
				+ unitPrice + ", imageurl=" + imageurl + ", unitsinStock=" + unitsinStock + ", dateCreated="
				+ dateCreated + ", lastUpdated=" + lastUpdated + ", categoryId=" + categoryId + "]";
	}
	
}
