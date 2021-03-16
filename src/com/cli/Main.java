package com.cli;

import java.util.Arrays;
import java.util.Date;

public class Main {
//constants are declared by putting final at the beginning (before the type of variable) and their names in uppercase (convention)

    public static void main(String[] args) {
        arithmetic();

    }
    private static void arithmetic(){
        double result = (double)10/(double)3;
        System.out.println(result);
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
