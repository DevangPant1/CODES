import java.util.Scanner;
public class tens
{
    public static void main(String args[])
    {
        int i,num,tenth=0,thou=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        num=sc.nextInt();
        i=1;
        while(num>=1)
        {
            if(i==2)
            {
                tenth=(num%10)*10;
                num/=10;
            }
            else if(i==4)
            {
                thou=(num%10)*1000;
                num/=10;
            }
            else
            {
                num/=10;
            }
            i++;
        }
        switch(i)
            {
                case 1:
                System.out.println("NUMBER NOT LONG ENOUGH");
                break;
                case 2:
                System.out.println("TENTH VALUE:"+tenth);
                break;
                case 3:
                System.out.println("TENTH VALUE:"+tenth);
                break;
                case 4:
                System.out.println("TENTH VALUE:"+tenth);
                System.out.println("THOUSANTH VALUE:"+thou);
                break;
                default:
                System.out.println("TENTH VALUE:"+tenth);
                System.out.println("THOUSANTH VALUE:"+thou);
                break;
            }
    }
}
