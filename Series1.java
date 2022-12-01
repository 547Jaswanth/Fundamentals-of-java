import java.util.Scanner;
public class Series1
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
        sum=i+1;
        sum=sum*sum;
        System.out.println(sum);
        }
        
    }
}
