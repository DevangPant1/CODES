import java.util.Scanner;
public class alpha
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numberr of elements");
        int n=sc.nextInt();
        String al[]=new String[n];
        for(int j=0;j<n;j++)
        {
            System.out.println("Enter element");
            al[j]=sc.next();
        }
        for(int i=0;i<n-1;i++)
        {
            if(al[i].compareTo(al[i+1])>0)
            {
                String temp=al[i+1];
                al[i+1]=al[i];
                al[i]=temp;
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.println(al[k]);
        }
    }
}
