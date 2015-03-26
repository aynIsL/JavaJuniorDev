package com.company;

/**
 * Created by Ivan on 25.03.2015.
 */
public class CommandLine {

    public void commandLineArguments(String[] args) {
        if(!isArrayEmpty(args)){
            for(String eachElement : args){
                System.out.print(eachElement + " ");
            }
        }
        System.out.println("\nAmount of command line arguments is " + args.length);
    }

    public void viewArgumentsByIndex(String[] args){
        for(int i = 0 ; i < args.length; i++){
            System.out.println("Argument [" + i + "] = " + args[i]);
        }
    }

    private boolean isArrayEmpty(Object[] array) {
        return array.length == 0;
    }
}
