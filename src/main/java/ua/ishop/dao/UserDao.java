package ua.ishop.dao;

import ua.ishop.model.User;

import java.util.List;

public interface UserDao {

    void save(User user);
    List<User> getUsers();
    User getUserByEmail(String email);
    User getUserById(long id);
    void updateUser(User user);
    void deleteUserById(long id);
}
