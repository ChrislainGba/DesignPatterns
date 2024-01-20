package com.xl1.dp.designpatterns.TEMPLATEMETHOD;

//Sous-classe concrète (Café)
class Cafe extends BoissonChaude {
 @Override
 void preparerIngredients() {
     System.out.println("Infuser le café moulu dans l'eau chaude");
 }

 @Override
 void ajouterSupplements() {
     System.out.println("Ajouter du sucre et du lait");
 }
}
