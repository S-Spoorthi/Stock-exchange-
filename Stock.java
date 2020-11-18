package com.waleed.stock.training;

public class Stock {
	int stkid,stkex;
	String brief, contact,remarks;
	public int getStkid() {
		return stkid;
	}
	public void setStkid(int stkid) {
		this.stkid = stkid;
	}
	public int getStkex() {
		return stkex;
	}
	public void setStkex(int stkex) {
		this.stkex = stkex;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Stock(int stkid, int stkex, String brief, String contact, String remarks) {
		this.stkid = stkid;
		this.stkex = stkex;
		this.brief = brief;
		this.contact = contact;
		this.remarks = remarks;
	}
	
}
