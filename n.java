import java.util.*;
public class n {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    System.out.println("Enter Number: "+n);
    if(n%2!=0)
    {
        System.out.println("Weird");
    }
    else if(n%2==0&& 2<=n && 5>=n)
    {
        System.out.println("Not weird");
    }
     else if(n%2==0&& 6<=n && 20>=n)
    {
        System.out.println("weird");
    }
    else
    {
        System.out.println("Not weird");
    }
}
}
