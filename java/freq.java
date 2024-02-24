import java.util.Scanner;
public class freq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String word=sc.next();
        int freq=0;
        char ch;
        for(int i=(int)'a';i<=(int)'z';i++)
        {
            ch=(char)i; 
            for(int j=0;j<word.length();j++)
            {
                if(ch==word.charAt(j))
                {
                    freq++;
                }
            }
            if(freq>0)
            {
                System.out.println(ch+"="+freq);
            }
            freq=0;
        }
    }
}