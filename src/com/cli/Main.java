package com.cli;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        replaceMessage();
        printCurrentDate();
    }

    private static void replaceMessage() {
        String message = "We are the world" + "\nwe are the cosis\n ";
        System.out.println(message + message.replace("e", "E"));
    }

    private static void printCurrentDate() {
        Date now = new Date();
        now.getTime();
        System.out.println(now);
    }
}
