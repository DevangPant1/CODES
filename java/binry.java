import java.util.Scanner;
public class binry
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter list lenght");
        int len=sc.nextInt();
        int lst[]=new int[len];
        System.out.println("Enter list elements");
        for(int i=0;i<len;i++)
        {
            lst[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int n=sc.nextInt();
        int lb=0,up=len-1,mid=0,flag=0;
        while(lb<=up)
        {
            mid=(lb+up)/2;
            if(n==lst[mid])
            {
                flag=1;
                break;
            }
            else if(n<lst[mid])
            {
                up=mid-1;
            }
            else if(n>lst[mid])
            {
                lb=mid+1;
            }
        }
        if(flag==1)
        {
            System.out.println("found at:"+mid);
        }
    }
}