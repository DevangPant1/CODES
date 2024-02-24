import java.util.Scanner;
public class weekly_wages
{
    public static void main(String Args[])
    {
        double H,R,W,I;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("PLEASE ENTER NAME");
        name=sc.nextLine();
        System.out.println("PLEASE ENTER NUMBER OF HOURS WORKED");
        H=sc.nextDouble();
        System.out.println("NOW PLEASE ENTER THE RATE PER HOUR");
        R=sc.nextDouble();
        I=0;
        W=0;
        if(H==40)
        {
            W=H*(R);
            I=1;
        }
        else if(H<56 && H>40)
        {
            W=H*((1.25*R));
            I=1.25;
        }
        else if(H>56)
        {
            W=H*(1.5*R);
            I=1.5;
        }
        System.out.println("FINAL WEEKLY WAGE");
        System.out.println("NAME:"+name);
        System.out.println("HOURS WORKED:"+H);
        System.out.println("RATE:"+R);
        System.out.println("INCREMENT RATE:"+I);
        System.out.println("FINAL WEEKLY WAGE:"+W);
        System.out.println("---------------------------------------------------------------------------");
    }
}





