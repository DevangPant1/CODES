/*sorts array*/
import java.util.Scanner;
public class bubble
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("SORTED ARRAY");
        for(int h=0;h<len;h++)
        {
            System.out.println(arr[h]);
        }
    }
}