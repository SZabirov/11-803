package com.company;

import com.company.models.User;
import com.company.services.UsersService;
import com.company.services.UsersServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        String username = sc.nextLine();
        System.out.println("Введите пароль");
        String password = sc.nextLine();
        User u = new User(username, password);
        UsersService service = new UsersServiceImpl();
        User createdUser = service.signUp(u);
        System.out.println(createdUser);
    }
}
