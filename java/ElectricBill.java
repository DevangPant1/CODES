import java.util.Scanner;
public class ElectricBill
{
    String n;
    int units;
    double bill;
    ElectricBill(String v,int u,double b)
    {
        n=v;
        units=u;
        bill=b;
    }
    public void accept()
    {
        int un,bl;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NAME");
        name=sc.nextLine();
        System.out.println("ENTER NUMBER OF CONSUMED UNITS");
        un=sc.nextInt();
        ElectricBill obj=new ElectricBill(name,un,1);
    }
    public  void calculate()
    {
        accept();
        System.out.println(obj.n());
        
    }
}
