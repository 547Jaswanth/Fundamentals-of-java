import java.util.Scanner;
public class Series2
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n,i,sum=6,p=0,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            j=sum+p;;
            System.out.printf("%d ",j);
            sum=j+5*i;
            
           
        }
       
        
    }
}
