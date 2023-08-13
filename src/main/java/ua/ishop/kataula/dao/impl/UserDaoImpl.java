package ua.ishop.kataula.dao.impl;

import ua.ishop.kataula.dao.UserDao;
import ua.ishop.kataula.db.Storage;
import ua.ishop.kataula.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) {
        if (user != null) {
            Storage.addUser(user);
        }
    }

    @Override
    public List<User> getUsers() {
        return Storage.getUsers();
    }
}
