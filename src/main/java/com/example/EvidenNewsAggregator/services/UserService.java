package com.example.EvidenNewsAggregator.services;

import com.example.EvidenNewsAggregator.entities.tables.pojos.Users;
import com.example.EvidenNewsAggregator.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Users> getUsers() {
        return userRepository.findAllUsers();
    }

    public void saveUser(Users user) {
        // Encode the user's password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public boolean loadUserByUsername(String username) {
        return userRepository.findByUsername(username) != null;
    }

    public UserDetails loadUserDetails(String username) throws UsernameNotFoundException {
        Users user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        // Build and return a UserDetails object based on the retrieved user data
        return User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                // Set roles/authorities as needed
                .authorities(Collections.emptyList())
                .build();
    }

}
