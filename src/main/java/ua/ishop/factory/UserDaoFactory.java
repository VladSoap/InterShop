package ua.ishop.factory;


import ua.ishop.dao.UserDao;
import ua.ishop.dao.impl.UserDaoJdbcImpl;

public class UserDaoFactory {


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
