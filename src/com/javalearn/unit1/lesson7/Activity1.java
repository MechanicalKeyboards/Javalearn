package com.javalearn.unit1.lesson7;

import java.util.Scanner;
/*
Input a positive three digit integer. Print out the digits one per line.

  Sample run:

Please enter a three digit number:
678

Here are the digits:
6
7
8

 */
public class Activity1 {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a three digit number");
    int number = scan.nextInt();
    int number1 = number % 10;
    int number10 = number % 100;
    int number100 = number % 1000;
    System.out.println((number100 - number10)/100);
    System.out.println((number10 - number1)/10);
    System.out.println(number1);


  }
}
