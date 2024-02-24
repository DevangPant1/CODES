/*program to calculate diff area on basis of input*/
import java.util.Scanner;
public class area_overload
{
    public double area(double h,int base)
    {
        return(h*base);
    }
    public double area(double d1,double d2)
    {
        return(0.5*d1*d2);
    }
    public double area(double p1,double p2,double h)
    {
        return(0.5*h*(p1+p2));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 for parallelogram area,2 for rhombus area,3 for trapezium");
        System.out.println("Enter choice");
        int n=sc.nextInt();
        area_overload obj=new area_overload();
        switch(n)
        {
            case 1:
            System.out.println("Enter height");
            double x=sc.nextDouble();
            System.out.println("Enter base");
            int y=sc.nextInt();
            System.out.println(obj.area(x,y));
            break;
            case 2:
            System.out.println("Enter Diagonal 1");
            double z=sc.nextDouble();
            System.out.println("Enter Diagonal 2");
            double a=sc.nextDouble();
            System.out.println(obj.area(z,a));
            break;
            case 3:
            System.out.println("Enter Side 1");
            double b=sc.nextDouble();
            System.out.println("Enter Side 2");
            double c=sc.nextDouble();
            System.out.println("Enter Height");
            double d=sc.nextDouble();
            System.out.println(obj.area(b,c,d));
            break;
        }
    }
}