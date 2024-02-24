import java.util.Scanner;
public class transpose
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4X4 array");
        int arr[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Array");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int copy[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                copy[i][j]=arr[j][i];
            }
        }
        System.out.println("Sorted array");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(copy[i][j]+" ");
            }
            System.out.println();
        }
    }
}
