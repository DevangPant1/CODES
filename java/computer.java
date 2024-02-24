import java.util.Scanner;
public class computer
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        String a=sc.next();
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o'  || a.charAt(i)=='u')
            {
                int val=(int)(a.charAt(i))+1;
                char ch=(char)val;
                a=a.replace(a.charAt(i),ch);
            }
        }
        System.out.println(a);
    }
}
