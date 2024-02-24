import java.util.Scanner;
public class token
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String ln=sc.nextLine();
        Scanner in=new Scanner(ln);
        String word="";
        int cnt=0;
        while(in.hasNext())
        {
            cnt+=1;
        }
        String words[]=new String[cnt];
        int values[]=new int[cnt];
        int count=0;
        int asc=0;
        System.out.println(cnt);
        while(in.hasNext())
        {
            word=in.next();
            words[count]=word;
            for(int i=0;i<word.length();i++)
            {
                asc+=(int)(word.charAt(i));
            }
            values[count]=asc;
            asc=0;
            count+=1;
        }
        for(int i=0;i<cnt;i++)
        {
            for(int j=0;j<(cnt-1);j++)
            {
                if(values[j]<values[j+1])
                {
                    int temp=values[j];
                    String tempstr=words[j];
                    values[j]=values[j+1];
                    words[j]=words[j+1];
                    values[j+1]=temp;
                    words[j+1]=tempstr;
                }
            }
        }
        for(int i=0;i<cnt;i++)
        {
            System.out.print(words[i]+" ");
        }
    }
}
