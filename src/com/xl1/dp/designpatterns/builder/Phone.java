package com.xl1.dp.designpatterns.builder;

import java.util.Date;

public class Phone {
	private Long id;
	private String os;
	private String processor;
	private int battery;
	private Date createdAt;
	
	public Phone(Long id, String os, String processor, int battery, Date createdAt) {
		super();
		this.id = id;
		this.os = os;
		this.processor = processor;
		this.battery = battery;
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", os=" + os + ", processor=" + processor + ", battery=" + battery + ", createdAt="
				+ createdAt + "]";
	}
	
	
}
