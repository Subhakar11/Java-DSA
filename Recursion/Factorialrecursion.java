import java.util.*;

public class Factorialrecursion {
     public static int num(int n){
        if(n==1||n==0){ 
        
        return 1;
        }
         return n*num(n-1); 
    }    

  public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int  n = sc.nextInt();
       System.out.println(num(n)); 
    }
}
