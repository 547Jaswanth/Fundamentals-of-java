import java.util.Scanner;
public class Harshard
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n==1729)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
}
