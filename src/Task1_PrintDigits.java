import java.util.Scanner;

public class Task1_PrintDigits {

    public static void printDigits(int n) {
        if (n < 0) {
            n = -n;
        }
        if (n < 10) {
            System.out.println(n);
            return;
        }
        else{
            printDigits(n / 10);
            System.out.println(n % 10);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        printDigits(n);
        scanner.close();
    }
}
