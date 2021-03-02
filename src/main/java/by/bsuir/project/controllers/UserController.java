package by.bsuir.project.controllers;

import by.bsuir.project.model.User;
import by.bsuir.project.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users/")
    public User addUser(@RequestBody final User user) {
        return userService.save(user);
    }

    @GetMapping("/users/")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

}
