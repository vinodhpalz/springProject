package com.vinodh.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"pCost"})
@JsonPropertyOrder({"ProductName","pCost","pDesc","pDOM"})
public class Product {
	
	@Pattern(regexp = "[^0-9]*")
	@JsonProperty("ProductName")
	private String pName;
	@Max(9999)
	private Long pCost;
	@Size(min=3, max=10)
	private String pDesc;
	@Past
	private Date pDOM;
	private ArrayList<String> pList;
	private Supplier supplier;
	
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Long getpCost() {
		return pCost;
	}
	public void setpCost(Long pCost) {
		this.pCost = pCost;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	public Date getpDOM() {
		return pDOM;
	}
	public void setpDOM(Date pDOM) {
		this.pDOM = pDOM;
	}
	public ArrayList<String> getpList() {
		return pList;
	}
	public void setpList(ArrayList<String> pList) {
		this.pList = pList;
	}

	
	
}
