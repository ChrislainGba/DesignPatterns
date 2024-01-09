package com.xl1.dp.designpatterns.factory;

public class FactoryDP {

	public static void main(String[] args) {
		OsFactory osFactory = new OsFactory();
		OS os = osFactory.getInstance("mac");
		os.spec();
		OS os1 = osFactory.getInstance("android");
		os1.spec();

	}

}
