package com.company.services;

import com.company.dao.UserDao;
import com.company.dao.UserDaoTextFileImpl;
import com.company.models.User;

public class UsersServiceImpl implements UsersService {
    private UserDao userDao;

    public UsersServiceImpl() {
        this.userDao = new UserDaoTextFileImpl();
    }

    @Override
    public User signUp(User user) {
        if (user.getPassword().length() < 8) {
            throw new IllegalArgumentException(
                    "Password should not be shorter than 8 symbols");
        }
        return userDao.save(user);
    }

    @Override
    public void signIn(User user) {

    }
}
