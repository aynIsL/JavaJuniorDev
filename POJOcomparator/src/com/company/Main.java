package com.company;

import com.person.Person;
import com.person.PersonAgeComparator;
import com.person.PersonNameComparator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person first = new Person.Builder().firstName("Ivan").lastName("Kiselev").age(30).build();
        Person second = new Person.Builder().firstName("Tatiana").lastName("Kiseleva").age(29).build();
        Person three = new Person.Builder().firstName("Misha").lastName("Kiselev").age(2).build();

        Person[] fam = new Person[]{first,second,three};
        Arrays.sort(fam, new PersonAgeComparator());

        System.out.println(Arrays.toString(fam));
        Arrays.sort(fam, new PersonNameComparator());
        System.out.println(Arrays.toString(fam));

//        Person[] family = {person1,person2,person3,person4,person5,person6};
//        System.out.println("Before Sorting ");
//        System.out.println(Arrays.toString(family));
//        System.out.println("-----------------------------------------");
//        System.out.println("After Sorting ");
//        Arrays.sort(family, new PersonAgeComparator());
//        System.out.println(Arrays.toString(family));


    }
}
