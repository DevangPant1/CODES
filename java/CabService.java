//class program for car
import java.util.Scanner;
public class CabService
{
    String car_type;
    double km,bill;
    CabService()
    {
        car_type="";
        km=0.0;
        bill=0.0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter car type");
        car_type=sc.next();
        System.out.println("Enter distance travelled");
        km=sc.nextDouble();        
    }
    public void calculate()
    {
        if(km<=5.0)
        {
            if(car_type.equals("AC"))
            bill=150;
            else if(car_type.equals("NON AC"))
            bill=120;
        }
        else if(km>5)
        {
            if(car_type.equals("AC"))
            bill=150+(km-5)*10;
            else if(car_type.equals("NON AC"))
            bill=120+(km-5)*8;
        }
    }
    public void display()
    {
        System.out.println("CAR TYPE:"+car_type);
        System.out.println("KILOMETER TRAVELLED:"+km);
        System.out.println("TOTAL BILL:"+bill);
    }
    public static void main(String args[])
    {
        CabService obj=new CabService();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
