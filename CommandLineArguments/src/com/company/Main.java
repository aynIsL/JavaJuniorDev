package com.company;

public class Main {

    public static void main(String[] args) {
        CommandLine instance = new CommandLine();
	    instance.commandLineArguments(args);
        instance.viewArgumentsByIndex(args);
    }



}
