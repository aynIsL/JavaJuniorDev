package com.person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    public int compare(Person person1, Person person2){
        return person1.getFirstName().compareTo(person2.getFirstName()) + person1.getLastName().compareTo(person2.getLastName());
    }
}
