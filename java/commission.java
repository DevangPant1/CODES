/*program that calculates commission with constructor*/
import java.util.Scanner;
public class commission
{
    String name;
    double sales,com;
    commission(String nm,double s)
    {
        name=nm;
        sales=s;
        com=0;
    }
    public void calc()
    {
        com=(0.02)*sales;
    }
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Sales:"+sales);
        System.out.println("Total Commission:"+com);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String x=sc.next();
        System.out.println("Enter sales");
        double y=sc.nextDouble();
        commission obj=new commission(x,y);
        obj.calc();
        obj.display();
    }
}