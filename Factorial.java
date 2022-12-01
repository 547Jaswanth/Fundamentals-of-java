import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int i=1,n,fact=1;
        n=sc.nextInt();//   n=6
        while(fact<n)//    1<6-->true
        {                   
            i=i+1;   //1+1=2
            fact=fact*i;//fact=1*2=2
        }
        if(fact==n)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        }
}
