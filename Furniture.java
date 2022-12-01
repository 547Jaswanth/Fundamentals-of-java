import java.util.Scanner;
public class Furniture
{
	public static void main(String arg[])	
	{
	    Scanner sc=new Scanner(System.in);
     int temp;
	 int a=sc.nextInt();
	 int d=sc.nextInt();
	 int year=sc.nextInt();
	 temp=a;
	 for(int i=0;i<year;i++)
	 temp=((100-d)*temp)/100;
	 System.out.println(temp);
	
	    
	}
}
        
