import java.util.*;
public class Evennumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n =sc.nextInt();
       
        int arr[] = new int[n];
         if(n == 0)
        {
            System.out.println("Invalid array size");
        }
        if(n>0)
        {
        System.out.println("Enter the array elements:");
        
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            if(arr[i]%2 == 0 && arr[i] !=12)
            {
                System.out.println("Single digit even number is: "+arr[i]);
            }
            else if(arr[i] == 12)
            {
                System.out.println("Single digit even number is not found in the array");
            }
  }}
}
}
