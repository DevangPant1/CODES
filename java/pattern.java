import java.util.Scanner;
public class pattern
{
    public static void main(String args[])
    {
        int x,val;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER VALUE");
        x=sc.nextInt();
        val=x<=0?2*x:x>0 && x<10?5*x:0;
        System.out.println(val);
    }
}