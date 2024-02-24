import java.util.Scanner;
public class first
{
    public static void main(String args[])
    {
        int n;
        Scanner dev=new Scanner(System.in);
        System.out.println("Enter a number ");
        n=dev.nextInt();
        if(n%5==0)
        {
            System.out.println("Number is divisible by 5");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
