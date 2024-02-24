/*Acts as a virtual bank to show/deposit/withdraw cash*/
import java.util.Scanner;
public class bankaccount
{
    String name,type;
    double balance,acc_num;
    bankaccount()
    {
        name="";
        type="";
        balance=0.0;
        acc_num=0.0;
    }
    void input(String n,String t,double bal,double acc)
    {
        name=n;
        type=t;
        balance=bal;
        acc_num=acc;
    }
    void withdraw(double amt)
    {
        if(balance>amt)
        {
            balance=balance-amt;
            System.out.println("AMOUNT WITHDRAWN:"+amt);
            System.out.println("REMAINING BANK BALANCE:"+balance);
        }
        else
        {
            System.out.println("INSUFFICIENT BANK BALANCE");
        }    
    }
    void deposit(double amt2)
    {
        balance=balance+amt2;
        System.out.println("AMOUNT DEPOSITED:"+amt2);
        System.out.println("BANK BALANCE:"+balance);
    }
    void display()
    {
        System.out.println("NAME:"+name);
        System.out.println("ACCOUNT TYPE:"+type);
        System.out.println("ACCOUNT NUMBER:"+acc_num);
        System.out.println("ACCOUNT BALANCE:"+balance);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME");
        String nm=sc.nextLine();
        System.out.println("ENTER ACCOUNT TYPE");
        String tp=sc.nextLine();
        System.out.println("ENTER ACCOUNT NUMBER");
        double num=sc.nextDouble();
        System.out.println("ENTER BALANCE");
        double bl=sc.nextDouble();
        bankaccount obj=new bankaccount();
        obj.input(nm,tp,bl,num);
        int x=0;
        System.out.println("ENTER 1 FOR WITHDRAWAL, 2 FOR DEPOSITING, 3 FOR DISPLAYING COMPLETE INFO AND 4 FOR EXITING INTERACTION");
        while(x!=4)
        {
            x=sc.nextInt();
            if(x==1)
            {
                System.out.println("ENTER WITHDRAW AMOUNT");
                double wth=sc.nextDouble();
                obj.withdraw(wth);
            }
            else if(x==2)
            {
                System.out.println("ENTER DEPOSIT AMOUNT");
                double wh=sc.nextDouble();
                obj.deposit(wh);
            }
            else if(x==3)
            {
                obj.display();
            }
            else if(x==4)
            {
                break;
                        }
        }
    }
}
