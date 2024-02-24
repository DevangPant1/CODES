import java.util.Scanner;
public class func
{
    public void print()
    {
        int cnt=0;
        for(int i=1;i<=4;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(++cnt+" ");
            }
            System.out.println();
        }
    }
    public boolean print(int n)
    {
        int sq=0,org;
        org=n;
        while(n>0)
        {
            sq+=n%10;
            n/=10;
        }
        sq=sq*sq*sq;
        if(org==sq)
        return true;
        else
        return false;
    }
    public void print(int a,char ch)
    {
        if(ch=='s' || ch=='S')
        System.out.println(a*a);
        else if(ch=='c' || ch=='C')
        System.out.println(a*a*a);
    }
    public static void main(String args[])
    {
        func obj=new func();
        obj.print();
        System.out.println("-----------------");
        System.out.println(obj.print(512));
        System.out.println("-----------------");
        obj.print(3,'S');
    }
}
