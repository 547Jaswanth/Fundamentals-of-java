import java.util.Scanner;
public class Flash1
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        double a=(x1+x2+x3)/3.0;
        double b=(y1+y2+y3)/3.0;
        System.out.printf("%.1f\n",a);
        System.out.printf("%.1f",b);
    }
}
