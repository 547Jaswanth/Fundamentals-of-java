import java.util.Scanner;
public class Oscar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=88,c=86;
        if(a==88)
        {
            System.out.println("Leo finally won the oscar! Leo is happy");
        }
        else if(a==86)
        {
            System.out.println("Not even for Wolf of wallstreet?!");
            
        }
        else if(a!=88||a!=86&&a<88)
        {
            System.out.println("When will you give Leo an Oscar?");
        }
        else if(a>88)
        {
            System.out.println("Leo got one already!");
        }
    }
}
