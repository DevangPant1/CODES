
/**
 * Write a description of class conversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class conversion
{
    short v1,v2,v3;
    long ans;
    conversion(short val1,short val2,short val3,long n)
    {
        v1=val1;
        v2=val2;
        v3=val3;
        ans=n;
    }
    long calulate()
    {
        String ns=Short.toString(v1)+Short.toString(v2)+Short.toString(v3);
        ans=Long.parseLong(ns);
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 3 SHORT VALUES");
        short a=sc.nextShort();
        short b=sc.nextShort();
        short c=sc.nextShort();
        conversion obj=new conversion(a,b,c,0);
        System.out.println(obj.calulate());
    }
}
