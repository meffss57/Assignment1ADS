import java.util.Scanner;

public class Task2_Average {

    public static int recursiveSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + recursiveSum(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = recursiveSum(arr, 0);
        double average = (double) sum / n;

        if (average == (int) average) {
            System.out.println((int) average + ".0");
        } else {
            System.out.println(average);
        }

        scanner.close();
    }
}
