package ua.ishop.kataula.dao;

import ua.ishop.kataula.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getUsers();
}
