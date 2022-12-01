import java.util.Scanner;
public class String4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       String Str =sc.nextLine();
       String reversedStr = "";

      for (int i = 0; i < Str.length(); i++) 
      {
        reversedStr = Str.charAt(i) + reversedStr;
       }

         System.out.println(reversedStr);
    }
}
