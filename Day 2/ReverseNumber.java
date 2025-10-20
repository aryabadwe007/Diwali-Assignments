import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int reversed = 0;

        // Reverse the number
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        // Output
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
