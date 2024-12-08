import java.util.*;

public class bintodec{

    public static void  bin_to_dec( int n){
         
       int  dec = 0;
       int pow=0;
       while(n>0){
       int  ld  = n%10;
        dec = dec + (ld*(int)Math.pow(2,pow));
        pow++;
        n = n/10;
        
        } 
       System.out.print("Decimal number is:" + dec);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Binary number");
        int bin  = sc.nextInt();
        bin_to_dec(bin);
        


        sc.close();
    }
}