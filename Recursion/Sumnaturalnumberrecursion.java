import java.util.Scanner;
public class Sumnaturalnumberrecursion{

    public static int sum(int n){
        if(n==1){
            return 1;
        }
       int fn1 = sum(n-1);
        int fn = n+fn1;
        return fn;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(sum(n));  
    }
}