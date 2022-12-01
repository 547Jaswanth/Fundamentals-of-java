import java.util.*;
public class Storeprint
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=3,m=3;
        int arr[][] = new int[n][m];
         System.out.println("Enter Elements");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing Elements...");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
        
    }
}
