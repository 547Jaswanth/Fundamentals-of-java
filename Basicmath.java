import java.util.Scanner;
public class Basicmath
{
   public static void main(String[] args)
    {
        //Write your code here
    int a,b;
    char symbol;
    Scanner sc=new Scanner(System.in);
    symbol=sc.next().charAt(0);
    switch(symbol)
    {
        case '+':
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);
            break;
         case '-':
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a-b);
            break;
         case '*':
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a*b);
            break;
         case '/':
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a/b);
            break;
    }
        
    }
}
