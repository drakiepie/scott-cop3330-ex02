package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class exercise02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String str = input.nextLine();

        int length = str.length();
        String output = str + " has " + length + " characters.";
        System.out.println(output);

    }
}
