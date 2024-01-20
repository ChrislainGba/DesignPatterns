package com.xl1.dp.designpatterns.decorator;

//Décorateur concret
public class Chocolat extends DecorateurCafe {
    public Chocolat(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double cout() {
        return super.cout() + 0.7;
    }
}
