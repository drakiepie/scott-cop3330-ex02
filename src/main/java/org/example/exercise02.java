package org.example;
import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String str = input.nextLine();

        int length = str.length();
        System.out.println(str + " has " + length + " characters.");

    }
}
