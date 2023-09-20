package ua.ishop.dao.impl;

import org.apache.log4j.Logger;
import ua.ishop.dao.UserDao;
import ua.ishop.db.Storage;
import ua.ishop.model.User;

import java.util.List;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

    @Override
    public void save(User user) {
        if (user != null) {
            Storage.addUser(user);
        }
    }

    @Override
    public void deleteUserById(long id) {

    }

    @Override
    public List<User> getUsers() {
        return Storage.getUsers();
    }

    public User getUserByEmail(String email) {
        return Storage.getUserByEmail(email);
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public void updateUser(User user) {
    }
}