import java.util.Scanner;

public class reverse {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
       String sentence= sc.nextLine();
       String reverseString=" ";
       char ch;
       for(int i=0;i<sentence.length();i++)
       {
        ch= sentence.charAt(i);
        reverseString=ch+reverseString;
       }
        System.out.println(reverseString);
    }
}
