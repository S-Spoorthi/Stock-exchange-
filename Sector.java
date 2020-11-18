package com.waleed.stock.training;

public class Sector {
	int sid;
	String snam,brief;
	
	public Sector(int sid, String snam, String brief) {
		this.sid = sid;
		this.snam = snam;
		this.brief = brief;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSnam() {
		return snam;
	}
	public void setSnam(String snam) {
		this.snam = snam;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	
}
