package com.xl1.dp.designpatterns.prototype;

public class Book {
	private Long bId;
	private String bName;
	public Book(Long bId, String bName) {
		super();
		this.bId = bId;
		this.bName = bName;
	}
	public Long getbId() {
		return bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbId(Long bId) {
		this.bId = bId;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + "]";
	}
	
	
	
}
