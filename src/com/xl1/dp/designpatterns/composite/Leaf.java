package com.xl1.dp.designpatterns.composite;

public class Leaf implements Component{
	
	Double price;
	String name;
	
	
	
	public Leaf(Double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}



	@Override
	public void showprice() {
		System.out.println(name+" : "+price);
	}

}
