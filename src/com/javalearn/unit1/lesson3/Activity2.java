package com.javalearn.unit1.lesson3;

/**
 * Created by Bob on 7/20/2017.
 */
import java.util.Scanner;
public class Activity2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name1 = sc.next();
        System.out.println("Enter another one");
        String name2 = sc.next();
        System.out.println("Enter one more");
        String name3 = sc.next();
        System.out.println(name3 + " " + name2 + " " + name1);


    }
}
