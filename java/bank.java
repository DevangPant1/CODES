import java.util.Scanner;
public class bank
{
    String name,type;
    long acc_num,balance;
    bank()
    {
        name="";
        type="";
        acc_num=0;
        balance=0;
    }
    bank(String nm,String tp,long num,long bal)
    {
        name=nm;
        type=tp;
        acc_num=num;
        balance=bal;
    }
    public void initial(String nm,String tp,long num,long bal)
    {
        name=nm;
        type=tp;
        acc_num=num;
        balance=bal;
    }
    public void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter deposit value");
        int val=sc.nextInt();
        balance+=val;
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
        System.out.println("Balance:"+balance);
    }
    public void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter withdraw value");
        int val=sc.nextInt();
        if(balance>val)
        {
            balance=balance-val;
            System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY");
            System.out.println("Available balance:"+balance);
        }
        else
        {
            System.out.println("INSUFFICIENT BALANCE");
        }
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Account type:"+type);
        System.out.println("Account Number:"+acc_num);
        System.out.println("Balance:"+balance);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME");
        String name=sc.nextLine();
        System.out.println("ENTER ACCOUNT TYPE");
        String type=sc.nextLine();
        System.out.println("ENTER ACCOUNT NUMBER");
        long num=sc.nextLong();
        System.out.println("ENTER BALANCE");
        long bal=sc.nextLong();
        bank obj=new bank();
        obj.initial(name,type,num,bal);
        int n=-1;
         while(n!=4)
        {
            System.out.println("Enter choice, 1 for deposit, 2 for withdrawal, 3 for display, 4 for exit");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                    obj.deposit();
                    break;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    break;
            }
        }
    }
}
