import java.util.Scanner;
public class checkprint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter marks");
            marks[i]=sc.nextInt();
        }
        int nineteen=0,thirty=0,fifty=0,seventy=0,hundo=0;
        for(int i=0;i<n;i++)
        {
            if(marks[i]<=19)
            nineteen++;
            else if(marks[i]>=20 && marks[i]<=39)
            thirty++;
            else if(marks[i]>=40 && marks[i]<=59)
            fifty++;
            else if(marks[i]>=60 && marks[i]<=79)
            seventy++;
            else
            hundo++;
        }
        System.out.println("0-19:"+nineteen);
        System.out.println("20-39:"+thirty);
        System.out.println("40-59:"+fifty);
        System.out.println("60-79:"+seventy);
        System.out.println("80-100:"+hundo);
    }
}