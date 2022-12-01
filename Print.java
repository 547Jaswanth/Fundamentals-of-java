import java.util.Scanner;
public class Print
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++)
        {
            System.out.println(""+a[i]);
        }
    
    }
}
