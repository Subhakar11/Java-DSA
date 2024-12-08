import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> backtrack(String current, int open, int close, int max) {
        List<String> result = new ArrayList<>();
        // Base case: if the length of the current string is equal to 2 * max
        if (current.length() == 2 * max) {
            result.add(current);
            return result;
        }

        // Add an opening parenthesis if there are still openings available
        if (open < max) {
            result.addAll(backtrack(current + "(", open + 1, close, max));
        }

        // Add a closing parenthesis if there are more openings than closings
        if (close < open) {
            result.addAll(backtrack(current + ")", open, close + 1, max));
        }
        return result;
    }

    public static void main(String[] args) {
        int max = 3;
        List<String> result = backtrack("", 0, 0, max);
        System.out.println(result);
    }
}
