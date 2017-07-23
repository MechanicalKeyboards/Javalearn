package com.javalearn.unit1.lesson3;

/**
 * Created by Bob on 7/20/2017.
 */
import java.util.Scanner;
public class Activity2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter an adjective describing you");
        String adj = sc.next();
        System.out.println("My name is" + name + ", I am" + adj );


    }
}
