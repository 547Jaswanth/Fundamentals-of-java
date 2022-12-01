import java.util.Scanner;
public class Narnia
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int n,degit,sum=0,i;
        n=sc.nextInt();
        if(n>0)
        {
            degit=n%10;
            sum=sum+degit;
            i=n/10;
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
