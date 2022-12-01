import java.util.Scanner;
public class Flash
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        double x,y;
        x=(x1+x2)/2;
         y=(y1+y2)/2.0;
         System.out.printf("%.1f\n",x);
         System.out.printf("%.1f",y);
        
    }
}
