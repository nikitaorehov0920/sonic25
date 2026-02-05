package com.impact.lessons.database;

import com.impact.lessons.models.User;

public class userService {

    private final UserStore store = new UserStore();
}
    public User CreateUser(User user) {
        User newUser = new User(newUser.getUsername(),
                user.getEmail(), newUser.getPassword(), newUser.getRole());
        return store.save(newUser);
    }
}

