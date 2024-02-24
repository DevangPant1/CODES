import java.util.Scanner;
public class math
{
    public static void main(String Args[])
    {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        System.out.println(Math.round(a));
        System.out.println(Math.round(b));
        System.out.println(Math.round(c));
        System.out.println(Math.rint(a));
        System.out.println(Math.rint(b));
        System.out.println(Math.rint(c));
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));
        System.out.println(Math.abs(c));
    }
}