import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,a1,b1,a2,b2,area,area1,area2,area3;
        a=sc.nextInt();
        b=sc.nextInt();
        a1=sc.nextInt();
        b1=sc.nextInt();
        a2=sc.nextInt();
        b2=sc.nextInt();
        area=2*(a+b);
        area1=2*(a1+b1);
        area2=2*(a2+b2);
        area3=area1+area2;
        if(area==area3)
        {
            System.out.println("Karthi can fix both painting");
        }
        else if(area<area3)
        {
             System.out.println("Karthi cannot fix both painting");
        }
        }
}
