package com.xl1.dp.designpatterns.decorator;

//Décorateur abstrait
public abstract class DecorateurCafe implements Cafe {
    protected Cafe cafe;

    public DecorateurCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double cout() {
        return cafe.cout();
    }
}