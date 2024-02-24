import java.util.Scanner;
public class qiuizzard
{
    public static void main(String Args[])
    {
        int a,b,c,d,e,f,g;
        a=1;
        b=64;
        c=7;
        d=22;
        e=a;
        f=d;
        g=c;
        for(int i=((a*b)+(c-1));i>=(c+d+a)*2;i--)
        {
        if (e==5 || e==3)
        {
            e++;
            continue;
        }
        else if(e==9)
        {
            break;
        }
        else
        {
            System.out.println(i);
        }
        e++;
    }
}
}
