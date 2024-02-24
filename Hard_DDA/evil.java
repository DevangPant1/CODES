import java.util.Scanner;
public class evil
{
    public String recur(int x)
    {
        if(x==1)
        {
            return "1";
        }
        else
        {
            int a=x%2;
            return a+""+recur(x/2);
        }
    }
    public String reverse(String r)
    {
        String reverse="";
        for(int i=(r.length()-1);i>=0;i--)
        {
            reverse=reverse+(r.charAt(i));
        }
        return reverse;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        evil obj=new evil();
        String val=obj.recur(n);
        val=obj.reverse(val);
        System.out.println(val);
        int cnt=0;
        for(int i=0;i<val.length();i++)
        {
            if(val.charAt(i)=='1')
            cnt++;
        }
        if(cnt%2==0)
        {
            System.out.println("Evil num");
        }
        else
        {
            System.out.println("Not an evil number");
        }
    }
}
