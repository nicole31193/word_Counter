package data_Analyzer;
import java.util.ArrayList;
import java.util.Scanner;

public class DataAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        System.out.println("Enter a sequence of integers (type any non-integer to stop):");

        // Read integers until a non-integer is entered
        while (scanner.hasNextInt()) {
            inputs.add(scanner.nextInt());
        }

        System.out.println("Input complete. Processing results...");
 
        
        // Handle empty input
        if (inputs.isEmpty()) {
            System.out.println("No input provided.");
            return;
        }

        // Initialize tracking variables
        int min = inputs.get(0);
        int max = inputs.get(0);
        int evenCount = 0;
        int oddCount = 0;
        int cumulativeSum = 0;
        ArrayList<Integer> cumulativeTotals = new ArrayList<>();
        ArrayList<Integer> adjacentDuplicates = new ArrayList<>();

        // Process each input number
        for (int i = 0; i < inputs.size(); i++) {
            int current = inputs.get(i);

            // Update min and max
            if (current < min) min = current;
            if (current > max) max = current;

            // Count even and odd numbers
            if (current % 2 == 0) evenCount++;
            else oddCount++;

            // Calculate cumulative totals
            cumulativeSum += current;
            cumulativeTotals.add(cumulativeSum);

            // Detect adjacent duplicates
            if (i > 0 && current == inputs.get(i - 1)) {
                if (!adjacentDuplicates.contains(current)) {
                    adjacentDuplicates.add(current);
                    
                }
            }
        }

        // Output results
        System.out.println("\n--- Analysis Result ---");
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        System.out.print("Cumulative totals: ");
        for (int total : cumulativeTotals) {
            System.out.print(total + " ");
        }

        System.out.print("\nAdjacent duplicates: ");
        for (int dup : adjacentDuplicates) {
            System.out.print(dup + " ");
        }

        scanner.close();
    }
}
