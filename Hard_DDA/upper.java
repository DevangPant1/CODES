import java.util.Scanner;
public class upper
{
    public int strength(String str)
    {
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum+=(int)str.charAt(i);
        }
        return sum;
    }
    public static void main(String args[])
    {
        upper obj=new upper();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String line=sc.nextLine();
        while(true)
        {
            char ch=line.charAt((line.length())-1);
            if(ch=='.' || ch=='?' || ch=='!')
            {
                break;
            }
            System.out.println("Invalid entry");
            line=sc.nextLine();
        }
        line=line.substring(0,(line.length())-1)+" ";
        int cnt=0;
        int arr[]=new int[10];
        String word[]=new String[10];
        int prev=0,ct=0;
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i)==' ')
            {
                word[ct]=line.substring(prev,i);
                System.out.println(line.substring(prev,i));
                arr[ct]=obj.strength(line.substring(prev,i));
                prev=i+1;
                ct++;
            }
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t1=arr[j];
                    String t2=word[j];
                    arr[j]=arr[j+1];
                    word[j]=word[j+1];
                    arr[j+1]=t1;
                    word[j+1]=t2;
                }
            }
        }
        for(int i=0;i<word.length;i++)
        {
            if(word[i]==null)
            continue;
            System.out.print(word[i]+" ");
        }
    }
    }

