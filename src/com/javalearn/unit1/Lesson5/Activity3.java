package com.javalearn.unit1.Lesson5;
import java.util.Scanner;
public class Activity3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        float radius = scan.nextFloat();
        double area = 2 * 3.14159265 * radius;
        double circumference = 3.14159265 * radius * radius;
        System.out.println("The area is: " + area + "The circumference is: " + circumference);


    }
}
