import java.util.Scanner;
public class grade
{
        public static void main(String Args[])
        {
            System.out.println("ENTER YOUR MARKS");
            Scanner sc=new Scanner(System.in);
            int p=sc.nextInt();
            System.out.println(p>90?"GRADE A":p>70?"GRADE B":p>50?"GRADE C":"GRADE D");
        }
}
