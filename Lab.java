import java.util.Scanner;
public class Lab
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter x");
        x=sc.nextInt();
        System.out.println("Enter y");
        y=sc.nextInt();
        System.out.println("Enter z");
        z=sc.nextInt();
        if(x<y && x<z)
        {
            System.out.println("L1 has the minimal seating capacity");
            
        }
        else if(y<z && y<x)
        {
        System.out.println("L2 has the minimal seating capacity");
        }
        else if(z<x && z<y)
        {
            System.out.println("L3 has the minimal seating capacity");
        }
        
        
    }
}
