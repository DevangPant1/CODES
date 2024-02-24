import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1 FOR SUM,2 FOR REVERSE");
        int i,ch,d,num,sum,rev,org;
        ch=sc.nextInt();
        System.out.println("PLEASE ENTER NUMBER");
        org=sc.nextInt();
        sum=0;
        rev=0;
        num=org;
        switch(ch)
        {
            case 1:
            while(num>0)
            {
                sum=(num%10)+sum;
                num=num/10;
            }
            System.out.println("SUM="+sum);
            break;
            case  2:
            while(num>0)
            {
                d=num%10;
                rev=(rev*10)+d;
                num=num/10;
            }
            if(org==rev)
            {
                System.out.println("REVERSE="+rev);
                System.out.println("NUMBER IS PALINDROME");
            }
            else
            {
                System.out.println("REVERSE="+rev);
                System.out.println("NUMBER IS not PALINDROME");
            }
            break;
            default:
            System.out.println("ERROR");
            break;
        }
    }
}