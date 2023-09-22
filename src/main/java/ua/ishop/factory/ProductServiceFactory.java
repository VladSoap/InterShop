package ua.ishop.factory;


import ua.ishop.service.ProductService;
import ua.ishop.service.UserService;
import ua.ishop.service.imp.ProductServiceImpl;
import ua.ishop.service.imp.UserServiceImpl;

public class ProductServiceFactory {


    private static ProductService instance;

    private ProductServiceFactory() {
    }

    public static synchronized ProductService getProductService() {
        if (instance == null) {
            instance = (ProductService) new ProductServiceImpl();
        }
        return instance;
    }
}
