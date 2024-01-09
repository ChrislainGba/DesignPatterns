package com.xl1.dp.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
	private String title;
	List<Suscriber> suscribers = new ArrayList<>();

	public void suscribe(Suscriber sub) {
		suscribers.add(sub);
	}
	
	public void onSuscribe(Observer sub) {
		suscribers.remove(sub);
	}
	
	public void notifySuscriber() {
		for(Suscriber sub : suscribers) {
			sub.update(sub);
		}
	}
	public void upload(String title) {
		this.title = title;
		this.notifySuscriber();
	}
}
