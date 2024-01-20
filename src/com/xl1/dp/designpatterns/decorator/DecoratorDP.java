package com.xl1.dp.designpatterns.decorator;
/*
 * Le design pattern Decorator est un pattern structurel qui permet d'attacher dynamiquement des responsabilités supplémentaires à un objet. Il est souvent utilisé pour étendre les fonctionnalités d'objets de manière flexible et sans modifier leur structure de base.

 *Intentions du Decorator :

 *Attacher des responsabilités supplémentaires à un objet de manière dynamique.
 *Fournir une alternative à la sous-classe pour étendre la fonctionnalité.
 */
public class DecoratorDP {

	public static void main(String[] args) {
		Cafe cafeSimple = new Espresso();
        System.out.println("Coût d'un espresso simple : " + cafeSimple.cout());

        Cafe cafeAvecCreme = new Creme(new Espresso());
        System.out.println("Coût d'un espresso avec crème : " + cafeAvecCreme.cout());

        Cafe cafeAvecChocolatEtCreme = new Chocolat(new Creme(new Espresso()));
        System.out.println("Coût d'un espresso avec chocolat et crème : " + cafeAvecChocolatEtCreme.cout());

	}

}
