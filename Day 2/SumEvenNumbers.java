import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Sum of first n even numbers: 2 + 4 + 6 + ... + 2n = n * (n + 1)
        int sum = n * (n + 1);

        // Output
        System.out.println("Sum of first " + n + " even numbers is: " + sum);

        scanner.close();
    }
}
