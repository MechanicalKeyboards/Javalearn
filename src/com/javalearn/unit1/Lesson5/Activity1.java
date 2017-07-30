package com.javalearn.unit1.Lesson5;
import java.util.Scanner;
public class Activity1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a double");
        double number1 = s.nextDouble();
        System.out.println("Enter another double");
        double number2 = s.nextDouble();
        float difference = (float) (number2 - number1);
        System.out.println(difference);



    }


}
