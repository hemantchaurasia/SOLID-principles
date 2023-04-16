package org.digi.marvel.dip;

import org.digi.marvel.lsp.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getProducts();
    void addProduct(Product product);
    void removeProduct(Product product);
    // Other methods related to managing products
}
