package word_Counter;

import java.util.Scanner;

public class word_Counter {

    // Finds the position of the next blank character
    public static int nextSpacePosition(String str, int from) {
        while (from < str.length() && str.charAt(from) != ' ') {
            from++;
        }
        return from;
    }

    // Finds the position of the next non-blank character
    public static int nextNonSpacePosition(String str, int from) {
        while (from < str.length() && str.charAt(from) == ' ') {
            from++;
        }
        return from;
    }

    // Counts the number of words in a string
    public static int countWords(String str) {
        int count = 0;
        int index = 0;

        while (index < str.length()) {
            index = nextNonSpacePosition(str, index); // skip spaces
            if (index < str.length()) {
                count++;
                index = nextSpacePosition(str, index); // skip word
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Word count: " + wordCount);

        // Extra tests
        String test1 = "Mary had a little lamb";
        String test2 = "  Lots   of   spaces  here ";
        String test3 = "";

        System.out.println("\nTest Cases:");
        System.out.println("\"" + test1 + "\" -> " + countWords(test1));
        System.out.println("\"" + test2 + "\" -> " + countWords(test2));
        System.out.println("\"" + test3 + "\" -> " + countWords(test3));
    }
}
