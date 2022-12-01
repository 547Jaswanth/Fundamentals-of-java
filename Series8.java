import java.util.Scanner;
public class Series8
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        double a=4;
        
        int n=sc.nextInt();
        System.out.printf("%.0f ",a);
        System.out.printf("%.0f ",a+1);
        for(int i=2;i<=n;i++)
        {
            double sum=Math.pow(i,2)+a;
            System.out.printf("%.0f ",sum+1);//Math.pow(a, b)
            a=sum;
                   
                   
        
          
        }
        
    }
}
