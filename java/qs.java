public class qs
{
    public int fc()
    {
        char a='a';
        char b='c';
        return a+b;
    }
    public static void main()
    {
        p=fc();  //the function declared above
        if(p%10<=10)
        {
            System.out.println("ANSWER IS GOOD");
        }
        else
        {
            System.out.println("ANSWER IS BAD");
        }
    }
}
