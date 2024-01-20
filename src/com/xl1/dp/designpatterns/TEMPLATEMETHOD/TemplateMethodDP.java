package com.xl1.dp.designpatterns.TEMPLATEMETHOD;

/*
 * Le pattern Template Method est un modèle de conception comportemental qui définit le squelette d'un algorithme dans une méthode, mais laisse certaines étapes à des sous-classes. Ainsi, les sous-classes peuvent redéfinir certaines étapes de l'algorithme sans changer sa structure globale.
 *Voici un exemple concret pour illustrer le pattern Template Method. Supposons que nous construisons un processus de fabrication pour la préparation d'une boisson chaude, comme le thé ou le café.
 */
public class TemplateMethodDP {

	public static void main(String[] args) {
		BoissonChaude the = new The();
        the.preparerBoisson();
        System.out.println();

        BoissonChaude cafe = new Cafe();
        cafe.preparerBoisson();

	}

}
