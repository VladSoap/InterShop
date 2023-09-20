package ua.ishop.dao;

import ua.ishop.model.Product;
import ua.ishop.model.User;

import java.util.List;

public interface ProductDao {
    void save(Product product);
    List<Product> getProducts();

    Product findProductByName(String name);
    Product getProductById(long id);
    void updateProduct(Product product);
    void deleteProductById(long id);
}
