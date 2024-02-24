import java.util.Scanner;
public class positive
{
    public static void main(String Args[])
    {
        System.out.println("ENTER A NUMBER TO CHECK IF IT IS POSITIVE OR NEGATIVE");
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        if(num<0)
        {
            System.out.println("YOUR NUMBER IS NEGATIVE");
        }
        else if(num>0)
        {
            System.out.println("YOUR NUMBER IS POSITIVE");
        }
        else
        {
            System.out.println("NUMBER IS NEITHER POSITIVE NOR NEGATIVE");
        }
    }
}
