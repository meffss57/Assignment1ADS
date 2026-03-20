import java.util.Scanner;

public class Task7_ReverseOutput {

    static Scanner scanner = new Scanner(System.in);
    public static void readAndPrintReverse(int count) {
        if (count == 0) {
            return;
        }
        int num = scanner.nextInt();
        readAndPrintReverse(count - 1);
        System.out.print(" " + num);
        if (count > 1) {
            System.out.print("");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the count of numbers: ");
        int n = scanner.nextInt();
        System.out.print("Enter " + n + " numbers: ");
        readAndPrintReverse(n);
        System.out.println();
        scanner.close();
    }
}