package com.xl1.dp.designpatterns.facade;

// Facade
class FacadeGestionFichiers {
    private GestionFichiers gestionFichiers;
    private GestionDossiers gestionDossiers;
    private GestionPermissions gestionPermissions;

    public FacadeGestionFichiers() {
        this.gestionFichiers = new GestionFichiers();
        this.gestionDossiers = new GestionDossiers();
        this.gestionPermissions = new GestionPermissions();
    }

    // Méthodes simplifiées pour l'utilisateur
    public void ouvrirFichier(String nomFichier) {
        gestionFichiers.ouvrirFichier(nomFichier);
    }

    public void fermerFichier(String nomFichier) {
        gestionFichiers.fermerFichier(nomFichier);
    }

    public void creerDossier(String nomDossier) {
        gestionDossiers.creerDossier(nomDossier);
    }

    public void supprimerDossier(String nomDossier) {
        gestionDossiers.supprimerDossier(nomDossier);
    }

    public void attribuerPermissions(String nomFichier, String utilisateur) {
        gestionPermissions.attribuerPermissions(nomFichier, utilisateur);
    }
}
