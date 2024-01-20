package com.xl1.dp.designpatterns.state;

//État concret
class Lecture implements EtatMusique {
 @Override
 public void lire() {
     System.out.println("Déjà en lecture");
 }

 @Override
 public void mettreEnPause() {
     System.out.println("Passage en pause");
 }

 @Override
 public void arreter() {
     System.out.println("Arrêt de la lecture");
 }
}

