import java.util.*;
public class reversearray {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int size= sc.nextInt();
        int[] num=new int[size];
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Reverse Array is: ");
        for(int i=(size-1); i>=0; i--)
        {
           System.out.print(num[i]+ " ");
        }
    }
}