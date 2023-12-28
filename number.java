import java.util.*;
public class number {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int num1= sc.nextInt();
    int num2= sc.nextInt();
    System.out.println("Enter Number 1: "+num1);
    System.out.println("enter Number 2: "+num2);
    if(num1!=num2)
    {
        System.out.println("Not equal");
    }
    else
    {
        System.out.println("Equal");
    }
    if(num1>num2)
    {
    
        System.out.println("number 1 is greater");
    }
    else
    {
        System.out.println("number 2 is greater");
    }
}
    
}
