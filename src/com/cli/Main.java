package com.cli;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        replaceMessage();
        printCurrentDate();
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

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
