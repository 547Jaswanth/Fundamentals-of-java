import java.util.Scanner;
public class Boat  
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b=75,c=50,d;
        a=sc.nextInt();//boat weight
        b=sc.nextInt();//adult weight
        c=sc.nextInt();//childrenm weight
        b=b*75;
        c=c*50;
        d=b+c;
        if(d<=a)
        {
            System.out.println("Boat is Stable");
        }
        else 
        {
            System.out.println("Boat is unstable");
        }
        
    }
}
