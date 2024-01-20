package com.xl1.dp.designpatterns.facade;

//Sous-système complexe - Gestion des permissions
class GestionPermissions {
 public void attribuerPermissions(String nomFichier, String utilisateur) {
     System.out.println("Attribution de permissions pour " + utilisateur + " sur le fichier " + nomFichier);
 }
}
