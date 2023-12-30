import java.util.*;   
public class numeric{   
public static void main(String[] args){   
    Scanner sc= new Scanner(System.in);
    int num= sc.nextInt();
int [] number = new int[num];
for (int i = 0; i < num; i++)   
{   
   number[i]=sc.nextInt();  
}    
Arrays.sort(number);   
System.out.println("Elements of array sorted in ascending order: ");    
for (int i = 0; i < number.length; i++)   
{   
   System.out.println(number[i]);   
}   
}  
}  