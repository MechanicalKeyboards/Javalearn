package com.javalearn.unit1.lesson9;
/*
Write the code to print a random integer from 20 to 40 inclusive using Math.random()
 */
public class Activity3 {
  public static void main(String args[]){
    int random = ((int)(Math.random() * 21) + 20);
    System.out.println(random);
  }
}
