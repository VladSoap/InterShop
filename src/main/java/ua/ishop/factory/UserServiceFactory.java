package ua.ishop.factory;


import ua.ishop.service.UserService;
import ua.ishop.service.imp.UserServiceImpl;

public class UserServiceFactory {

    private static UserService instance;

    private UserServiceFactory() {
    }

    public static synchronized UserService getUserService() {
        if (instance == null) {
            instance = new UserServiceImpl();
        }
        return instance;
    }
}
