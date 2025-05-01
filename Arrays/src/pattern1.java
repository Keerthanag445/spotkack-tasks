import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i >= 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}