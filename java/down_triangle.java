import java.util.Scanner;
public class down_triangle
{
    public static void main(String args[])
    {
        for(int i=1;i<=17;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int j=1;j<=9;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(17-(2*j+2));k++)
            {
                System.out.print(" ");
            }
        System.out.println();
    }
}
