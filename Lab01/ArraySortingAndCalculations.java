import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingAndCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] myArray = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        // Sort the array using Arrays.sort()
        Arrays.sort(myArray);

        // Calculate the sum and average
        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        double average = (double) sum / n;

        // Print the sorted array, sum, and average
        System.out.println("Sorted array: " + Arrays.toString(myArray));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}