import java.util.Scanner;
public class Placement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int a=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int b=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Highest placement\n CSE");
        
        }
        else if(b>a && b>c)
        {
            System.out.println("Highest placement\n ECE");
        }
        else if(c>a&&c>b)
        {
            System.out.println("Highest placement \n MECH");
        }
    }
}
