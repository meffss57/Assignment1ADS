import java.util.Scanner;

public class Task8_CheckDigits {

    public static boolean onlyDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        else{
            return onlyDigits(s, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.next();

        if (onlyDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}