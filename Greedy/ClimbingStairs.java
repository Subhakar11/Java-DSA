import java.util.*;

public class ClimbingStairs {
    // Recursion TC O(2^n)
    public static int countwaysrec(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countwaysrec(n - 1) + countwaysrec(n - 2);
    }

    // Memoization TC O(n)
    public static int countways(int n, int[] ways) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = countways(n - 1, ways) + countways(n - 2, ways);
        return ways[n];
    }

    // Tabulation TC O(n)
    public static int countwaysTab(int n) {
        int[] tp = new int[n + 1];
        tp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                tp[i] = tp[i - 1];
            } else {
                tp[i] = tp[i - 1] + tp[i - 2];
            }
        }
        return tp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countwaysrec(n));
        System.out.println(countways(n, ways));
        System.out.println(countwaysTab(n));
    }
}
