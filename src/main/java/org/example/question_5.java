package org.example;

import java.util.Scanner;

public class question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check ");
        int num1 = sc.nextInt();


        //using the ternary opratr
        String res=(num1>0)?"positive":"negative";

        if(num1==0)
        {res="neither positve or negative its o";}


         System.out.println(res);




    }
}
