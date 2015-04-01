package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Ivan","Kyselov","ik@gmail.com");
        Person person2 = new Person("Ivan","Kyselov","ik@gmail.com");

        System.out.println("Compare with '==' : " + (person1 == person2));
        System.out.println("Compare with 'equals' : " + person1.equals(person2));

        //System.out.println(person1.toString());
    }

}



