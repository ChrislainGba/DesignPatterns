package com.xl1.dp.designpatterns.observer;
//Lorsque la modification d'un objet doit entraîner des modifications dans d'autres objets sans les coupler de manière rigide.
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
