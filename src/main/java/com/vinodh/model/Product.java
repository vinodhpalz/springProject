package com.vinodh.model;

import java.util.ArrayList;
import java.util.Date;

public class Product {
	private String pName;
	private Long pCost;
	private String pDesc;
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
