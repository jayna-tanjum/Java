import java.util.*;
public class primenum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num%1==0 && num%num==0)
        { 
            System.out.println("True");
        }
        else
        {
          System.out.println("False");
        }
    }
}