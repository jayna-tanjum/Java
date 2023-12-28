import java.util.Scanner;
public class Integeradd {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
 int num= sc.nextInt();
 int num1=num/10;
 int num2=num%10;
 int Result=0;
 Result=num1+num2;
 System.out.println("Result: "+Result);
    
}
}
