import java.util.*;

public class starpattern{
    public static void main( String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many iration to be perform");
        int  input = sc.nextInt();
        for(int i=input;i>=1;i--)
        {
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
               
            } 
            System.out.println( " ");
        }
   sc.close();
}
}