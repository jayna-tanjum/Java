import java.util.*;
public class searchnum {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int size= sc.nextInt();
    int[] num=new int[size];
    for(int i=0;i<size;i++)
    {
        num[i]=sc.nextInt();
    }
        int num1=sc.nextInt();
        for(int i=0;i<size;i++)
    {
        if(num1==num[i])
        {
            System.out.println("Which number to search: "+num1);
            System.out.println("Number found!!!!");
            System.out.println(i);
        }
    
    }
}
}
