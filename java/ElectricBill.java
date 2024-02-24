//calculates and prints bill
import java.util.Scanner;
public class ElectricBill
{
    String n;
    int units;
    double bill;
    ElectricBill()
    {
        n="N/A";
        units=0;
        bill=0.0D;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        n=sc.next();
        System.out.println("Enter number of units");
        units=sc.nextInt();
    }
    void calculate()
    {
        if(units<=100)
        {
            bill=2*units;
        }
        else if(units>100 && units<=300)
        {
            bill=(2*100)+(3*(units-100));
        }
        else
        {
            bill=(2*100)+(3*200)+(5*(units-300));
            bill=bill+((0.025)*bill);
        }
    }
    void print()
    {
        System.out.println("Name:"+n);
        System.out.println("Units:"+units);
        System.out.println("Bill:"+bill);
    }
    public static void main(String args[])
    {
        ElectricBill obj=new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
