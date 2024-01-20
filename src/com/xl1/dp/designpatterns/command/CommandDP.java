package com.xl1.dp.designpatterns.command;

public class CommandDP {
	//Catégorie: Comportement
	//Objectif: Encapsuler une requete sous la forme d'object.
	//			Parametrer facilement des requetes diverses.
	//			Permettre des requetes reversibles.
	//Résultat: Isolation d'une requete.
	//Exemple: Télécommande universelle

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecepteurImpl1 rec1 = new RecepteurImpl1();
		RecepteurImpl2 rec2 = new RecepteurImpl2();
		
		Command cmd1 = new CommandA(rec1);
		Command cmd2 = new CommandB(rec1);
		Command cmd3 = new CommandC(rec2);
		
		Invoqueur telecommand = new Invoqueur();
		
		telecommand.addCommand("A", cmd1);
		telecommand.addCommand("B", cmd2);
		telecommand.addCommand("C", cmd3);
		
		telecommand.invoquer("A");
		telecommand.invoquer("D");//nothing todo
		telecommand.invoquer("B");
		telecommand.invoquer("C");
		
		
		

	}

}
