package com.union;

public class NullArrayException extends Exception{
    private final String errorCode;
    public NullArrayException(){
        this.errorCode = "An array shouldn`t be null.";
    }

    public String getErrorCode(){
        return errorCode;
    }
}
