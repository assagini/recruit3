package com.recruit.domain;

public class RLicenseVO {
	
	private int id;
	private int rid;
	private String test;
	private String publeoffice;
	private String acquidate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getPubleoffice() {
		return publeoffice;
	}
	public void setPubleoffice(String publeoffice) {
		this.publeoffice = publeoffice;
	}
	public String getAcquidate() {
		return acquidate;
	}
	public void setAcquidate(String acquidate) {
		this.acquidate = acquidate;
	}
	@Override
	public String toString() {
		return "RLicenseVO [id=" + id + ", rid=" + rid + ", test=" + test + ", publeoffice=" + publeoffice
				+ ", acquidate=" + acquidate + "]";
	}	
	
}
