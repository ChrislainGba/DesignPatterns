package com.xl1.dp.designpatterns.command;
//Pour chaqie action de command une action du recepteur
public class CommandC implements Command{
	private RecepteurImpl2 recepteur;
	
	
	public CommandC(RecepteurImpl2 recepteur) {
		super();
		this.recepteur = recepteur;
	}


	@Override
	public void excercute() {
		recepteur.action3();
		
	}

}
