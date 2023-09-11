package com.example.EvidenNewsAggregator.controllers;

import com.example.EvidenNewsAggregator.types.RegistrationRequest;
import com.example.EvidenNewsAggregator.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public AuthController(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }


    @GetMapping
    public List<com.jooq.sample.model.tables.pojos.Users> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegistrationRequest registrationRequest) {
        System.out.println("ceva");
        // Validate registration data
        if (userService.loadUserByUsername(registrationRequest.getUsername())) {
            return ResponseEntity.badRequest().body("Username already exists.");
        }

        // Hash the password
        String encodedPassword = passwordEncoder.encode(registrationRequest.getPassword());

        // Create a new user entity and save it to the database
        com.jooq.sample.model.tables.pojos.Users newUser = new com.jooq.sample.model.tables.pojos.Users();
        newUser.setUsername(registrationRequest.getUsername());
        newUser.setPassword(encodedPassword);
        // Set other user properties as needed

        userService.saveUser(newUser);

        // Optionally, send a confirmation email to the user

        return ResponseEntity.ok("Registration successful");
    }

}
