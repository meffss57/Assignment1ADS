import java.util.Scanner;

public class Task9_CountChars {

    public static int countChars(String s, int index) {
        if (index == s.length()) {
            return 0;
        }
        else{
            return 1 + countChars(s, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.next();

        System.out.println(countChars(s, 0));
        scanner.close();
    }
}