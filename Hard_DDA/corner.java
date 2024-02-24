import java.util.Scanner;
public class corner
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int m=sc.nextInt();
        System.out.println("Enter column");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter row "+(i+1)+" elements");
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+",");
            }
        }
        int max1=0,max2=0,min1=0,min2=0,sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]>arr[max1][max2])
                {
                    max1=i;
                    max2=j;
                }
                if(arr[i][j]<arr[min1][min2])
                {
                    min1=i;
                    min2=j;
                }
                if(i==0 && j==0 || i==0 && j==(n-1) || i==m-1 && j==0 || i==m-1 && j==n-1)
                {
                    sum+=arr[i][j];
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
        System.out.println("Highest value:"+arr[max1][max2]);
        System.out.println("Row:"+max1+" Column:"+max2);
        System.out.println("Lowest Value:"+arr[min1][min2]);
        System.out.println("Row:"+min1+" Column:"+min2);
        System.out.println("Sum"+sum);
    }
}

