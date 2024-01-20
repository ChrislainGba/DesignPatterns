package com.xl1.dp.designpatterns.state;

//Contexte (Lecteur de musique)
class LecteurMusique {
	 private EtatMusique etat;
	
	 public LecteurMusique() {
	     // Initialiser avec l'état par défaut
	     this.etat = new Lecture();
	 }
	
	 public void setEtat(EtatMusique etat) {
	     this.etat = etat;
	 }
	
	 public void lire() {
	     etat.lire();
	 }
	
	 public void mettreEnPause() {
	     etat.mettreEnPause();
	 }
	
	 public void arreter() {
	     etat.arreter();
	 }
}
