import java.util.Scanner;
public class fine
{
    public static void main(String Args[])
    {
        int day,fine;
            System.out.println("Enter number of days person did not return book");
        Scanner sc=new Scanner(System.in);
        day=sc.nextInt();
        if(day<=5)
        {
            fine=(day)*3;
            System.out.println("You did not return the book for "+day+" days");
            System.out.println("Fine="+fine+" rupees");
            System.out.println("---------------------------------------------------");
        }
        else if(day>5)
        {
            if(day<=10)
            {
                fine=(day)*5;
                System.out.println("You did not return the book for "+day+" days");
                System.out.println("Fine="+fine+" rupees");
                System.out.println("---------------------------------------------------");
            }
            else if(day>10)
            {
                if(day<=15)
                {
                    fine=(day)*7;
                    System.out.println("You did not return the book for "+day+" days");
                    System.out.println("Fine="+fine+" rupees");
                    System.out.println("---------------------------------------------------");
                }
                else
                {
                    fine=(day)*9;
                    System.out.println("You did not return the book for "+day+" days");
                    System.out.println("Fine="+fine+" rupees");
                    System.out.println("---------------------------------------------------");
                    
                }
            }
        }
        
    }
}
