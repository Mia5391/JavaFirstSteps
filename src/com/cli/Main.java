package com.cli;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        replaceMessage();
        printCurrentDate();
        manipulateArray();

    }

    private static void manipulateArray() {
        int[] numbers = {2,3,5,1,4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
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
