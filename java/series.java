import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        int num,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER TILL WHICH YOU WANT TO PRINT SERIES");
        num=sc.nextInt();
        for(i=0;i<=num;i++)
        {
            if(i==0)
            {
                System.out.print(1);
            }
            else
            {
                System.out.print("+"+"1/"+i);
            }
        }
    }
}
