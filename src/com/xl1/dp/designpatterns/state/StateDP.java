package com.xl1.dp.designpatterns.state;

public class StateDP {
	/*
	 * Le pattern State (État) est un modèle de conception comportemental qui permet à un objet de modifier son comportement lorsqu'il change son état interne. Ce modèle est particulièrement utile lorsque vous avez un objet qui doit effectuer différentes actions en fonction de son état actuel.
	*Voici un exemple concret pour illustrer le pattern State. Supposons que nous avons un lecteur de musique qui peut être dans différents états tels que "Lecture", "Pause" et "Arrêt". Le pattern State nous permettra de représenter ces états de manière modulaire, facilitant l'ajout de nouveaux états à l'avenir.
	 */
	public static void main(String[] args) {
		 LecteurMusique lecteur = new LecteurMusique();

        lecteur.lire();  // Démarre la lecture
        lecteur.mettreEnPause();  // Met en pause
        lecteur.arreter();  // Arrête

        // Changement d'état
        lecteur.setEtat(new Pause());

        lecteur.lire();  // Reprend la lecture
        lecteur.arreter();  // Arrête

	}

}
