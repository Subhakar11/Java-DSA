import java.util.*;

public class halfpyramidpattern {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many iteration to be perform");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
