//performs binary search
import java.util.Scanner;
public class binary_search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER 10 ELEMENT ARRAY");
        int n[]=new int[10];
        for(int i=0;i<=9;i++)
        {
            n[i]=sc.nextInt();
        }
        System.out.println("PLEASE ENTER THE NUMBER TO BE SEARCHED");
        int no=sc.nextInt();
        int lb=0,up=n.length,mid=0;boolean cond=false;
        while (lb<=up)
        {
            mid=(lb+up)/2;
            if(n[mid]<no)
            {
                lb=mid+1;
            }
            else if(n[mid]>no)
            {
                up=mid-1;
            }
            else
            {
                cond=true;
                break;
            }
        }
        if(cond==true)
        {
            System.out.println("NUMBER FOUND AT "+mid);
        }
        else
        {
            System.out.println("NOT FOUND");
        }
    }
}