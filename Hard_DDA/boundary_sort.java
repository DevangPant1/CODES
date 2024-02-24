import java.util.Scanner;
public class boundary_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        int ln=sc.nextInt();
        System.out.println("Enter breadth");
        int bd=sc.nextInt();
        int arr[][]=new int[ln][bd];
        System.out.println("Enter array elements");
        for(int i=0;i<ln;i++)
        {
            for(int j=0;j<bd;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<ln;i++)
        {
            for(int j=0;j<ln;j++)
            {
                
            }
        }
    }
}