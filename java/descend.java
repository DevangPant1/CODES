import java.util.Scanner;
public class descend
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[10];
        System.out.println("Enter values");
        for(int i=0;i<10;i++)
        {
            num[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(num[j]<num[j+1])
                {
                    int tmp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tmp;
                }
            }
        }
        System.out.println("Values");
        for(int i=0;i<10;i++)
        {
            System.out.println(num[i]);
        }
    }
}
