package org.example;
//Even or Odd Number
//
//Description:
//Write a Java program to check whether a given number is even or odd using arithmetic operators.

import java.util.Scanner;

public class question_2 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enther the number to check if odd or even ");
        int num=sc.nextInt();

        if(num==0)
        {System.out.println("the number " + num + " is neither even or odd ");}
        else {
            if (num % 2 == 0) {
                System.out.println("the number " + num + " is even ");
            } else {
                System.out.println("the number " + num + " is odd ");
            }
        }

    }
}
