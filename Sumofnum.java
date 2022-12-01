import java.util.Scanner;
public class Sumofnum
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int a,b,sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        sum=sum+i;
        System.out.println(sum);
    }
}
