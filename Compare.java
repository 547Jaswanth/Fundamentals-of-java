import java.util.Scanner;
public class Compare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        System.out.printf("%d is greater than %d",a,b);
        else if(a==b)
        System.out.printf("%d is equal to  %d",a,b);
        else
        System.out.printf("%d is less than %d ",a,b);
        //write your code
    }
}
