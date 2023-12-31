import java.util.*;   
public class countletter{
   public static void main(String[] args){ 
       Scanner sc= new Scanner(System.in);
       String str = sc.nextLine();  
        int count = 0;    
        System.out.println(str);    
        for(int i = 0; i < str.length(); i++) 
        {    
            if(str.charAt(i) != ' ') 
            {
                count++;    
            }
        }                   
        System.out.println("Total number of letter in the string: " + count);    
    }      
} 