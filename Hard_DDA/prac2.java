import java.util.Scanner;
public class prac2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int m=sc.nextInt();
        int n=sc.nextInt();
        char arr[][]=new char[m][n];
        System.out.println("Enter corner fill");
        char ch1=sc.next().charAt(0);
        System.out.println("Enter boundary fill");
        char ch2=sc.next().charAt(0);
        System.out.println("Enter mid fill");
        char ch3=sc.next().charAt(0);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||i==m-1||j==0||j==n-1)
                {
                    if( i==0 && j==0|| i==0 && j==n-1 || i==m-1 && j==0 || i==m-1 && j==n-1)
                    {
                        arr[i][j]=ch1;
                    }
                    else
                    {
                        arr[i][j]=ch2;
                    }
                }
                else
                {
                    arr[i][j]=ch3;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}