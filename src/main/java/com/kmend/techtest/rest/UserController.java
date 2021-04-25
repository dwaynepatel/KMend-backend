package com.kmend.techtest.rest;

import com.kmend.techtest.domain.User;
import com.kmend.techtest.repository.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin(origins = "*") // security not needed
@RestController
@RequestMapping("/api")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * method to gat all the users.
     * @return a list of users.
     */
    @GetMapping("/users")
    public Collection<User> users() {
        return userRepository.findAll();
    }
}
