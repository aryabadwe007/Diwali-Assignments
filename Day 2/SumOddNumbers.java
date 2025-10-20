import java.util.Scanner;

public class SumOddNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the Number : ");
		int n = scanner.nextInt();
		
		int sum = n * n;
		
		System.out.println("Sum of first " + n + " odd numbers is: " + sum);
		
		scanner.close();

	}

}
