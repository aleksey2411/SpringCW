package by.bsuir.project.service.impl;

import by.bsuir.project.model.User;
import by.bsuir.project.model.UserRole;
import by.bsuir.project.repository.UserRepository;
import by.bsuir.project.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;


    @Autowired
    private UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(UUID id) {
        return userRepository.findUserById(id)
                .orElseThrow(()->new NoSuchElementException());
    }

    @Override
    public User save(User user) {
        user.setUserRole(UserRole.USER);
        return userRepository.save(user);
    }

    @Override
    public boolean isEmailFree(String email) {
        boolean isFree = true;
        Optional<User> user = userRepository.findUserByEmail(email);
        if (user.isPresent()) {
            isFree = false;
        }
        return isFree;
    }
}
