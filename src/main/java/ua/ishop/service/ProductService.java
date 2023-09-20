package ua.ishop.service;

import ua.ishop.model.Product;
import ua.ishop.model.User;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    void addProduct(Product product);

    Product findProductByName(String name);
    User getProductById(long id);
    void updateProduct(Product product);
    void deleteProductById(long id);

}