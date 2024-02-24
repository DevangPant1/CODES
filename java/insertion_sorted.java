import java.util.Scanner;
public class insertion_sorted
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[50];
       System.out.println("Enter number of elements");
       int len=sc.nextInt();
       System.out.println("Enter sorted array elements");
       for(int i=0;i<len;i++)
       {
           arr[i]=sc.nextInt();
       }
       int element;
       System.out.println("Enter element to insert");
       element=sc.nextInt();
       int pos=0;
       for(int i=0;i<len;i++)
       {
           if(element<=arr[i])
           {
               pos=i;
               break;
           }
       }
       for(int i=len;i>pos;i--)
       {
           arr[i]=arr[i-1];
       }
       arr[pos]=element;
       for(int i=0;i<(len+1);i++)
        {
            System.out.println(arr[i]);
        }
    }
}
