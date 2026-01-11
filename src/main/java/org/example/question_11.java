package org.example;

public class question_11 {
    public static void main(String[] args){
        int num=1234;
        int a=0;
        int b=0;
        do{
             a=num%10;   //4
            b=b*10+a;
            num=num/10;
        }
        while (num!=0);
        System.out.println(b);
    }
}
