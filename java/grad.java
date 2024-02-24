//searches grad year
import java.util.Scanner;
public class grad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of years");
        int num=sc.nextInt();
        int yr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            yr[i]=sc.nextInt();
        }
        System.out.println("Enter year to be searched");
        int src=sc.nextInt();
        int mid,up,lb;
        up=num;
        lb=0;
        while(lb<=up)
        {
            mid=(up+lb)/2;
            if(yr[mid]==src)
            {
                System.out.println("Detected");
                break;
            }
            else if(yr[mid]>src)
            {
                up=mid-1;
            }
            else
            {
                lb=mid+1;
            }
        }
    }
}
