import java.util.*;
public class clender
{
    public static void main()
    {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
    }
}