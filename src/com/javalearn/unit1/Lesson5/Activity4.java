package com.javalearn.unit1.lesson5;

import java.util.Scanner;
/*
Ask the user to enter the price of an item and tell them how much money they would get back from $20. It's okay to return a negative number. Also, Don't forget to include the dollar sign.

  Sample Run:

Enter a price:
3.50
Change from $20: $16.5

 */


public class Activity4 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a dollar amount");
    double price = scan.nextDouble();
    double leftOver = 20 - price;
    System.out.println("Money left from 20$ : $" + leftOver);

  }
}
