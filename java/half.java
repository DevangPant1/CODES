import java.util.Scanner;
public class half
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long half_1=0,half_2=0,cnt=0;
        long org;
        double sum;
        for(long i=3000;i<=3025;i++)
        {
            org=i;
            long ii=i;
            while(ii>=1)
            {
                half_1=ii%100;
                cnt=cnt+2;
                ii/=100;
                if(cnt>=2)
                {
                    half_2=ii;
                    break;
                }
            }
            sum=Math.pow(half_1+half_2,2);
            if(org==sum)
            {
                System.out.println(org+":IS TECH");
            }
            else
            {
                System.out.println(org+":IS NOT TECH");
            }
        }
}
}
