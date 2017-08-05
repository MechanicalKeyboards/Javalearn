package com.javalearn.unit1.lesson9;
/*
Write the code to print a random integer from -20 to 20 inclusive using Math.random().
 */
public class Activity2 {
  public static void main(String args[]){
    int random = ((int)(Math.random() * 41) - 20);
    System.out.println(random);
  }
}
