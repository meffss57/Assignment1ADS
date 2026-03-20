import java.util.Scanner;

public class Task3_PrimeCheck {

    public static boolean isPrimeHelper(int n, int divisor) {
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrimeHelper(n, divisor + 1);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        return isPrimeHelper(n, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        scanner.close();
    }
}