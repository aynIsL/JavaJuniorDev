package com.union;

public class ArrayEmptyException extends Exception{
    private final String errorCode;
    public ArrayEmptyException(){
        errorCode = "Array shouldn`t be empty";
    }
    public String getErrorCode(){
        return errorCode;
    }
}
