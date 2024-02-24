
import java.util.Scanner;
public class BGRVG
{
    public static void main(){
        
        outer: for(int i =0; i < 4 ; i++) {
            for(int j = 0 ; j < 4 ; j++) {
                if(j>i){
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i*j));
}
}
}
}

