import java.util.Scanner;

public class Capital{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
       String sentence= sc.nextLine();
       char[] line= sentence.toCharArray();
       boolean space= true;
       for(int i=0; i<line.length;i++)
       {
            if(Character.isLetter(line[i]))
            {
                if(space)
                {
                    line[i]=Character.toUpperCase(line[i]);
                    space=false;
                }
            }
            else
            {
                space=true;
            }
       }
      sentence=String.valueOf(line);
       System.out.println(sentence);
    }
}
