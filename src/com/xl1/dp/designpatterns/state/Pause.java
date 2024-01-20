package com.xl1.dp.designpatterns.state;

// État concret
class Pause implements EtatMusique {
    @Override
    public void lire() {
        System.out.println("Reprise de la lecture");
    }

    @Override
    public void mettreEnPause() {
        System.out.println("Déjà en pause");
    }

    @Override
    public void arreter() {
        System.out.println("Arrêt de la lecture");
    }
}

