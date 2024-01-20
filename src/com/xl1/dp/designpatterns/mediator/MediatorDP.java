package com.xl1.dp.designpatterns.mediator;

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
