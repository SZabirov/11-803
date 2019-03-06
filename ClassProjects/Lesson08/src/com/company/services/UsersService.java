package com.company.services;

import com.company.models.User;

public interface UsersService {
    User signUp(User user);
    void signIn(User user);
}
