package com.company;

import com.union.Person;
import com.union.PersonAgeComparator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[] first = {1, 5, 4, 23, 65, 32, 78,0,2};
//        int[] second = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
//
//        int[] third = {1,2,4,6,8};
//        int[] fourth = {5,7,8,2};
//
//        int[] temp = ArrayUnion.innerUnion(third, fourth);
//        System.out.println(Arrays.toString(temp));

        Person person1 = new Person("Ivan","Kyselov","kiselev@online.ua",30);
        Person person2 = new Person("Tatiana","Kyselova","kiseleva@online.ua",30);
        Person person3 = new Person("Yuriu","Lisuk","lisuk@online.ua",53);
        Person person4 = new Person("Olga","Lisuk","lisukO@online.ua",57);

        Person[] persons = {person1,person2,person3,person4};
        for (Person temp : persons){
            System.out.println(temp.toString());
        }

//        Arrays.sort(persons, new PersonNameComparator());
//        for (Person temp : persons){
//            System.out.println(temp.toString());
//        }

        Arrays.sort(persons, new PersonAgeComparator());
        for (Person temp : persons){
            System.out.println(temp.toString());
        }


    }

}
