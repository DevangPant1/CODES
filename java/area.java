/*program that calculates area on basis of user input*/
import java.util.Scanner;
public class area
{
    double side1,side2,radius;
    area(double s1,double s2)
    {
        side1=s1;
        side2=s2;
    }
    area(double rad)
    {
        radius=rad;
    }
    public double rectArea()
    {
        double area=side1*side2;
        return area;
    }
    public double circArea()
    {
        double area=(22.0/7.0)*radius*radius;
        return area;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for rectangle area,2 for circle area and 3 for exiting interaction");
        int n=sc.nextInt();
        while(n!=3)
        {
            if(n==1)
            {
                System.out.println("Enter rectangle side 1");
                double x=sc.nextDouble();
                System.out.println("Enter rectangle side 2");
                double y=sc.nextDouble();
                area obj=new area(x,y);
                System.out.println("Side 1:"+obj.side1);
                System.out.println("Side 2:"+obj.side2);
                System.out.println(obj.rectArea());
            }
            if(n==2)
            {
                System.out.println("Enter radius");
                double r=sc.nextDouble();
                area obj=new area(r);
                System.out.println("Radius:"+obj.radius);
                System.out.println(obj.circArea());
            }
            n=sc.nextInt();
        }
    }
}