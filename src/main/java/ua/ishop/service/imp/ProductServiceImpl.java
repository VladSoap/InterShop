package ua.ishop.service.imp;

import org.apache.log4j.Logger;
import ua.ishop.dao.ProductDao;
import ua.ishop.dao.UserDao;
import ua.ishop.factory.ProductDaoFactory;
import ua.ishop.factory.UserDaoFactory;
import ua.ishop.model.Product;
import ua.ishop.model.User;
import ua.ishop.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private static final Logger logger = Logger.getLogger(ProductServiceImpl.class);
    private static final ProductDao productDao = ProductDaoFactory.getProductDao();

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productDao.getProducts();
    }

    @Override
    public Product findProductByName(String name) {
        return null;
    }

    @Override
    public User getProductById(long id) {
        return null;
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProductById(long id) {

    }

}
