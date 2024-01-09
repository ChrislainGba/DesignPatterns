package com.xl1.dp.designpatterns.observer;

public class Suscriber implements Observer {
	private String name;
	private Channel channel;
	
	
	
	public Suscriber(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Suscriber sub) {
		System.out.println("Hi "+sub.getName()+" video updated");
	}
	@Override
	public void suscribeChannel(Channel ch) {
		this.channel = ch;
		ch.suscribe(this);
	}

}
