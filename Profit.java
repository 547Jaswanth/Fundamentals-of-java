import java.util.Scanner;
public class Profit
{
    public static void main(String args[])
    {
    //main function program start here
        Scanner sc=new Scanner(System.in); //object for scanner class
        Test p1=new Test();
        //input values
        float y,x;
        x=sc.nextFloat();//12 mangos buying cast
        y=sc.nextFloat();//selling 1 mango coat
        p1.prof(x,y);
    }
}
//class for calculation
class Test
{
    public static void prof(float x,float y)
    {
        float selling,x1;
        selling=y*12;//12 mangos selling cost
        x1=x/12;//1 mango buying cost
        if(x<selling)
        {
            System.out.println("Enter the price of a dozen mangoes");
            System.out.println("Enter the price at which 1 mango is being sold");
            System.out.printf("Profit : Rs.%.2f",(selling-x));
        }
        else if(x>selling)
        {
             System.out.println("Enter the price of a dozen mangoes");
            System.out.println("Enter the price at which 1 mango is being sold");
            System.out.printf("Loss : Rs.%.2f",(x-selling));
            
        }
        else if(x==selling)
        {
             System.out.println("Enter the price of a dozen mangoes");
            System.out.println("Enter the price at which 1 mango is being sold");
         System.out.printf("No profit nor loss");   
        }
    }
    
    
}
