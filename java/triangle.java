import java.util.Scanner;
public class triangle
{
    public static void main(String Args[])
    {
        double side1,side2,side3;
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER LENGTH OF FIRST SIDE");
        side1=sc.nextDouble();
        System.out.println("PLEASE ENTER LENGTH OF SECOND SIDE");
        side2=sc.nextDouble();
        System.out.println("PLEASE ENTER LENGTH OF THIRD SIDE");
        side3=sc.nextDouble();
        ch=0;
        if(side1==side2 && side2==side3)
        {
            ch=1;
        }
        else if(side1==side2 || side2==side3)
        {
            ch=2;
        }
        else if(side3==side1)
        {
            ch=2;
        }
        else if(side1!=side2 && side2!=side3)
        {
            ch=3;
        }
        switch(ch)
        {
            case 1:
            System.out.println("TRIANGLE IS EQUILATERAL");
            break;
            case 2:
            System.out.println("TRIANGLE IS ISOCELES");
            break;
            case 3:
            System.out.println("TRIANGLE IS SCALENE");
            break;
            default:
            System.out.println("ERROR");
            break;
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
