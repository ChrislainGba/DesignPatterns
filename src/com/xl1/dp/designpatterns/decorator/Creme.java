package com.xl1.dp.designpatterns.decorator;
//Décorateur concret
public class Creme extends DecorateurCafe {
    public Creme(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double cout() {
        return super.cout() + 0.5;
    }
}
