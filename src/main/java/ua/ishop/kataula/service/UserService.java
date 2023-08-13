package ua.ishop.kataula.service;

import ua.ishop.kataula.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getUsers();
}
