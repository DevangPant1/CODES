//PRINTS SPIRAL ANTI CLOCKWISE LIST
import java.util.Scanner;
public class spiral_anti_clock
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        int ln=sc.nextInt();
        System.out.println("Enter breadth");
        int bd=sc.nextInt();
        int arr[][]=new int[ln][bd];
        int row=0,col=bd;
        int cnt=0;
        while(cnt!=(ln*bd))
        {
            for(int i=row;i<col;i++)
            {
                arr[i][row]=++cnt;
            }
            for(int i=row+1;i<col;i++)
            {
                arr[col-1][i]=++cnt;
            }
            for(int i=col-2;i>=row;i--)
            {
                arr[i][col-1]=++cnt;
            }
            for(int i=col-2;i>=row+1;i--)
            {
                arr[row][i]=++cnt;
            }
            row=row+1;
            col=col-1;
        }
        
        for(int i=0;i<ln;i++)
        {
            for(int j=0;j<bd;j++)
            {
                if(arr[i][j]/10<1)
                {
                    System.out.print("0"+arr[i][j]+" ");
                }
                else
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}