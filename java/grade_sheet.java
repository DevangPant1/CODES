import java.util.Scanner;
public class grade_sheet
{
    public static void main(String Args[])
    {
        System.out.println("Please enter child name for report");
        System.out.println("Please enter English marks first,Computers Second and lastly Math");
        
        int english,math,computer;
        float percentage;
        String name,grade;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        english=sc.nextInt();
        computer=sc.nextInt();
        math=sc.nextInt();
        percentage=((math+computer+english)/3);
        if(percentage<50)
        {
            grade="D";
            System.out.println("Name-"+name);
            System.out.println("English Marks="+english);
            System.out.println("Computer Marks="+computer);
            System.out.println("Mathematics Marks="+math);
            System.out.println("Total Marks="+(english+math+computer));
            System.out.println("Percentage="+percentage);
            System.out.println("Grade="+grade);
            System.out.println("----------------------------------------------");
        }
        else if(50<=percentage)
        {
            if (percentage<60)
            {
                grade="C";
                System.out.println("Name-"+name);
                System.out.println("English Marks="+english);
                System.out.println("Computer Marks="+computer);
                System.out.println("Mathematics Marks="+math);
                System.out.println("Total Marks="+(english+math+computer));
                System.out.println("Percentage="+percentage);
                System.out.println("Grade="+grade);
                System.out.println("----------------------------------------------");
            }
            else if(percentage>=60 && percentage<80)
            {
                grade="B";
                System.out.println("Name-"+name);
                System.out.println("English Marks="+english);
                System.out.println("Computer Marks="+computer);
                System.out.println("Mathematics Marks="+math);
                System.out.println("Total Marks="+(english+math+computer));
                System.out.println("Percentage="+percentage);
               System.out.println("Grade="+grade);
               System.out.println("----------------------------------------------");
            }
            else
            {
                grade="A";
                System.out.println("Name-"+name);
                System.out.println("English Marks="+english);
                System.out.println("Computer Marks="+computer);
                System.out.println("Mathematics Marks="+math);
                System.out.println("Total Marks="+(english+math+computer));
                System.out.println("Percentage="+percentage);
                System.out.println("Grade="+grade);
                System.out.println("----------------------------------------------");
            }
        }
        
    }
}
