import java.util.*;
public class ASCII {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    char ch= sc.next().charAt(0);
    System.out.println(ch);
    int Ascii= (int) ch;
         System.out.println("The ASCII value of " + ch + " is: " + Ascii);
    }
}
