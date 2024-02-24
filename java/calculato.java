import java.util.Scanner;
public class calculato
{
    public static void main(String args[])
    {
        System.out.println("----------------------------------------------------------------------");
        char a;
        double b,c,ans;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER WHAT YOU WANT TO DO");
        a=sc.next().charAt(0);
        System.out.println("ENTER 1ST DIGIT");
        b=sc.nextDouble();
        System.out.println("ENTER 2nd DIGIT");
        c=sc.nextDouble();
        ans=0;
        switch(a)
        {
            case '+':
            ans=b+c;
            break;
            case '-':
            ans=b-c;
            break;
            case '*':
            ans=b*c;
            break;
            case '/':
            ans=b/c;
            break;
            default:
            System.out.println("PLEASE ENTER A VALID  OPERATOR");
            break;
        }
        System.out.println("YOUR ANSWER IS:"+ans);
        System.out.println("----------------------------------------------------------------------");
    }
}
