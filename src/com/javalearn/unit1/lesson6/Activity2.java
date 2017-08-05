package com.javalearn.unit1.lesson6;

import java.util.Scanner;
/*Input a double value and print only the integer part.

  Sample run:

Please input a decimal number:
57.8934
Answer: 57
*/

public class Activity2 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a decimal");
    double number = scan.nextDouble();
    int number1 = (int) number;
    System.out.println(number1);
  }
}
