import java.util.InputMismatchException;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the size of the array
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Create an array of the specified size
            int[] numbers = new int[size];

            // Prompt the user to enter the elements of the array
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Calculate the sum of the numbers in the array
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            // Calculate the average of the numbers in the array
            double average = (double) sum / size;

            // Print the sum and average
            System.out.println("Sum of the numbers: " + sum);
            System.out.println("Average of the numbers: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input must be an integer.");
        } finally {
            scanner.close();
        }
    }
}
