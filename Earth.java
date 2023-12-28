import java.util.Scanner;
public class Earth {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
 double latitude1=sc.nextDouble();
 System.out.println("The latitude of coordinate 1 : "+latitude1);
 double longitude1=sc.nextDouble();
 System.out.println("The longitude of coordinate 1: "+longitude1);
 double latitude2=sc.nextDouble();
 System.out.println("The latitude of coordinate 2 : "+latitude2);
 double longitude2=sc.nextDouble();
 System.out.println("The longitude of coordinate 2: "+longitude2);
 double radius=6371.01;
 double d = radius * Math.acos(Math.sin(Math.toRadians(latitude1)) * Math.sin(Math.toRadians(latitude2)) + Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2))*Math.cos(Math.toRadians(longitude1 - longitude2)));
System.out.println("The distance between those points is: "+d+"Km");
    }
}