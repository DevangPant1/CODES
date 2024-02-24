import java.util.Scanner;
public class div_11
{   
    public static void main(String args[])
        {
            int num,dig,oddsum=0,evensum=0,i=1;
            System.out.println("ENTER A NUMBER TO CHECK DIVISIBILITY BY 11");
            System.out.println("IT HAS TO BE GREATER THAN 5 DIGITS");
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
            sc.close();
            while(num>=1)
            {
                if(i%2==0)
                {
                    evensum+=num%10;
                }
                else
                {
                    oddsum+=num%10;
                }
                num=num/10;
                i++;
            }
            if(i<=5)
            {
                System.out.println("PLS ENTER NUMBER WHICH HAS GREATER THAN 5 DIGITS");
                System.out.println("---------------------------------------------");
            }
            else
            {
                if((oddsum-evensum)%11==0 || (oddsum-evensum==0))
                {
                    System.out.println("YOUR NUMBER IS DIVISIBLE BY 11");
                    System.out.println("---------------------------------------------");
                }
                else
                {
                    System.out.println("YOUR NUMBER IS NOT DIVISIBLE BY 11");
                    System.out.println("---------------------------------------------");
                }
            }
        }
}