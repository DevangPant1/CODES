import java.util.Scanner;
public class Happy
{
    int n;
    Happy()
    {
        n=0;
    }
    public void getnum(int nn)
    {
        n=nn;
    }
    public int sum_sq_digits(int x)
    {
        int sum=0;
        while(x>=1)
        {
            sum+=Math.pow((x%10),2);
            x=x/10;
        }
        System.out.println(sum);
        return sum;
    }
    public void ishappy()
    {
        int x=sum_sq_digits(n);
        while(x>=10)
        {
            x=sum_sq_digits(x);
        }
        if(x==1)
        {
            System.out.println("Happy number");
        }
        else
        {
            System.out.println("Not a happy number");
        }
    }
    public static void main(String args[])
    {
        Happy obj=new Happy();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        obj.getnum(num);
        obj.ishappy();
    }
}
