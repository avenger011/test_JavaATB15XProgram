package exam18thJan;

import java.util.Scanner;

//to coy=unt if the string length is more that 10
public class prob2 {
    public static void main(String[] args){
        System.out.println("enter the string to copuntb the char");
      Scanner sc=new Scanner(System.in);
      String str1=sc.next();
      int count=str1.length();
      if(count>10)
      {
          System.out.println("the string contains more than 10 chars");
      }
      else {System.out.println("the string contains less than 10 chars");}
    }
}
