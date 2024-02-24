//performs bubble sort
import java.util.Scanner;
public class bubblesort

{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        int len=sc.nextInt();
        int lst[]=new int[len];
        for(int i=0;i<len;i++)
        {
            lst[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-1;j++)
                {
                    if(lst[j]>lst[j+1])
                        {
                            int tmp=lst[j+1];
                            lst[j+1]=lst[j];
                            lst[j]=tmp;
                        }
                }
        }
        for(int i=0;i<len;i++)
        {
            System.out.println(lst[i]);
        }
}
}