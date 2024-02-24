//prints factorial
import java.util.Scanner;
public class fibo
{
    public int fibo(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else if (n==0)
        {
            return 0;
        }
        else
        {
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String args[])
    {
        fibo obj=new fibo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        int n=sc.nextInt();
        for(int i=0;i<=n+1;i++)
        {
            System.out.print(obj.fibo(i)+" ");
        }
    }
}