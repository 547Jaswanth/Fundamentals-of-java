import java.util.Scanner;
public class Paper
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();//w is the number of copies sold
        int x=sc.nextInt();//x is the cost per copy
        int y=sc.nextInt();//y is the cost the agency spends per copy.
        int z=(w*x)-(w*y)-100;
        System.out.println(z);
    }
}
