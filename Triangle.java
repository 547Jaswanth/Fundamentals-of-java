import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value for side1");
    int a=sc.nextInt();
    System.out.println("Enter the value for side2");
    int b=sc.nextInt();
    System.out.println("Enter the value for side3");
    int c=sc.nextInt();
    if(a==b && b==c && c==a)
    {
        System.out.println("Sides form a Triangle");
    }
    else if(a!=b&&b!=c&&c!=a)
    {
        System.out.println("Sides does not form a Triangle");  
    }
    else if(a==0||b==0||c==0)
    {
        System.out.println("Invalid Input");
    }
    }
}
