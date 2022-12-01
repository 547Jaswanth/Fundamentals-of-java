import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        int n=10;
        System.out.println("Enter 10 numbers");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.printf("List of even numbers\n",n);
        for(int i=0;i<n;i++)
        {
           if(arr[i]%2==0)
           {
           System.out.printf("%d ",arr[i]);
           }
        }  
    }
}
