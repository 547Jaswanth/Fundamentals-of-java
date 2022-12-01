import java.util.Scanner;
public class Strong
{
    public static void main(String args[])
    {
        //write your code
       
        int num,originalNum,rem,fact,sum=0,i;
         Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        originalNum=num;
        while(num>0)
        {  
            i=1;
            rem=num%10;//reminder value
            fact=1;
            while(i<=rem)
            
            {
                fact=fact*i;
                i++;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(sum==originalNum)
        {
            
            System.out.println("Strong Number");
        }
        else 
        {
            System.out.println("Not a Strong Number");
        }
    
    }
}







