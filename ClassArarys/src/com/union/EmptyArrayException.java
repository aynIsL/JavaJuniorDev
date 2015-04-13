package com.union;

public class EmptyArrayException extends Exception{
    private final String errorCode;
    public EmptyArrayException(){
        errorCode = "Array shouldn`t be empty";
    }
    public String getErrorCode(){
        return errorCode;
    }
}
