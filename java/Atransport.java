import java.util.Scanner;
public class Atransport
{
    String name;
    int w,charge;
    Atransport()
    {
        name="";
        w=0;
        charge=0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter weight");
        w=sc.nextInt();
    }
    public void calculate()
    {
        if(w<=10)
        charge=25*w;
        else if(w>10 && w<=30)
        charge=(25*10)+(w-10)*20;
        else
        charge=(25*10)+(20*20)+(w-30)*10;
        charge=charge+(int)(0.05*charge);
    }
    public void print()
    {
        System.out.print(name+"  "+w+"  "+charge);
    }
    public static void main(String args[])
    {
        Atransport obj=new Atransport();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}