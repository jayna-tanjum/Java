import java.util.*;
public class Add {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
 int num1= sc.nextInt();
 int num2=sc.nextInt();
 int Result=0;
 Result=num1+num2;
 System.out.println("Result: "+Result);
 int num3= sc.nextInt();
 if(Result==num3)
 {
    System.out.println("True");
 }
 else
 {
    System.out.println("False");
 }
    }
}
