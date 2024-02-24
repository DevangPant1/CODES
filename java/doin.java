import java.util.Scanner;
public class doin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String ln=sc.nextLine();
        for(int i=0;i<ln.length();i++)
        {
            if(Character.isDigit(ln.charAt(i))==false && Character.isLetter(ln.charAt(i))==false && ln.charAt(i)!=' ')
            {
                ln=ln.replace(ln.charAt(i),'$');
            }
        }
        int letter=0,digit=0,space=0;
        for(int i=0;i<ln.length();i++)
        {
            if(Character.isLetter(ln.charAt(i))==true)
            {
                letter++;
                if(ln.charAt(i)=='a'||ln.charAt(i)=='e'||ln.charAt(i)=='i'||ln.charAt(i)=='o'||ln.charAt(i)=='u')
                ln=ln.replace(ln.charAt(i),'*');
                else if(ln.charAt(i)=='A'||ln.charAt(i)=='E'||ln.charAt(i)=='I'||ln.charAt(i)=='O'||ln.charAt(i)=='U')
                ln=ln.replace(ln.charAt(i),'@');
                else
                ln=ln.replace(ln.charAt(i),'&');
            }
            if(Character.isDigit(ln.charAt(i))==true)
            {
                digit++;
                ln=ln.replace(ln.charAt(i),'#');
            }
            if(ln.charAt(i)==' ')
            space++;
        }
        System.out.println(ln);
        System.out.println("LETTER:"+letter);
        System.out.println("Digit:"+digit);
        System.out.println("Space:"+space);
    }
}