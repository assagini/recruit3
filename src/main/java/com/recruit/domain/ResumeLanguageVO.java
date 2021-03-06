package com.recruit.domain;

public class ResumeLanguageVO {
	
	private int id;
	private int rid;
	private int lid;
	private String test;
	private String score;
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
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
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
		return "ResumeLanguageVO [id=" + id + ", rid=" + rid + ", lid=" + lid + ", test=" + test + ", score=" + score
				+ ", publeoffice=" + publeoffice + ", acquidate=" + acquidate + "]";
	}	
	
}
