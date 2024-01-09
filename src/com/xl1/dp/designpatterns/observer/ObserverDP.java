package com.xl1.dp.designpatterns.observer;

public class ObserverDP {

	public static void main(String[] args) {
		
		Channel ch = new Channel();
		
		Observer sub = new Suscriber("Xl1");
		Observer sub1 = new Suscriber("Eko");
		
		//ch.suscribe(sub);
		//ch.suscribe(sub1);
		
		sub.suscribeChannel(ch);
		sub1.suscribeChannel(ch);
		
		
		ch.upload("Master java programming");

	}

}
