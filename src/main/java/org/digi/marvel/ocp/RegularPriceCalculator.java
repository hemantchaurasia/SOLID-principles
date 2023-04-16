package org.digi.marvel.ocp;

public class RegularPriceCalculator implements IPriceCalculator {
    @Override
    public double calculatePrice(double price) {
        return price;
    }
}

