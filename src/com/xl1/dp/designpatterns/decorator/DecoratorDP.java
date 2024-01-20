package com.xl1.dp.designpatterns.decorator;

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
