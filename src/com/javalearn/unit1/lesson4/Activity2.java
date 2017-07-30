package com.javalearn.unit1.lesson4;

import java.util.Scanner;
public class Activity2 {
        public static void main(String args[]) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter your name");
                String name = scan.nextLine();
                System.out.println("Hi " + name + "Enter your age");
                int age = scan.nextInt();
                int age1 = 100 - age;
                System.out.println(name + " you will be 100 in " + age1 + " years.");
        }

}

