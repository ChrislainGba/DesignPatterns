package com.xl1.dp.designpatterns.mediator;

/*
 * Le pattern Mediator est un modèle de conception comportemental qui définit un objet (le médiateur) qui centralise les communications entre plusieurs objets. Plutôt que de permettre aux objets de communiquer directement entre eux, ils passent par le médiateur. Cela favorise la dépendance minimale entre les objets en les rendant indépendants les uns des autres.

 *Voici un exemple concret pour illustrer le pattern Mediator. Supposons que nous développons un système de chat où plusieurs utilisateurs peuvent s'envoyer des messages, et nous voulons utiliser le pattern Mediator pour gérer les communications entre ces utilisateurs.
 */
public class MediatorDP {

	public static void main(String[] args) {
		 	MediateurChat mediateur = new MediateurChatImpl();

	        Utilisateur user1 = new Utilisateur("Alice", mediateur);
	        Utilisateur user2 = new Utilisateur("Bob", mediateur);
	        Utilisateur user3 = new Utilisateur("Charlie", mediateur);

	        ((MediateurChatImpl) mediateur).ajouterUtilisateur(user1);
	        ((MediateurChatImpl) mediateur).ajouterUtilisateur(user2);
	        ((MediateurChatImpl) mediateur).ajouterUtilisateur(user3);

	        user1.envoyerMessage("Salut à tous !");
	        System.out.println();

	        user2.envoyerMessage("Bonjour, comment ça va ?");
	        System.out.println();

	        user3.envoyerMessage("Je suis nouveau ici.");

	}

}
