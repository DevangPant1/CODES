import java.util.Scanner;
public class nextchk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
    }
}
