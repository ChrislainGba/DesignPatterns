package com.xl1.dp.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

//Classe concrète Mediateur
class MediateurChatImpl implements MediateurChat {
 private List<Utilisateur> utilisateurs;

 public MediateurChatImpl() {
     this.utilisateurs = new ArrayList<>();
 }

 public void ajouterUtilisateur(Utilisateur utilisateur) {
     utilisateurs.add(utilisateur);
 }

 @Override
 public void envoyerMessage(Utilisateur utilisateur, String message) {
     for (Utilisateur destinataire : utilisateurs) {
         // Envoyer le message à tous les utilisateurs sauf à l'émetteur
         if (destinataire != utilisateur) {
             destinataire.recevoirMessage(message);
         }
     }
 }
}
