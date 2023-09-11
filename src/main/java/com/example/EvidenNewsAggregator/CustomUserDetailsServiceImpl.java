package com.example.EvidenNewsAggregator;

import com.example.EvidenNewsAggregator.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.jooq.sample.model.tables.pojos.Users user = userRepository.findByUsername(username);
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
