import java.util.Scanner;
public class biggest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SENTENCE");
        String st=sc.nextLine();
        st=st+" ";
        int prev=0,max=0;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)==' ')
            {
                String sub=st.substring(prev,i);
                prev=i+1;
                if(max<sub.length())
                max=sub.length();
            }            
        }
        System.out.println(max);
    }
}
