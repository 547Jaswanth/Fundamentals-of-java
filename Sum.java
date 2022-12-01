import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int num,sum=0,degit;
        num=sc.nextInt();
        while(num>0)
        {
    
            degit=num%10;//719%10==9 , 71%10==1 
            sum=sum+degit; //0+9=9  ,  9+1=10
            num=num/10;//719/10==71  ,71/10=7
            
        }
            System.out.println(sum);
    
        
    }
}
