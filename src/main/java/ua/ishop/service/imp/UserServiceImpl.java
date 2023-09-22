package ua.ishop.service.imp;


import ua.ishop.dao.UserDao;
import ua.ishop.factory.UserDaoFactory;
import ua.ishop.model.User;
import ua.ishop.service.UserService;

import java.util.List;


public class UserServiceImpl implements UserService {

    private static final UserDao userDao = UserDaoFactory.getUserDao();

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    public User findUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUserById(long id) {
        userDao.deleteUserById(id);
    }
}