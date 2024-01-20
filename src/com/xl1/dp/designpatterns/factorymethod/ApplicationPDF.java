package com.xl1.dp.designpatterns.factorymethod;

// Créateur concret (Application pour générer des PDF)
class ApplicationPDF extends Application {
    @Override
    public Document creerDocument() {
        return new DocumentPDF();
    }
}
