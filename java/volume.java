import java.util.Scanner;
public class volume
{
        public double volume(double r)
        {
            double V=(4/3)*(22/7)*Math.pow(r,3);
            return V;
        }
        public double volume(double h, double r)
        {
            double V=(22/7)*r*r*h;
            return V;
        }
        public double volume(double b,double h,double l)
        {
            double V=l*b*h;
            return V;
        }
        public static void main(String args[])
        {
            volume abc=new volume();
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER 1 FOR VOLUME OF SPHERE");
            System.out.println("ENTER 2 FOR VOLUME OF CYLINDER");
            System.out.println("ENTER 3 FOR VOLUME OF CUBOID");
            int x=sc.nextInt();
            switch(x)
            {
                case 1:
                System.out.println("ENTER RADIUS");
                double y=sc.nextInt();
                System.out.println(abc.volume(y));
                break;
                case 2:
                System.out.println("ENTER RADIUS");
                double w=sc.nextDouble();
                System.out.println("ENTER HEIGHT");
                double v=sc.nextDouble();
                System.out.println(abc.volume(v,w));
                break;
                case 3:
                System.out.println("ENTER LENGTH");
                double p=sc.nextDouble();
                System.out.println("ENTER breadth");
                double q=sc.nextDouble();
                System.out.println("ENTER HEIGHT");
                double r=sc.nextDouble();
                System.out.println(abc.volume(p,q,r));
                break;
            }
        }
}














