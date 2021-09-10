/*
 *  UCF COP3330 Fall 2021 Exercise 4 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class MadLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();
        String madlib;
        madlib = String.format("Do you %s your %s %s %s? That's hilarious", verb, adjective, noun, adverb);
        System.out.println(madlib);
    }
}
