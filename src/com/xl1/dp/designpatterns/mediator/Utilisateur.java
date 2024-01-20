package com.xl1.dp.designpatterns.mediator;

//Classe collègue (Utilisateur)
class Utilisateur {
 private String nom;
 private MediateurChat mediateur;

 public Utilisateur(String nom, MediateurChat mediateur) {
     this.nom = nom;
     this.mediateur = mediateur;
 }

 public void envoyerMessage(String message) {
     System.out.println(nom + " envoie le message : " + message);
     mediateur.envoyerMessage(this, message);
 }

 public void recevoirMessage(String message) {
     System.out.println(nom + " reçoit le message : " + message);
 }
}
