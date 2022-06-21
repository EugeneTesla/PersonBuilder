package com.company;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(12)
                .setAddress("Сидней")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            new PersonBuilder().setAge(23).setSurname("test1").setName("Tzar").build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(2).setSurname("test").setName("Tvar").build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}