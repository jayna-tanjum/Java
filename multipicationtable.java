import java.util.*;
public class multipicationtable{ 
    public static void main(String args[]){
        Scanner num = new Scanner (System.in);
        int Mynum=num. nextInt();
        System.out.println(Mynum);
        for(int i=0;i<=10;i++)
        {
            System.out.println(Mynum+"X"+i+ "="+ Mynum * i);
        }
    }
}
