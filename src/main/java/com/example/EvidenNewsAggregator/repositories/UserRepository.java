package com.example.EvidenNewsAggregator.repositories;

import com.example.EvidenNewsAggregator.entities.Tables;
import com.example.EvidenNewsAggregator.entities.tables.pojos.Users;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private final DSLContext dslContext;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public Users findByUsername(String username) {
        return dslContext.selectFrom(Tables.USERS)
                .where(Tables.USERS.USERNAME.eq(username))
                .fetchOneInto(Users.class);
    }

    public void save(Users user) {
        // Encode the user's password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        dslContext.insertInto(Tables.USERS)
                .set(Tables.USERS.USERNAME, user.getUsername())
                .set(Tables.USERS.PASSWORD, user.getPassword())
                // Set other user properties as needed
                .execute();
    }

    public List<Users> findAllUsers() {
        return dslContext.selectFrom(Tables.USERS)
                .fetchInto(Users.class);
    }


    // Implement other database operations as needed
}
