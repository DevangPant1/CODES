import java.util.Scanner;
public class tern
{
    public static void main(String Args[])
    {
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MARKS NOW=");
        m=sc.nextInt();
        System.out.println(m>80?"GRADE A":m>70?"GRADE B":"GRADE C");
    }
}
