import java.util.Scanner;
public class Agedetect
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int by,cy,c;
        by=sc.nextInt();
        cy=sc.nextInt();
        
        if(by<cy)
        {
            System.out.println("Enter Year of Birth");
             System.out.println("Enter Current year");
             System.out.printf("Your age is %d",cy-by);
        }
        else if(by>cy)
        {
            cy=cy+100;
             System.out.println("Enter Year of Birth");
             System.out.println("Enter Current year");
             System.out.printf("Your age is %d",cy-by);
        }


    }
}
