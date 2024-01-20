package com.xl1.dp.designpatterns.composite;
//Compose des objets dans des structures arborescentes pour représenter une hiérarchie partie-tout.
public class CompositeDP {
	public static void main(String[] args) {
		Component hd = new Leaf(300.5, "HDD");
		Component mouse = new Leaf(200.5, "Mouse");
		Component monitor = new Leaf(4500.5, "Monitor");
		Component ram = new Leaf(400.5, "Ram");
		Component cpu = new Leaf(500.5, "CPU");
		
		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(mb);
		cabinet.addComponent(hd);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showprice();
		
		
	}
}
