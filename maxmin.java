import java.util.*;
public class maxmin {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int size= sc.nextInt();
        int[] num=new int[size];
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
            int max=num[0];
          int min=num[0];
           for(int i=0;i<size;i++)
        {
            if(max<num[i])
            {
                max=num[i];
            }
          if(min>num[i])
            {
                min=num[i];
            }
        }
             System.out.println("maximum: "+max);
            System.out.println("Minimum: "+min);
    }
}

