/*program to check if a number is automorphic*/
import java.util.Scanner;
public class automorhpic
{
    public static void main(String args[])
    {
        int rev=0,num,org;
        System.out.println("ENTER THE NUMBER");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        org=num;
        while(num>=1)
        {
            rev=(rev*10)+(num%10);
            num/=10;
        }
        System.out.println(rev);
        if(org==rev)
        {
            System.out.println("THE NUMBER IS AUTOMORPHIC");
        }
        else
        {
            System.out.println("NUMBER IS NOT AUTOMORPHIC");
        }
    }
}