package exam18thJan;

public class prob5 {public static void main(String[] args){


    String str="Pramod sir";
    String rev="";
    for(int i=str.length()-1;i>=0;i--)
    {
        rev=rev+str.charAt(i);
    }
    System.out.println(rev);
}
}
