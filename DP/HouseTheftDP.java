import java.util.*;
public class HouseTheftDP {
    public static int maxMoney(int[] houses) {
        int n = houses.length;
        
        if (n == 0) return 0;
        if (n == 1) return houses[0];
        if (n == 2) return Math.max(houses[0], houses[1]);
        
        int[] dp = new int[n]; // Dynamic programming array
        
        // Base cases
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);
        
        // Fill up the dp array bottom-up
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(houses[i] + dp[i - 2], dp[i - 1]);
        }
        
        // Return the maximum amount of money that can be stolen
        return dp[n - 1];
    }
    
    public static void main(String[] args) {
       
        int[] houses = {2, 7, 9, 3, 1};
        System.out.println("Maximum amount of money that can be stolen: " +maxMoney(houses));
    }
}
