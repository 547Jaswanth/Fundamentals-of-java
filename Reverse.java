import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,degit;
        {
        while(num>0)
        {
           degit=(num%10);
           
           num=num/10;
           sum=sum*10+degit;
        }
         System.out.println(sum);
    }}
}
