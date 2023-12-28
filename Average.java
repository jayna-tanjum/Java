import java.util.*;
public class Average {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int size= sc.nextInt();
    int[] num=new int[size];
    int sum=0;
    for(int i=0;i<size;i++)
    {
        num[i]=sc.nextInt();
        sum+=num[i];
    }
    double average=sum/size;
    System.out.println("Average: "+average);
    System.out.println("The numbers in the said array that are greater than the average are: ");
    for(int i=0;i<size;i++)
    {
     if(average<num[i])
     {
        System.out.println(num[i]);
     }
    }
}
}
