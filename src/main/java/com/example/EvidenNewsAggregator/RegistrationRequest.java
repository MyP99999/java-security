package com.example.EvidenNewsAggregator;

// RegistrationRequest.java

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class RegistrationRequest {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // Getters and setters
}
