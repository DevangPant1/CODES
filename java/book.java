import java.util.Scanner;
public class book
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 3 SHORT VALUE");
        short a=sc.nextShort();
        short b=sc.nextShort();
        short c=sc.nextShort();
        String n1=Short.toString(a);
        String n2=Short.toString(b);
        String n3=Short.toString(c);
        String sum=n1+n2+n3;
        long ab=Long.parseLong(sum);
        System.out.println(ab);
    }
}