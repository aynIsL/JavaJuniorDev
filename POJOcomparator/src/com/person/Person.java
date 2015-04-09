package com.person;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return !(lastName != null ? !lastName.equals(person.lastName) : person.lastName != null);

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString(){
        return String.format("Name: " + firstName + " " + lastName + " ; Age: " + age );
    }
//    {
//        return super.toString();
//    }


    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;

        public Builder(){}
        public Builder (Person original){
            this.firstName = original.firstName;
            this.lastName = original.lastName;
            this.age = original.age;
        }

            public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
