import java.util.Scanner;
public class Budget
{
    public static void main(String args[])
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
       int a,b,c,d,e;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       d=sc.nextInt();
       e=sc.nextInt();
       
       
       
      
      double a1,b1,c1,d1,e1,total;
      
        a1=a*350.34;
        b1=b*230.90;
        c1=c*190.55;
        d1=d*125.30;
        e1=e*180.90;
        total=a1+b1+c1+d1+e1;
        if(total>15000)
        {
            
            System.out.println("no");
        }
        else if(total<=15000)
        {
            System.out.println("Yes");
        }
        
        


        
    }
}
