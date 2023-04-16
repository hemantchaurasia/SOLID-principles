package org.digi.marvel.dip;

import org.digi.marvel.lsp.Product;

import java.util.List;

public class ProductCatalog {
    private IProductRepository productRepository;

    public ProductCatalog(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    public void removeProduct(Product product) {
        productRepository.removeProduct(product);
    }

    // Other methods related to managing products
}
