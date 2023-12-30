import java.util.*;
public class triangle {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
     int b= sc.nextInt();
      int c= sc.nextInt();
      if(a==b && b==c)
{
    System.out.println("equilateral triangle");
}
else if(a>(b+c))
{
    System.out.println( "right angle triangle");
}
else
{
    System.out.println("Other triangle");
}
}
}
