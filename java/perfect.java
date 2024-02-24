import java.util.Scanner;
public class perfect
{
    public static void main(String Args[])
    {
        System.out.println("ENTER A NUMBER TO SEE IF IT IS PERFECT OR NOT");
        int num1,num2,num3,num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%10<10)
        {
            num1=num/100;
            num3=num%10;
            num2=((num%100)-num3)/10;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            if(num1<num2 && num2<num3)
            {
                System.out.println("PERFECT NUMBER");
            }
            else
            System.out.println("NOT PERFECT NUMBER");
        }
        else
        System.out.println("INVALID NUMBER");
    }
}