//calculates factorial of input
import java.util.Scanner;
public class factorial
{
    public int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial obj=new factorial();
        System.out.println("Factorial:"+obj.fact(n));
    }
}
