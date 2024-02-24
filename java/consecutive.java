import java.util.Scanner;
public class consecutive
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String line=sc.nextLine();
        int cnt=0;
        for(int i=0;i<line.length()-1;i++)
        {
            if(line.charAt(i)==line.charAt(i+1) && line.charAt(i)!=' ')
            {
                cnt++;
            }
        }
        System.out.println("Number of repeated occurences:"+cnt);
    }
}
