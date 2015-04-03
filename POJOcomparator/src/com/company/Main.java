package com.company;

import com.person.Person;
import com.person.PersonAgeComparator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Kyselov",30);
        Person person2 = new Person("Tatiana", "Kyselova",30);
        Person person3 = new Person("Olga", "Lysuk",57);
        Person person4 = new Person("Yuriu", "Lisuk",30);
        Person person5 = new Person("Lubov", "Kyselova",61);
        Person person6 = new Person("Andrey", "Kyselov",60);

        Person[] family = {person1,person2,person3,person4,person5,person6};
        System.out.println("Before Sorting ");
        System.out.println(Arrays.toString(family));
        System.out.println("-----------------------------------------");
        System.out.println("After Sorting ");
        Arrays.sort(family, new PersonAgeComparator());
        System.out.println(Arrays.toString(family));


    }
}
