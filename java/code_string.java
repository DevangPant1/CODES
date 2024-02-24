//checks if valid code string entered
import java.util.Scanner;
public class code_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER CODE STRING");
        String a=sc.nextLine();
        int valid=0,invalid=0;
        if(Character.isLetter(a.charAt(0))==true)
        {
            valid+=1;
        }
        else if(Character.isLetter(a.charAt(0))==false)
        {
            invalid+=1;
        }
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(Character.isLetterOrDigit(b)==true)
            {
                valid+=1;
            }
            else
            {
                invalid+=1;
            }
        }
        if(invalid==0)
        {
            System.out.println("VALID CODE STRING");
        }
        else
        {
            System.out.println("INVALID CODE STRING");
        }
    }
}
