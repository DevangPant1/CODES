import java.util.Scanner;
public class auto
{
    public static void main(String Args[])
    {
        int x;
        int y;
        System.out.println("Enter any number");
        Scanner f=new Scanner(System.in);
        x=f.nextInt();
        y=x*x;
        if(y%10==x)
        {
            System.out.println("Number is automorphic");
        }
        else
        {
            System.out.println("Nope");
        }
    }
}