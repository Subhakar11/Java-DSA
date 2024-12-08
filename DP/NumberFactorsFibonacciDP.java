import java.util.Arrays;

public class NumberFactorsFibonacciDP {
    
    // Function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
    
    // Function to count the number of factors of a number
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count++;
                } 
                  else {
                    count += 2;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int n = 7; // Change n to find factors of a different Fibonacci number
        int fibN = fibonacci(n);
        int factors = countFactors(fibN);
        
        System.out.println("The " + n + "th Fibonacci number is: " + fibN);
        System.out.println("Number of factors: " + factors);
    }
}
