import java.util.Scanner;

public class String6
{
   public static void main(String[] args)
   {
      String a, b;
      Scanner scan = new Scanner(System.in);
      
      
      a = scan.nextLine();
     
      b = scan.nextLine();
      
      a = a.concat(b);
      System.out.println(a);
   }
}
