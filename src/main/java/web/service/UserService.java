package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    List<User> showAllUsers();
    void updateUser(User user);
    void deleteUser(long id);
    User getUserById(long id);
    User getUserByName(String name);
}
