import java.util.Scanner;

public class factorial {
     
    public static int fact(int n){
        
         int fact =1;
        
        if(n==0 || n==1){
            return fact;

        }
        
        else {
            
            for( int  i=2; i<=n;i++){
               
                fact = fact*i;
                
            }
            
        }
        return fact;
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in );

        System.out.println("Enter the number for factorial");
        int n = sc.nextInt();
        if(n<0)
{
    System.out.println("Please Enter positive number");
}
     else{
        System.out.println("Factorial of a number is:"+fact(n));
     }

        sc.close();
    }
}
