package com.xl1.dp.designpatterns.TEMPLATEMETHOD;

//Classe abstraite représentant le processus de préparation de la boisson
abstract class BoissonChaude {

 // Template Method qui définit l'algorithme général
 public final void preparerBoisson() {
     faireBouillirEau();
     preparerIngredients();
     verserDansTasse();
     ajouterSupplements();
 }

 // Méthodes abstraites qui seront redéfinies par les sous-classes
 abstract void preparerIngredients();
 abstract void ajouterSupplements();

 // Méthodes communes à toutes les boissons
 void faireBouillirEau() {
     System.out.println("Faire bouillir de l'eau");
 }

 void verserDansTasse() {
     System.out.println("Verser dans la tasse");
 }
}

