package ua.ishop.factory;

import org.apache.log4j.Logger;
import ua.ishop.service.UserService;
import ua.ishop.service.imp.UserServiceImpl;

public class UserServiceFactory {
    private static final Logger logger = Logger.getLogger(UserServiceFactory.class);
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
