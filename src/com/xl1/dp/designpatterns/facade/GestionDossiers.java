package com.xl1.dp.designpatterns.facade;

//Sous-système complexe - Gestion des dossiers
class GestionDossiers {
 public void creerDossier(String nomDossier) {
     System.out.println("Création du dossier : " + nomDossier);
 }

 public void supprimerDossier(String nomDossier) {
     System.out.println("Suppression du dossier : " + nomDossier);
 }
}