import java.util.Scanner;
public class Sum1
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
    
            sum=sum+i;
            System.out.println(sum);
        
        
    }
}
