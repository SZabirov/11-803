package com.company.builder;

public class Main {
    public static void main(String[] args) {
//        User.Builder b = new User.Builder();
//        b.id(67L).firstname("Salavat").secondname("Zabirov");

        User u = User.builder()
                .id(67L)
                .firstname("Salavat")
                .secondname("Zabirov")
                .build();
    }
}










