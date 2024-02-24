/*java code snippet*/
import java.util.Scanner;
public class code
{
    public static void main(String args[])
    {
        int a=435;
        int sum=0;
        while(a>0)
        {
            sum+=a%10;
            a/=10;
        }
        System.out.println(sum);
    }
}