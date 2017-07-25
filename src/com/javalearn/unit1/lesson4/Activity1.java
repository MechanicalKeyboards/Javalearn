package com.javalearn.unit1.lesson4;

/**
 * Created by Bob on 7/19/2017.
 */
import java.util.Scanner;
public class Activity1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a non integer number");
        double number1 = s.nextDouble();
        System.out.println("Enter another non integer");
        double number2 = s.nextDouble();
        System.out.println(number2 + " " + number1);


    }
}
