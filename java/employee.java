//employee information
import java.util.Scanner;
public class employee
{
    String ename;
    int age,eno;
    double basic,net;
    employee()
    {
        ename="N/A";
        age=0;
        eno=0;
        basic=0.0D;
        net=0.0D;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee number");
        eno=sc.nextInt();
        System.out.println("Enter employee name");
        ename=sc.next();
        System.out.println("Enter employee age");
        age=sc.nextInt();
        System.out.println("Enter basic salary");
        basic=sc.nextDouble();
    }
    public void calculate()
    {
        net=basic;
        net=(net+(0.185*basic)+(0.1745*basic))-(0.0810*basic);
        if(age>50)
        net+=5000;
    }
    void print()
    {
        System.out.println(eno+"  "+ename+"  "+age+"  "+basic+"  "+net);
    }
    public static void main(String args[])
    {
        employee obj=new employee();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}

















