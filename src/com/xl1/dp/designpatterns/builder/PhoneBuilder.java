package com.xl1.dp.designpatterns.builder;

import java.util.Date;

public class PhoneBuilder {
	private Long id;
	private String os;
	private String processor;
	private int battery;
	private Date createdAt;

	public PhoneBuilder setId(Long id) {
		this.id = id;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
		return this;
	}
	
	public Phone build() {
		return new Phone(id, os, processor, battery, createdAt);
	}
	
	
}
