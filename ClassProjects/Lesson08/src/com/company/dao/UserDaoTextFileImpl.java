package com.company.dao;

import com.company.generators.IdGenerator;
import com.company.generators.UsersIdGeneratorImpl;
import com.company.models.User;

import java.io.*;
import java.util.Scanner;

public class UserDaoTextFileImpl implements UserDao {
    private String fileName;
    private IdGenerator generator;

    public UserDaoTextFileImpl() {
        this.generator = new UsersIdGeneratorImpl();
        this.fileName = "users_data.txt";
    }

    @Override
    public User save(User model) {
        try {
            File f = new File(fileName);
            OutputStream os = new FileOutputStream(f, true);
            PrintWriter pw = new PrintWriter(os);
            Long id = generator.getNext();
            pw.println(id + " " + model.getNickname() + " " + model.getPassword());
            pw.close();
            model.setId(id);
            return model;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File with name = " + fileName +
                    " not found");
        }
    }

    @Override
    public User find(Long id) {
        return null;
    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(Long id) {

    }
}
