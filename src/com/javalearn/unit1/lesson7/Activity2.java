package com.javalearn.unit1.lesson7;
import java.util.Scanner;
/*
Change the last problem so that it also prints the sum of the digits. Use the format shown below.

  Make sure your output is printed in the same order as the sample run.

  Sample run:

Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

 */
public class Activity2 {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a three digit number");
    int number = scan.nextInt();
    int number1 = number % 10;
    int number10 = number % 100;
    int number100 = number % 1000;
    int number2 = ((number100 - number10)/100);
    int number3 = ((number10 - number1)/10);
    int number4 = number1 + number2 + number3;
    System.out.println(number2);
    System.out.println(number3);
    System.out.println(number1);
    System.out.println("Total:" + number4);

  }
}
