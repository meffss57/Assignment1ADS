import java.util.Scanner;

public class Task6_Power {

    public static long power(long a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base (a) and exponent (n): ");
        long a = scanner.nextLong();
        int n = scanner.nextInt();

        System.out.println(power(a, n));
        scanner.close();
    }
}