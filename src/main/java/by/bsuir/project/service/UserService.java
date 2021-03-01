package by.bsuir.project.service;

import by.bsuir.project.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> findAllUsers();
    User findUserById(UUID id);
    User save(User user);
    boolean isEmailFree(String email);
}
