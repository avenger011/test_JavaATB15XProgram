package org.example;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

import java.util.Scanner;

public class question_6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = sc.nextInt();
        switch(num1){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid input");


        }

}}
