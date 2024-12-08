//import java.util.*;
public class dectobin {

    public static int dec_to_bin(int n){
        int bin = 0;
        int pow = 0;
        while(n>0) {
          int rem = n%2;
         bin = bin + rem *(int )Math.pow(10,pow);
         pow++;
         n=n/2;  
        }
        return bin;
     
    }
    public static void main(String arg[]){
       System.out.println(dec_to_bin(7)); ;
    }
}
