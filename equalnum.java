import java.util.*;
public class equalnum {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int number1=sc.nextInt();
        if(25<=number1 && number1<=75)
        {
             System.out.println("First number: "+number1);
        }
        else
        {
            System.out.println("This number is not between 25 to 75");
        }
        int num1= number1/10;
        int num2= number1%10;
        int number2=sc.nextInt();
         if(25<=number2 && number2<=75)
        {
             System.out.println("Second number: "+number2);
        }
         else
        {
            System.out.println("This number is not between 25 to 75");
        }
        int num3= number2/10;
        int num4= number2%10;
        if(num1==num3||num1==num4||num2==num3||num2==num4)
        {
            System.out.println("Result: True");
        }
        else
        {
            System.out.println("Result: False");
        }
    }  
}
