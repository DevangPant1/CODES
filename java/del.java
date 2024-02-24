import java.util.Scanner;
public class del
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String word=sc.next();
        String n="";
        for(int i=0;i<word.length();i++)
        {
            if(word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i)))
            {
                n=n+word.charAt(i);
            }
            else 
            {
                if(i==word.indexOf(word.charAt(i)))
                {
                    n=n+word.charAt(i);
                }
            }
        }
        System.out.println(n);
    }
}