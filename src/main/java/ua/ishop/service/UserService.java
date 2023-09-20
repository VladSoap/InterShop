package ua.ishop.service;

import ua.ishop.model.User;

import java.util.List;

public interface UserService {
        void addUser(User user);
        List<User> getUsers();

        User findUserByEmail(String email);
        User getUserById(long id);
        void updateUser(User user);
        void deleteUserById(long id);
}
