import java.util.Scanner;
public class cube1
{
    void print()
    {
        int cnt=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
    void print(int n)
    {
        int org=n,sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        sum=sum*sum*sum;
        if(sum==org)
        {
            System.out.println("Dudeney");
        }
        else
        {
            System.out.println("Not Dudeney");
        }
    }
    void print(int a,char ch)
    {
        switch(ch)
        {
            case 'c':
                System.out.println(a*a*a);
                break;
            case 'C':
                System.out.println(a*a*a);
                break;
            case 's':
                System.out.println(a*a);
                break;
            case 'S':
                System.out.println(a*a);
                break;
            default:
                break;
        }
    }
    public static void main(String args[])
    {
        cube1 obj=new cube1();
        obj.print();
        obj.print(512);
        obj.print(4,'C');
    }
}
