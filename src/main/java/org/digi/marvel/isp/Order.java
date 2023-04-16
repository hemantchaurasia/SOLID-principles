package org.digi.marvel.isp;

import org.digi.marvel.lsp.Product;

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;
    private double total;

    public Order(int orderId, Customer customer, List<Product> products, double total) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.total = total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Other methods related to orders
}
