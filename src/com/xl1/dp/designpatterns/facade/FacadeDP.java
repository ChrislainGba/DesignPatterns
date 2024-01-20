package com.xl1.dp.designpatterns.facade;
/*
 * Le pattern Facade est un modèle de conception structurel qui fournit une interface unifiée pour un ensemble d'interfaces d'un sous-système, rendant ainsi le sous-système plus facile à utiliser. Le but principal du pattern Facade est de simplifier l'interface d'un ensemble de classes ou de sous-systèmes complexes.

 *Voici un exemple concret pour illustrer le pattern Facade. Supposons que nous avons un système de gestion de fichiers avec différentes classes pour manipuler des fichiers, des dossiers et des permissions.
 */
public class FacadeDP {

	public static void main(String[] args) {
		FacadeGestionFichiers facade = new FacadeGestionFichiers();

        // Utilisation de la façade pour simplifier l'utilisation des sous-systèmes
        facade.ouvrirFichier("document.txt");
        facade.creerDossier("nouveauDossier");
        facade.attribuerPermissions("document.txt", "utilisateur1");

	}

}
