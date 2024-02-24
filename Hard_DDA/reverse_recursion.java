import java.util.Scanner;
public class reverse_recursion
{
    String val="";
    reverse_recursion()
    {
        String val="";
    }
    public int reverse(int n)
    {
        if(n<1)
        {
            return n;
        }
        else
        {
            val=val+(n%10);
            return reverse(n/=10);
        }
    }
    public static void main(String args[])
    {
        reverse_recursion obj=new reverse_recursion();
        obj.val=obj.val+obj.reverse(312);
        System.out.println(obj.val);
    }
}