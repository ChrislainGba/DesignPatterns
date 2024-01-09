package com.xl1.dp.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
	
	String name;
	List<Component> components = new ArrayList<>();
	
	

	public Composite(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void showprice() {
		System.out.println(name);
		components.forEach(c -> {
			c.showprice();
		});
		
	}
	public void addComponent(Component com) {
		components.add(com);
	}
	public void removeComponent(Component com) {
		components.remove(com);
	}

}
