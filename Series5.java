import java.util.Scanner;
public class Series5
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n,i,sum=11,b;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            b=sum*sum;
               System.out.println(b);
              sum=sum+4;
            
         
        }
    }
}
