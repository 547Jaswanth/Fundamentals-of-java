import java.util.Scanner;
public class Series7
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        float b=2;
        float a=1;
        int n=sc.nextInt();
        System.out.printf("%.0f ",a);
        System.out.printf("%.1f ",b);
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
             float j=b*3;
             System.out.printf("%.1f ",j);
             b=j;
            }
            else
            {
                float k=a*3;
                System.out.printf("%.1f ",k);
                a=k;
                
            }
        }
    }
}
