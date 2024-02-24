import java.util.Scanner;
public class check
{
    public static void main(String args[])
    {
        Integer obj=new Integer(8);
        Integer obj2=new Integer(9);
        System.out.println(obj==8);
        System.out.println(obj==obj2);
        System.out.println(obj*obj2);
        System.out.println(obj+obj2);
        int val=obj;
        int val1=obj2;
        int b=obj+obj2;
        System.out.println(val);
        System.out.println(val1);
        System.out.println(b);
    }
}