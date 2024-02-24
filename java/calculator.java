import java.util.Scanner;
public class calculator
{
    public static void main(String Args[])
    {
        int ch,num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1 FOR ADD, 2 FOR SUBTRACT, 3 FOR MULTIPLY, 4 FOR DIVIDE");
        ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("ENTER 2 NUMBERS YOU WANT TO ADD");
            num1=sc.nextInt();
            num2=sc.nextInt();
            System.out.println(num1+"+"+num2+"="+(num1+num2));
            System.out.println("----------------------------------------------");
        }
    }
}