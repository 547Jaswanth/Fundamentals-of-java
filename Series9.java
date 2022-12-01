import java.util.Scanner;
public class Series9
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n,i;
        double j=2;
        double sum=0;
        n=sc.nextInt();
        System.out.printf("%1.0f ",j);
        for(i=1;i<=n;i++)//247905749270529
        {
            sum=j*j-1;
            System.out.printf("%1.0f ",sum);
            j=sum;
            
        }
    }
}
