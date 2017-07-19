package com.javalearn.lesson1;

/**
 * Created by Bob on 6/27/2017.
 */
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Hi"+name+", nice to see you.");
        sc.close();
    }
}