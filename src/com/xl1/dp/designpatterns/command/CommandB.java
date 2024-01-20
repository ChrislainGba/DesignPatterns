package com.xl1.dp.designpatterns.command;
//Pour chaqie action de command une action du recepteur
public class CommandB implements Command{
	private RecepteurImpl1 recepteur;
	
	
	public CommandB(RecepteurImpl1 recepteur) {
		super();
		this.recepteur = recepteur;
	}


	@Override
	public void execute() {
		recepteur.action2();
		
	}

}
