import java.util.*;
public class daysinamon {
 public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String month= sc.nextLine();
    System.out.println("Enter name of month: "+month);
    int year= sc.nextInt();
    System.out.println("Enter the year: "+year);
    if((month=="february")&&(year%4==0|| ((year%100!=0)&&(year%400==0))))
        {
            System.out.println("Number of days is 29");
        }
        else if(month=="february")
        {
            System.out.println("Number of days is 28");
        }
        else if(month=="january"|| month=="march"|| month=="may"|| month=="july" ||
         month=="august" || month=="october" || month=="december")
         {
            System.out.println("Number of days is 31");
         }
          else
          {
            System.out.println("Number of days is 30");
    }

    }
}

