package com.xl1.dp.designpatterns.TEMPLATEMETHOD;

//Sous-classe concrète (Thé)
class The extends BoissonChaude {
 @Override
 void preparerIngredients() {
     System.out.println("Infuser le thé dans l'eau chaude");
 }

 @Override
 void ajouterSupplements() {
     System.out.println("Ajouter du citron");
 }
}
