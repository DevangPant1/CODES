import java.util.Scanner;
public class bill
{
    public static void main(String Args[])
    {
        int units;
        int cost;
        System.out.println("Please enter number of units");
        Scanner sc=new Scanner(System.in);
        units=sc.nextInt();
        if(units<=100)
        {
            cost=units*4;
            cost=cost+((2/100)*cost);
            System.out.println("Your bill for "+units+" units is "+cost+" Rupees");
        }
        else if(100<units)
        {
            if(units<=200)
            {
                cost=units*5;
                cost=cost+((2/100)*cost);
                System.out.println("Your bill for "+units+" units is "+cost+" Rupees");
            }
            else if(200<units)
            {
                if(units<=400)
                {
                   cost=units*6;
                   cost=cost+((2/100)*cost);
                   System.out.println("Your bill for "+units+" units is "+cost+" Rupees"); 
                }
                else if(units>400)
                {
                   cost=units*7;
                   cost=cost+((2/100)*cost);
                   System.out.println("Your bill for "+units+" units is "+cost+" Rupees");
                }
            }
        }
    }
}
