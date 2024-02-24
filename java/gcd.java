import java.util.Scanner;
public class gcd
{
    int x,gcd;
    public int input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        x=sc.nextInt();
        return x;
    }
    public int gcd(int a,int b)
    {
        int grt=Math.min(a,b);
        for(int i=1;i<=grt;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String args[])
    {
        gcd obj=new gcd();
        int z=obj.input();
        int y=obj.input();
        System.out.println(obj.gcd(z,y));
    }
}
