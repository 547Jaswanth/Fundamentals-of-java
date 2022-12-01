import java.util.Scanner;
public class Series6
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int a=0,i;
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==1)
            {
              a=i*i-1;
            }
            else if(i%2==0)
            {
                a=i*i-2;
            }
            System.out.println(a);
        }
        // System.out.println(a);
    }
}
