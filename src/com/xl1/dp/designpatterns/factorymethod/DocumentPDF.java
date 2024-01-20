package com.xl1.dp.designpatterns.factorymethod;

//Produit concret (Document PDF)
class DocumentPDF implements Document {
 @Override
 public void genererDocument() {
     System.out.println("Génération d'un document PDF.");
     // Logique spécifique à la génération d'un PDF
 }
}
