import java.util.Scanner;
public class employee1
{
    int eno,age;
    String ename;
    double basic,org;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        ename=sc.next();
        System.out.println("Enter employee number");
        eno=sc.nextInt();
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("Enter basic salary");
        basic=sc.nextDouble();
        org=basic;
    }
    public void calculate()
    {
        double hra=0,da=0,pf=0;
        hra=(0.1850)*(basic);
        da=(0.1745)*(basic);
        pf=(0.0810)*basic;
        basic=basic+hra+da-pf;
        if(age>50)
        basic+=5000;
    }
    public void print()
    {
        System.out.print(eno+"  "+ename+"  "+age+"  "+org+"  "+basic);
    }
    public static void main(String args[])
    {
        employee1 obj=new employee1();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
