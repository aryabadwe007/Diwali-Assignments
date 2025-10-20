import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Store original number
        int original = n;
        int reversed = 0;

        // Reverse the number
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        // Output
        if (original == reversed) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }

        scanner.close();
    }
}
