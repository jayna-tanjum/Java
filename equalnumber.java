import java.util.*;
public class equalnumber {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int num1= sc.nextInt();
    int num2= sc.nextInt();
    int num3= sc.nextInt();
    int num4= sc.nextInt();
    System.out.println("Enter Number 1: "+num1);
    System.out.println("Enter Number 2: "+num2);
    System.out.println("Enter Number 3: "+num3);
    System.out.println("Enter Number 4: "+num4);
    if(num1==num2&&num1==num3&&num1==num4&&num2==num3&&num2==num4&&num3==num4)
    {
        System.out.println("Numbers are equal");
    }
    else
    {
        System.out.println("Numbers are not equal");
    }
}
}