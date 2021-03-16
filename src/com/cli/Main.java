package com.cli;

import java.util.Arrays;
import java.util.Date;

public class Main {
//constants are declared by putting final at the beginning (before the type of variable) and their names in uppercase (convention)

    public static void main(String[] args) {
        casting();

    }

    private static void casting(){
        //Implicit casting: byte > short > int > long > float > double (all compatible)
        double x = 1.1;
        int y = (int)x + 2; //explicit casting by putting the type in brackets before the variable - between compatible types
        System.out.println(y);
    }

    private static void arithmetic(){
        int x = 1;
    //    x = x + 2 can be better written like so:
            x += 2;
        System.out.println(x);
    }

    private static void manipulateArray() {
        int[][] numbers = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers));
    }

    private static void replaceMessage() {
        String message = "We are the world" + "\nwe are the cosis\t ";
        System.out.println(message + message.replace("e", "E"));
    }

    private static void printCurrentDate() {
        Date now = new Date();
        now.getTime();
        System.out.println(now);
    }


}
