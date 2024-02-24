import java.util.Scanner;
public class sort2d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of m and n");
        int m=sc.nextInt();
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
        //PRINT INITIal array
        int sort[]=new int[m*n];
        int cnt=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
                sort[cnt++]=arr[i][j];
            }
            System.out.println();
        }
        int tmp=0;
        for(int i=0;i<sort.length;i++)
        {
            for(int j=0;j<sort.length-1;j++)
            {
                if(sort[j]>sort[j+1])
                {
                    tmp=sort[j+1];
                    sort[j+1]=sort[j];
                    sort[j]=tmp;
                }
            }
        }
        int count=0;
        System.out.println("----------------------------------------------");
        System.out.println("Sorted array");
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(sort[count++]+" ");
            }
            System.out.println();
        }
    }
}
