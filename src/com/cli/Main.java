package com.cli;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        manipulateArray();

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
