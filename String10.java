import java.util.Scanner;
public class String10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
              n++;  
            }
            
        } 
        System.out.println(n);
    }
}
