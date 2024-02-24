//SADDLE POINT
import java.util.Scanner;
public class saddle_point
{
    public static void main(String args[])
    {
        int ln,bd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        ln=sc.nextInt();
        System.out.println("Enter breadth");
        bd=sc.nextInt();
        int arr[][]=new int[ln][bd];
        for(int i=0;i<ln;i++)
        {
            for(int j=0;j<bd;j++)
            {
                System.out.println("Enter element "+(j+1));
                arr[i][j]=sc.nextInt();
            }
        }
        /*Saddle point is lowest in row and highest in its column*/
        int lowest=0,highest=0;
        int pos1=0,pos2=0;
        for(int i=0;i<ln;i++)
        {
            lowest=arr[i][0];
            for(int j=0;j<bd;j++)
            {
                if(arr[i][j]<lowest)
                {
                    lowest=arr[i][j];
                    pos1=j;
                }
            }
            highest=arr[0][pos1];
            for(int k=0;k<ln;k++)
            {
                if(arr[k][pos1]>highest)
                {
                    highest=arr[k][pos1];
                    pos2=pos1;
                }
            }
            if(highest==lowest )
            {
                System.out.println("Saddle point row "+(i+1)+":"+highest);
            }
        }
    }
}
