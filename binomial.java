import java.util.*;
public class binomial {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    System.out.println("Enter the n: "+n);
    int r= sc.nextInt();
    System.out.println("Enter the r: "+r);
    int multi=1;
    for(int i=1; i<=n;i++)
    {
         multi*=i;
    }
     int multipication=1;
    for(int i=1; i<=r;i++)
    {
         multipication*=i;
    }
    int p= n-r;
    int multipication1=1;
    for(int i=1; i<=p;i++)
    {
         multipication1*=i;
    }
    double down=multipication* multipication1;
    double result= multi/down;
    System.out.println("Result: "+result);
}
}
