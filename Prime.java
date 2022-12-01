import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
                
            }
        }
        if(count==0)
        System.out.println("Prime Number");
        else
        System.out.println("Not a Prime");
        }
}
