import java.util.Scanner;
public class deletion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array");
        int arr[]=new int[50];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter index to delete");
        int del=sc.nextInt();
        for(int i=del;i<5;i++)
        {
            arr[i]=arr[i+1];
        }
        for(int i=0;i<(5);i++)
        {
            System.out.println(arr[i]);
        }
    }
}
