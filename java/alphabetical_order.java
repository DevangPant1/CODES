import java.util.Scanner;
public class alphabetical_order
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF WORDS");
        int num=sc.nextInt();
        String n[]=new String[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("ENTER WORDS");
            n[i]=sc.next();
        }
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-1;j++)
            {
                if(n[j].compareTo(n[j+1])>0)
                {
                    String tmp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<num;i++)
        System.out.println(n[i]);
    }
}