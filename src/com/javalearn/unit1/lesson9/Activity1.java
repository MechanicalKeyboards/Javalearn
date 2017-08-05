package com.javalearn.unit1.lesson9;
/*
Write the code to print a random integer from 1 to 10 inclusive using Math.random().

 */
public class Activity1 {
  public static void main(String args[]){
    int random = ((int)(Math.random()*(11) + 1));
    System.out.println(random);
  }
}
