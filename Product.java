import java.util.*;
public class Product {
    public static void main(String args[]){
        System.out.println("Welcome to dream bazar");
        for(int i=0;i<40;i++)
        {
            System.out.print("-");
        }
           System.out.println();
        System.out.print("Please Enter your name:");
        Scanner sc=new Scanner(System.in);
        String Name=sc.nextLine();
        System.out.println("Hello "+Name+".Hope you are doing well. Welcome to our shop.");
        System.out.print("How many products did you buy?");
        int Productnum=sc.nextInt();
        System.out.println("Thanks for buying "+Productnum+" products.Please input the product name and price of each product below.");
        String[]Productname=new String[Productnum];
        double[]Productprice=new double[Productnum];
        double Totalprice=0;
        for(int i=0; i<Productnum;i++)
        {
            System.out.print("Name of product "+(i+1)+":");
            sc.nextLine();
             Productname[i]=sc.nextLine();
            System.out.print("Price of product "+(i+1)+":");
            Productprice[i]=sc.nextInt();
             Totalprice+=Productprice[i];
        }
        for(int i=0;i<40;i++)
        {
            System.out.print("-");
        }
        System.out.println();
        System.out.println( "                    Invoice");
        System.out.println("Customer Name:"+Name);
        for(int i=0;i<Productnum;i++ )
        {
            System.out.println((i+1)+".  "+Productname[i]+"        "+Productprice[i]+"TK");
        }
        for(int i=0;i<40;i++)
        {
            System.out.print("-");
        }
        System.out.println();
          System.out.print("Total Price                      "+Totalprice+"TK");
          double vat= Totalprice*0.075;
          System.out.println("VAT(7.5%)                        "+vat+"TK");
          double Totalamount= Totalprice-vat;
          System.out.println("Total Payable Amount:            "+Totalamount+"TK");
          System.out.println("Thank you for shopping with us");

    }
}
