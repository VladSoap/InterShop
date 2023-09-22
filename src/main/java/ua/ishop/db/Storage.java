package ua.ishop.db;

import ua.ishop.model.User;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static final List<User> users = new ArrayList<>() {{
        add(new User("s.klunniy@gmail.com", "123"));
        add(new User("s.klunniy1@gmail.com", "123"));
    }};

    public static void addUser(User user) {
        if (user != null) {
            users.add(user);
        }
    }

    public static List<User> getUsers() {
        return users;
    }

    public static User getUserByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
    };

}
