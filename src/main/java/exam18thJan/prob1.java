package exam18thJan;


   // to count char of string
//                     hellow how are you =15

public class prob1 {
    public static void main(String[] args){
        String st="hellow how are you";
        String[] st2=st.split(" ");
        int count=0;
       for(int i=0;i<st2.length;i++)
       {
            count=count+st2[i].length();
       }
        System.out.println("the count of strings in given string without space is "+count);
    }
}
