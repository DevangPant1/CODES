import java.util.Scanner;
public class twin_prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int prev=-1;
        for(int i=0;i<=50;i++)
        {
            int fact=0; 
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                fact++;
            }
            if(fact==2)
            {
                if(i-prev==2)
                {
                    System.out.println(prev+"    "+i);
                }
                prev=i;          
            }
        }
    }
}
