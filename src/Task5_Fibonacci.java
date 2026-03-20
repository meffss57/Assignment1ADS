import java.util.Scanner;

public class Task5_Fibonacci {

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
        scanner.close();
    }
}
