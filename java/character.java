import java.util.Scanner;
public class character
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER SENTENCE");
        String a=sc.nextLine();
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            String g="";
            if(Character.isWhitespace(b))
            {
                System.out.println(g);
                g="";
            }
            else 
            {
                g=g+(Character.toString(b));
            }
        }
    }
}
