import java.util.Scanner;
public class sortb
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array");
        int arr[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int num=(4*4)-4;
        int row=0,col=0;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arr[row][col]>arr[0][j])
                {
                    int tmp=arr[row][col];
                    arr[row][col]=arr[0][j];
                    arr[0][j]=tmp;
                    row=0;
                    col=j;
                }
            }
            for(int k=1;k<4;k++)
            {
                if(arr[row][col]>arr[k][3])
                {
                    int tmp=arr[row][col];
                    arr[row][col]=arr[k][3];
                    arr[k][3]=tmp;
                    row=k;
                    col=3;
                }
            }
            for(int l=3;l>=0;l--)
            {
                if(arr[row][col]>arr[3][l])
                {
                    int tmp=arr[row][col];
                    arr[row][col]=arr[3][l];
                    arr[3][l]=tmp;
                    row=3;
                    col=l;
                }
            }
            for(int m=2;m>=1;m--)
            {
                if(arr[row][col]>arr[m][0])
                {
                    int tmp=arr[row][col];
                    arr[row][col]=arr[m][0];
                    arr[m][0]=tmp;
                    row=m;
                    col=0;
                }
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
