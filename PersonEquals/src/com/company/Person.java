package com.company;

/**
 * Created by Ivan on 26.03.2015.
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private final String email;
    //local code review (vtegza): should be final @ 12.04.15
    private Position position;

    public Person(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setPosition(Position position){
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (email != null ? !email.equals(person.email) : person.email != null) return false;
        return position == person.position;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override public String toString(){
        return String.format("FirstName : " + this.getFirstName() + "\n" +
                                "LastName : " + this.getLastName() + "\n" +
                                "e-mail : " + this.getEmail() + "\n" +
                                "Position : " + this.getPosition() + "\n");
    }
}
