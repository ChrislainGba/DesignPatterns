package com.xl1.dp.designpatterns.observer;

public interface Subject {
	public void suscribe(Suscriber sub);
	
	public void onSuscribe(Observer sub);
	
	public void notifySuscriber();
	
	public void upload(String title) ;
}