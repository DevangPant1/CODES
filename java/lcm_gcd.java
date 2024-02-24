import java.util.Scanner;
public class lcm_gcd
{
    public static void main(String args[])
    {
        int dig1,dig2,gcd,min,i,lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER");
        dig1=sc.nextInt();
        System.out.println("ENTER 2ND NUMBER"); 
        dig2=sc.nextInt();
        min=Math.min(dig1,dig2);
        gcd=0;
        for(i=1;i<=min;i++)
        {
            if(dig1%i==0 && dig2%i==0)
            {
                gcd=i;
            }
        }
        lcm=(dig1*dig2)/gcd;
        System.out.println("HIGHEST COMMOM FACTOR IS "+gcd);
        System.out.println("LOWEST COMMON MULTIPLE IS "+lcm);
    }
}