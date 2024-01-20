package com.xl1.dp.designpatterns.state;

//État concret
class Arret implements EtatMusique {
 @Override
 public void lire() {
     System.out.println("Démarrage de la lecture");
 }

 @Override
 public void mettreEnPause() {
     System.out.println("Impossible de mettre en pause, le lecteur est arrêté");
 }

 @Override
 public void arreter() {
     System.out.println("Déjà arrêté");
 }
}

