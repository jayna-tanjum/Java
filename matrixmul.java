import java.util.Scanner;

public class matrixmul {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num1= sc.nextInt();
int num2= sc.nextInt();
int[][] matrix1=new int[num1][num2];
for(int i=0;i<num1;i++)
    {
       for(int j=0;j<num2;j++)
    {
        System.out.print("Matrix1["+i+"]["+j+"]: ");
         matrix1[i][j]= sc.nextInt();
}
}
System.out.println();
int[][] matrix2=new int[num1][num2];
for(int i=0;i<num1;i++)
    {
       for(int j=0;j<num2;j++)
    {
         
         System.out.print("Matrix2["+i+"]["+j+"]: ");
        matrix2[i][j]= sc.nextInt();
}
}
System.out.println();
int[][] sum=new int[num1][num2];
for(int i=0;i<num1;i++)
    {
       for(int j=0;j<num2;j++)
    {
        sum[i][j]=0;
    }
    }
for(int i=0;i<num1;i++)
    {
       for(int j=0;j<num2;j++)
    {
       for(int k=0;k<num1;k++)
        {
            sum[i][j]+=matrix1[i][k]*matrix2[k][j];
        }
    }
    }
    for(int i=0;i<num1;i++)
    {
       for(int j=0;j<num2;j++)
    {
        System.out.println("Multipication: ");
          System.out.print(sum[i][j]+" ");
    }
    System.out.println();
}
}
}
