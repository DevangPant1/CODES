import java.util.Scanner;
public class homework
{
    public static void main(String Args[])
    {
        int n;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        Scanner dc=new Scanner(System.in);
        n=sc.nextInt();
        b=dc.nextInt();
        if(n>b)
        {
            System.out.println(n+" is greater");
            
        }
        else
        {
            System.out.println(b+" is greater");
        }
    }
}