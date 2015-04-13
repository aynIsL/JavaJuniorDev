package com.person;

public class EmptyNameException extends Exception{
    private final String errorCode;
    public EmptyNameException(){
        this.errorCode = "The name shouldn't be empty";
    }
    public String getErrorCode(){
        return errorCode;
    }
}
