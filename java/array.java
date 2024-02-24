/*stores student credentials*/
import java.util.Scanner;
public class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF STUDENTS");
        int num=sc.nextInt();
        String name[]=new String[num];
        int roll[]=new int[num];
        int mark1[]=new int[num];
        int mark2[]=new int[num];
        int mark3[]=new int[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("ENTER NAME");
            name[i]=sc.next();
            System.out.println("ENTER ROLL NUMBER");
            roll[i]=sc.nextInt();
            System.out.println("ENTER ENGLISH MARKS");
            mark1[i]=sc.nextInt();
            System.out.println("ENTER MATH MARKS");
            mark2[i]=sc.nextInt();
            System.out.println("ENTER SCIENCE MARKS");
            mark3[i]=sc.nextInt();
        }
        double avg[]=new double[num];
        for(int i=0;i<num;i++)
        {
            avg[i]=((mark1[i]+mark2[i]+mark3[i])/3);
        }
        String remarks[]=new String[num];
        for(int h=0;h<num;h++)
        {
            if(avg[h]<40)
            {
                remarks[h]="Poor";
            }
            else if(avg[h]>=40 && avg[h]<=59)
            {
                remarks[h]="Pass";
            }
            else if(avg[h]>=60 && avg[h]<=74)
            {
                remarks[h]="First Class";
            }
            else if(avg[h]>=75 && avg[h]<=84)
            {
                remarks[h]="Distinction";
            }
            else if(avg[h]>=85 && avg[h]<=100)
            {
                remarks[h]="Excellent";
            }
        }
        for(int k=0;k<num;k++)
            {
                System.out.println("NAME:"+name[k]);
                System.out.println("ROLL:"+roll[k]);
                System.out.println("ENGLISH:"+mark1[k]);
                System.out.println("MATH:"+mark2[k]);
                System.out.println("SCIENCE:"+mark3[k]);
                System.out.println("AVERAGE:"+avg[k]);
                System.out.println("REMARK:"+remarks[k]);
                System.out.println("-------------------------------------------");
            }
    }
}






