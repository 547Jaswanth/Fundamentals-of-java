import java.util.Scanner;
public class Garden
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();// number of rows
        b=sc.nextInt();// number of columns
        c=sc.nextInt();// tree number
        if(a>0 && a<=-5 || a%5==0 || a%5==1)
        {
            System.out.println("Yes");
        
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
