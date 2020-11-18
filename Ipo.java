package com.waleed.stock.training;

public class Ipo {
	int ipoid, stkex, pps,tns;
	String cname,odate,remarks;
	
	public Ipo(int ipoid, String cname,int stkex, int pps, int tns,  String odate, String remarks) {
		
		this.ipoid = ipoid;
		this.stkex = stkex;
		this.pps = pps;
		this.tns = tns;
		this.cname = cname;
		this.odate = odate;
		this.remarks = remarks;
	}
	public int getIpoid() {
		return ipoid;
	}
	public void setIpoid(int ipoid) {
		this.ipoid = ipoid;
	}
	public int getStkex() {
		return stkex;
	}
	public void setStkex(int stkex) {
		this.stkex = stkex;
	}
	public int getPps() {
		return pps;
	}
	public void setPps(int pps) {
		this.pps = pps;
	}
	public int getTns() {
		return tns;
	}
	public void setTns(int tns) {
		this.tns = tns;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
		
}
