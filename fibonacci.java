import java.util.*;
public class fibonacci{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int first=0;
        int second=1;
        System.out.println("Fibonacci series: ");
    for(int i=1;i<=n;i++){
         System.out.print( first +",");
      int next= first+ second;
      first = second;
      second= next;
    }
    }
}
