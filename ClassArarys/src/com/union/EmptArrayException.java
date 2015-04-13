package com.union;

public class EmptArrayException extends Exception{
    private final String errorCode;
    public EmptArrayException(){
        errorCode = "Array shouldn`t be empty";
    }
    public String getErrorCode(){
        return errorCode;
    }
}
