import java.util.Scanner;
public class ticket
{
        public static void main(String Args[])
        {
            int A=0,Charges;
            Scanner sc=new Scanner(System.in);
            A=sc.nextInt();
            Charges=0;
            if(A>=18)
            {
                    Charges=A*30;
            }
            else if(A>=5 && A<18)
            {
                Charges=A*16;
            }
            else if(A<5)
            {
                Charges=A*0;
            }
            System.out.println("HOURS WORKED="+A);
            System.out.println("TICKET PRICE="+Charges);
        }
}