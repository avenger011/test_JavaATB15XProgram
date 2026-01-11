package org.example;
import java.util.Scanner;
// Arithmetic Operations on Two Numbers
//
//Description:
//Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class question_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enther the 1 st number ");
        int num1=sc.nextInt();
        System.out.println("enther the 2nd number");
        int num2=sc.nextInt();
        System.out.println("the sum of numbers is "+(num1+num2));
        System.out.println("the difference of numbers is "+(num1-num2));
        System.out.println("the multiplication of numbers is "+num1*num2);
        System.out.println("the division of numbers is "+num1/num2);
        System.out.println("the remainder of numbers is "+num1%num2);
    }
}
