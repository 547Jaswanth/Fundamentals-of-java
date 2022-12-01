import java.util.Scanner;
public class Range
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int temp=0,j;
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<b;i++)
        // if(i<a && a<=b )
        {
            for(j=2;j<i;++j)
            {
                if(i%j==0)
                {
                    break;
                }
                
            }
            if(i==j)
        {
            System.out.println(i);
        }
        }

    }
}
