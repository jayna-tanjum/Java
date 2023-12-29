import java.util.*;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int Number=num;
        int reversenum=0;
        int remainder;
        while (num>0) {
          remainder = num % 10;
          reversenum = reversenum*10 + remainder;
           num /= 10; 
        }
        System.out.println("Reverse number is: "+reversenum);
    }
}
