import java.util.Scanner;
public class String9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String st=new StringBuffer(str).reverse().toString();
        if(str.equals(st))
        {
            System.out.println("palindrome");
            
        }
        else
        {
            System.out.println("Not a Palindrome");
            
        }
        
    }
}
