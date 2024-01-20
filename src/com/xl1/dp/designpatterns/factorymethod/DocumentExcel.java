package com.xl1.dp.designpatterns.factorymethod;

//Produit concret (Document Excel)
class DocumentExcel implements Document {
 @Override
 public void genererDocument() {
     System.out.println("Génération d'un document Excel.");
     // Logique spécifique à la génération d'un Excel
 }
}
