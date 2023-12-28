import java.util.Scanner;

public class Secondstohour {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int seconds= sc.nextInt();
        int hours=0;
        hours=seconds/3600;
        int min=seconds-(hours*3600);
        int minutes=0;
        minutes=min/60;
        int second=0;
       second=min/60;
        System.out.println(hours+":"+minutes+":"+second);
    }
    
}
