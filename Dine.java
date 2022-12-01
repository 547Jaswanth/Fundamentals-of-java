import java.util.Scanner;
public class Dine
{
    public static void main(String args[])
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
       
        // String s="front";
        // String d="rear";
         String str=sc.nextLine();
        int n=sc.nextInt();
       if(str.equals("front") && n==1)
       {
           System.out.println("Left Handed");
       }
           else if(str.equals("front") && n==2)
           {
               System.out.println("Right Handed");
           }
           
        else if(str.equals("rear") && n==1)
       {
           System.out.println("Right Handed");
       }
       else if(str.equals("rear") && n==2)
       {
            System.out.println("Left Handed");
           
       }
           }
}     
