package com.waleed.stock.training;

public class Company {
	int cId,turnover,stkCode;
	String cName,ceo,boardDir,listed,sector,writeUp;
	public Company(int cId, String cName,int turnover, String ceo, String boardDir, String listed,
			String sector, String writeUp, int stkCode) {
		super();
		this.cId = cId;
		this.turnover = turnover;
		this.stkCode = stkCode;
		this.cName = cName;
		this.ceo = ceo;
		this.boardDir = boardDir;
		this.listed = listed;
		this.sector = sector;
		this.writeUp = writeUp;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	public int getStkCode() {
		return stkCode;
	}
	public void setStkCode(int stkCode) {
		this.stkCode = stkCode;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardDir() {
		return boardDir;
	}
	public void setBoardDir(String boardDir) {
		this.boardDir = boardDir;
	}
	public String getListed() {
		return listed;
	}
	public void setListed(String listed) {
		this.listed = listed;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getWriteUp() {
		return writeUp;
	}
	public void setWriteUp(String writeUp) {
		this.writeUp = writeUp;
	}
	
}
