/*Program that makes alphabet of each word uppercase*/
import java.util.Scanner;
public class first
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER STRING");
        String s1=sc.nextLine();
        s1=" "+s1;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==' ')
            {
                char temp=s1.charAt(i+1);
                s1=s1.replace(temp,Character.toUpperCase(temp));
            }
        }
        String s2=s1.trim();
        System.out.println(s2);
    }
}
