import java.util.Scanner;
public class Microwave
{
    public static void main(String args[])
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n=sc.nextInt();//number of items
        System.out.println("Enter the single item heating time");
        float f=sc.nextFloat();
        if(n==2)
        {
            System.out.printf("The recommended heating time is %.2f",f+(f/2));
        }
        else if(n==3)
        {
            System.out.println(f*f);
        }
        else if(n>3)
        {
            System.out.println("Number of items is more");
        }
        
    }
}
