import java.util.Scanner;

public class charpattern {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter How many charactor to be perform");
        int input = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
                }
            System.out.println(" ");
        }

        sc.close();
    }
}
