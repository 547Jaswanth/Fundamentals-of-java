import java.util.Scanner;
public class Hotel
{
    public static void main(String args[])
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       if(n==4 || n==6 || n==11 || n==12)
       {
           float a=sc.nextFloat();
           int b=sc.nextInt();
           float t=(20*a)/100;
           float x=(b*t)+(a*b);
           
           System.out.printf("Hotel Tariff: Rs.%.2f",x);
           
       }
       else if(n<12)
       {
           float c=sc.nextFloat();
           int b=sc.nextInt();
           System.out.printf("Hotel Tariff: Rs.%.2f",(c*b));
           
       }
       else
       System.out.println("Invalid Input");
    }
}
