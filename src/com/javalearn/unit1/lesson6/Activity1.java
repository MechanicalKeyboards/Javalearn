package com.javalearn.unit1.lesson6;
/*
Try to run the following code:

double x = (11+4)/2
  What answer do you get? The answer is imprecise!

  Write a Java program that precisely calculates the average between two integers that input from the keyboard, and prints the answer to the screen. The average must include the integer and decimal portions of the calculation.

Sample Run:

Please enter two integers:
4
11

The average is: 7.5

 */
import java.util.Scanner;

public class Activity1 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer");
    int int1 = scan.nextInt();
    System.out.println("Enter another");
    int int2 = scan.nextInt();
    double intA = ((double) int1 + (double) int2) / 2.0;
    System.out.println(intA);
  }
}
