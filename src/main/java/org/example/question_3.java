package org.example;

import java.util.Scanner;
//3) Explicit Type Casting
//
//Description:
//Write a Java program to convert a double value into an int using explicit type casting and print both values.
public class question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number to type cast");
        double num=sc.nextDouble();
        int num2=(int)num;
        System.out.println(num2);
    }
}
