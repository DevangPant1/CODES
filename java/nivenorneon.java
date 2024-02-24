import java.util.Scanner;
public class nivenorneon
{
    public static void main(String args[])
    {
        int num,sum1=0,sum2=0,org,power;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK IF IT IS NIVEN OR NEON");
        num=sc.nextInt();
        org=num;
        power=(int)Math.pow(num,2);
        while(num>=1)
        {
            sum1+=num%10;
            num/=10;
        }
        while(power>=1)
        {
            sum2+=power%10;
            power/=10;
        }
        if(org%sum1==0 && sum2==org)
        {
            System.out.println("NUMBER IS BOTH NIVEN AND NEON");
            System.out.println("---------------------------------------------");
        }
        else if(org%sum1==0)
        {
            System.out.println("NUMBER IS NIVEN");
            System.out.println("---------------------------------------------");
        }
        else if(sum2==org)
        {
            System.out.println("NUMBER IS NEON");
            System.out.println("---------------------------------------------");
        }
        else
        {
            System.out.println("NUMBER IS NEITHER NIVEN NOR NEON");
        }
    }
}
