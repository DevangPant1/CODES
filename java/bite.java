public class bite
{
    public static void main(String args[])
    {
        int a=10,b=5,z=10;
        z+=a++ + --b+ ++a + --b;
        System.out.println(z);
        int cnt=1;
        do
        {
            System.out.println("counter");
        }while(cnt++<5);
    }
}
