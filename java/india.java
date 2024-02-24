import java.util.Scanner;
public class india
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String l=sc.nextLine();
        int prev=0;
        l=l.toUpperCase();
        l=l+" ";
        for(int i=0;i<l.length();i++)
        {
            if(l.charAt(i)==' ')
            {
                System.out.println(l.substring(prev,i));
                prev=i+1;
            }
        }
    }
}
