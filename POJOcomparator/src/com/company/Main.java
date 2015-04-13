package com.company;

import com.person.Person;

public class Main {

    public static void main(String[] args) {
        Person first = null;
        try {
            first = new Person.Builder().firstName("Ivan").lastName("Kyselov").age(30).build();

        } catch (Exception e) {
            e.printStackTrace();
        }
//




    }
}
