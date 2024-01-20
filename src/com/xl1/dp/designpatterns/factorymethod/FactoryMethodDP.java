package com.xl1.dp.designpatterns.factorymethod;

public class FactoryMethodDP {
	//Lorsqu'une classe ne peut pas anticiper la classe d'objets qu'elle doit créer
	public static void main(String[] args) {
		Application applicationPDF = new ApplicationPDF();
        applicationPDF.nouveauDocument(); // Génère un document PDF

        Application applicationExcel = new ApplicationExcel();
        applicationExcel.nouveauDocument(); // Génère un document Excel
	}
}
