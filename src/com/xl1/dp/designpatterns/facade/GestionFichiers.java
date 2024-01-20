package com.xl1.dp.designpatterns.facade;

//Sous-système complexe - Gestion des fichiers
class GestionFichiers {
 public void ouvrirFichier(String nomFichier) {
     System.out.println("Ouverture du fichier : " + nomFichier);
 }

 public void fermerFichier(String nomFichier) {
     System.out.println("Fermeture du fichier : " + nomFichier);
 }
}