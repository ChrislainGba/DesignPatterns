package com.xl1.dp.designpatterns.factorymethod;

//Créateur concret (Application pour générer des Excel)
class ApplicationExcel extends Application {
 @Override
 public Document creerDocument() {
     return new DocumentExcel();
 }
}
