 import java.util.*;
public class factorial {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int num1= sc.nextInt();
    System.out.println("Enter the number: "+num1);
    int multi=1;
    for(int i=1; i<=num1;i++)
    {
         multi*=i;
    }
    System.out.println(multi);
}
}