import java.util.Scanner;
public class prime_palindrome
{
    public static void main(String args[])
    {
        int num,org,rev,ch=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER FOR PRIME PALINDROME DETECTION");
        org=num=sc.nextInt();
        rev=0;
        while(num>=1)
        {
            rev=(rev*10)+(num%10);
            num=num/10;
        }
        for(int i=1;i<=org;i++)
        {
            if(org%i==0)
            {
                ch+=1;
            }
        }
        if(ch==2 && rev==org)
        {
            System.out.println("YOUR NUMBER IS PRIME PALINDROME");
        }
        else
        System.out.println("NOPE");
    }
}