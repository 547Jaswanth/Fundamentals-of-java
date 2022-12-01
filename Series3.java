import java.util.Scanner;
public class Series3
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n,i,sum=1;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum*3;
            System.out.println(sum);
        }
    }
}
