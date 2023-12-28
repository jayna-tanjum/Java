import java.util.*;
public class BMI {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    double weight= sc.nextDouble();
    double height= sc.nextDouble();
    System.out.println("Enter weight in pounds: "+weight);
    System.out.println("Enter height in inches: "+height);
    double bmi= weight/(height*height);
    double Result= bmi*703;
    System.out.println("Body Mass Index is: "+Result);
}
}
    