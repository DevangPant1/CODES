import java.util.Scanner;
public class taxes
{
    public static void main(String Args[])
    {
        double tax;
        int income,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MONTHLY INCOME");
        income=sc.nextInt();
        tax=0;
        ch=0;
        if(income<=5000)
        {
            ch=1;
        }
        else if(5000<income && income<=10000)
        {
            ch=2;
        }
        else if(income>10000 && income<=20000)
        {
            ch=3;
        }
        else if(income>20000 && income<=30000)
        {
            ch=4;    
        }
        else if(income>30000)
        {
            ch=5;
        }
        switch(ch)
        {
            case 1:
            tax=0;
            break;
            case 2:
            tax=(0.1)*income;
            break;
            case 3:
            tax=(0.3)*income;
            break;
        }
        System.out.println("MONTHLY INCOME:"+income);
        System.out.println("TAX:"+tax);
        System.out.println("-------------------------------------------------------------------------------");
}
}