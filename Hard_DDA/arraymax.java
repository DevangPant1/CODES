//Calculates max in array
import java.util.Scanner;
public class arraymax
{
    int arr[][];
    int m;
    arraymax(int mm)
    {
        m=mm;
        arr=new int[m][m];
    }
    public void readarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public void large()
    {
        int grt=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]>grt)
                {
                    grt=arr[i][j];
                }
            }
            System.out.println("Row "+(i+1)+" largest:"+grt);
            grt=0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Length");
        int len=sc.nextInt();
        arraymax obj=new arraymax(len);
        obj.readarray();
        obj.large();
    }
}