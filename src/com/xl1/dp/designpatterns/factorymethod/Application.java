package com.xl1.dp.designpatterns.factorymethod;

//Créateur abstract (Application)
abstract class Application {
 // La Factory Method
 public abstract Document creerDocument();

 // Autres méthodes utilisant le document
 public void nouveauDocument() {
     Document document = creerDocument();
     document.genererDocument();
 }
}
