package org.digi.marvel.isp;

public class CheckoutService {
    private IOrderProcessor orderProcessor;

    public CheckoutService(IOrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public void checkout(Order order) {
        // Code for processing the order
        orderProcessor.processOrder(order);
    }

    // Other methods related to checkout
}
