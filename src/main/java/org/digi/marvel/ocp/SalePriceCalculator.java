package org.digi.marvel.ocp;

public class SalePriceCalculator implements IPriceCalculator {
    private double discount;

    public SalePriceCalculator(double discount) {
        this.discount = discount;
    }

    @Override
    public double calculatePrice(double price) {
        return price - (price * discount);
    }
}

