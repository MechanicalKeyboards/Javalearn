package com.javalearn.unit1.lesson6;
import java.util.Scanner;
public class Activity3 {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a decimal number");
    double number = scan.nextDouble();
    int number1 = (int)number;
    double number2 = number - number1;
    int number3 = (int)(number2 * 100);
    System.out.println(number3);
  }
}
