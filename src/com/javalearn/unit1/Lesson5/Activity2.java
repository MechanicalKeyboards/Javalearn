package com.javalearn.unit1.Lesson5;
import java.util.Scanner;
public class Activity2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int int1 = scan.nextInt();
        System.out.println("Enter another integer");
        int int2 = scan.nextInt();
        System.out.println("Enter another");
        int int3 = scan.nextInt();
        System.out.println("Enter one more");
        int int4 = scan.nextInt();
        int inttotal = int1 + int2 + int3 + int4;
        System.out.println(inttotal);

    }


}
