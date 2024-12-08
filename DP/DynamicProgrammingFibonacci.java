public class DynamicProgrammingFibonacci {
// recursion  O(2^n) 
    public static int fibonaccirec(int n ) {
        if(n==0||n==1){
            return n;
        }
        
       return fibonaccirec(n-1)+fibonaccirec(n-2);
        
    }
// memoization O(n) 
    public static int fibonacci(int n, int f[]) {
        if(n==0||n==1){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n] = fibonacci(n-1, f)+fibonacci(n-2, f);
        return f[n];
    }

// tabulation
    public static int fibtabulation(int n){
        int dp[] = new int [n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n+1];
        System.out.println(fibonaccirec(n));
        System.out.println(fibonacci(n, f));
        System.out.println(fibtabulation(n));
    }
}
