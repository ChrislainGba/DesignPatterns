package com.xl1.dp.designpatterns.command;

public class CommandA implements Command{
	private RecepteurImpl1 recepteur;
	
	
	public CommandA(RecepteurImpl1 recepteur) {
		super();
		this.recepteur = recepteur;
	}


	@Override
	public void execute() {
		recepteur.action1();
		
	}

}
