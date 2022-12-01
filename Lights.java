import java.util.Scanner;
public class Lights
{
    public static void main(String args[])
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        float s=sc.nextFloat();//speed
        float d=sc.nextFloat();//destance
        float t=sc.nextFloat();//time
        if(s/d<t)
        {
            System.out.println("no");
        }
        else if(s/d>t)
        {
            System.out.println("yes");
            
        }
    }
}
