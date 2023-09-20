package ua.ishop.factory;

import org.apache.log4j.Logger;
import ua.ishop.dao.UserDao;
import ua.ishop.dao.impl.UserDaoJdbcImpl;

public class UserDaoFactory {
    private static final Logger logger = Logger.getLogger(UserDaoFactory.class);

    private static UserDao instance;

    private UserDaoFactory() {
    }

    public static synchronized UserDao getUserDao() {
        if (instance == null) {
            instance = new UserDaoJdbcImpl();
        }
        return instance;
    }
}
