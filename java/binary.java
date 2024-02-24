/*searches for an element in array*/
import java.util.Scanner;
public class binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int len=sc.nextInt();
        int n[]=new int[len];
        int lb=0,up=len-1,mid;
        boolean chk=false;
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<len;i++)
        {
            n[i]=sc.nextInt();
        }
        System.out.println("ENTER NUMBER TO BE SEARCHED");
        int num=sc.nextInt();
        while(lb<=up)
        {
            mid=(up+lb)/2;
            if(n[mid]==num)
            {
                System.out.println("NUMBER FOUND AT "+mid);
                chk=true;
                break;
            }
            else if(n[mid]>num)
            {
                up=mid-1;
            }
            else
            {
                lb=mid+1;
            }
        }
        if(chk==true)
        System.out.println("NUMBER FOUND");
        else
        System.out.println("NUMBER NOT FOUND");
    }
}