package com.xl1.dp.designpatterns.builder;

public class BuilderDP {

	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setId(1L).setOs("IOS").build();
		System.out.println(phone);

	}

}
