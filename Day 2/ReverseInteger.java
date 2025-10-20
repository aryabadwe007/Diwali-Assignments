import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int original = n;
        int reversed = 0;

        // Work with absolute value
        int num = Math.abs(n);

        // Reverse logic
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // If original number was negative, make result negative
        if (original < 0) {
            reversed = -reversed;
        }

        // Output
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
