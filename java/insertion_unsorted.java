import java.util.Scanner;
public class insertion_unsorted
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[50];
        int len=0;
        System.out.println("Enter arr number of elements");
        len=sc.nextInt();
        System.out.println("Enter array element");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        int pos;
        System.out.println("Enter position of element");
        pos=sc.nextInt();
        System.out.println("Enter element");
        int element=sc.nextInt();
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
