package ua.ishop.kataula.service.impl;

import ua.ishop.kataula.dao.UserDao;
import ua.ishop.kataula.dao.impl.UserDaoImpl;
import ua.ishop.kataula.model.User;
import ua.ishop.kataula.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static final UserDao userDao = new UserDaoImpl();

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
