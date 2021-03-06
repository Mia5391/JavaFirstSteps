package com.cli;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import static java.text.NumberFormat.*;

public class Main {
//constants are declared by putting final at the beginning (before the type of variable) and their names in uppercase (convention)

    public static void main(String[] args) {

        readingInput();
    }

    private static void readingInput(){
        Scanner scanner = new Scanner(System.in); //to read from the terminal
        System.out.print("What's your name?");
        String userName = scanner.nextLine().trim(); //next() reads one token at a time, nextLine() reads however many there are
        System.out.println("Your name is: " + userName);
    }

    private static void numberFormatting(){
       String result = NumberFormat.getPercentInstance().format(0.1); //method chaining
       System.out.println(result);
    }

    private static void casting(){
        //Implicit casting: byte > short > int > long > float > double (all compatible)
        String x = "1";
        //use Integer/Double/Float/Short wrapper class to cast strings to numbers with respective parse methods
        int y = Integer.parseInt(x) + 2;
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
