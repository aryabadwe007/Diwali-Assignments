import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int original = number;
        int sum = 0;

        // Count the number of digits
        int digits = String.valueOf(number).length();

        // Calculate sum of each digit raised to the power of number of digits
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        // Output
        if (sum == original) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("Not an Armstrong number.");
        }

        scanner.close();
    }
}
