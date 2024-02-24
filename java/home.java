import java.util.Scanner;
public class home
{
   public static void main(String Args[])
   {
       int x;
       int y;
       int z;
       int a;
       int grt;
       int auto;
       int check;
       int re;
       int buzz;
       System.out.println("What do you want to do?");
       System.out.println("Enter 0 for finding the GREATEST OF THREE NUMBERS,1 for detection of AUTOMORPHIC NUMBER");
       Scanner dev=new Scanner(System.in);
       a=dev.nextInt();
       if(a==0)
       {
           System.out.println("Enter any three numbers ");
           Scanner num1=new Scanner(System.in);
           Scanner num2=new Scanner(System.in);
           Scanner num3=new Scanner(System.in);
           x=num1.nextInt();
           y=num2.nextInt();
           z=num3.nextInt();
           grt=Math.max(x,y);
           if(grt>z)
           {
               System.out.println(grt+" is the greatest");
           }
           else
           {
             System.out.println(z+" is the greatest");  
           }
       }
       else if(a==1)
       {
           System.out.println("Enter any two-digit number ");
           Scanner at=new Scanner(System.in);
           auto=at.nextInt();
           if(auto/10>1)
           {
               check=auto*auto;
               if(check%100==auto)
               {
                   System.out.println(auto+" is an automorphic number");
               }
               else
               {
                   System.out.println(auto+" is not and automorphic number");  
               }
     
           }
           else
           {
               System.out.println("Invalid Entry");
               System.out.println("Please Retry");
               Scanner retry=new Scanner(System.in);
               re=retry.nextInt();
               if(re/10>1)
               {
               check=re*re;
               if(check%100==re)
               {
                   System.out.println(re+" is an automorphic number");
               }
               else
               {
                   System.out.println(re+" is not an automorphic number");  
               }
               }
           }       
    }
System.out.println("----------------------------------------------------------");
}
}

















