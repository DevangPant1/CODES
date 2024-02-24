import java.util.Scanner;
public class ternary
{
    public static void main(String Args[])
    {
        System.out.println("ENTER ANY 3 DIGIT NUMBER TO CHECK IF IT IS BUZZ OR NOT");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a%10==7?"YOUR NUMBER IS BUZZ":a%7==0?"YOUR NUMBER IS BUZZ":"YOUR NUMBER IS NOT BUZZ");
    }
}