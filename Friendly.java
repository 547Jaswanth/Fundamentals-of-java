import java.util.Scanner;
public class Friendly
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();//6    6 divisor values=1,2,3,6
        int n2=sc.nextInt();//28    28 divisor values=1,2,4,7,14,28
        int count1=0;
        int count2=0;
        for(int i=1;i<n1;i++)//i=1;1<6;i++(true),   i=2;2<6;i++(true),  i=3;3<6;i++(true) ,i=4;4<6;4++(true),   
        {
            if(n1%i==0)   //6%1==0,  6%2==0,   6%3==0 6%4!=0,   6%5!=0
            {
                count1=count1+i; //count1=0+1=1,  count1=1+2=3  ,  count1=3+3=6 , count1=6

                }
                for(int j=1;j<n2;j++)
                {
                   if(n2%j==0)
               {
                   count2=count2+j;
        
                  if((count1%n1)==(count2%n2))
                 {
                     System.out.println("Friendly Pair");
                 }
                   else
                    {
                       System.out.println("Not Friendly Pair");
                    }
                
               }
            }
       
              }
       }
}
