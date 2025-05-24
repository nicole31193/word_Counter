package arraysArrayList;

import java.util.ArrayList;

/**
 * This program demonstrates the differences between arrays and ArrayLists in Java.
 * It uses concepts from Chapters 1–6 of Big Java by Cay Horstmann.
 */
public class ArraysArrayList {
    
    public static void main(String[] args) {
        final int ARRAY_SIZE = 3; // Chapter 3: using constants

        // Demonstrating static arrays
        int[] numberArray = new int[ARRAY_SIZE];
        numberArray[0] = 10;
        numberArray[1] = 20;
        numberArray[2] = 30;

        System.out.println("Array values:");
        printIntArray(numberArray);

        // Demonstrating dynamic ArrayLists
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40); // ArrayList grows dynamically

        System.out.println("\nArrayList values:");
        printIntList(numberList);

        // Remove an element (Chapter 5: method call and logic)
        numberList.remove(2); // removes value 30 at index 2

        System.out.println("\nArrayList after removing index 2:");
        printIntList(numberList);
    }

    /**
     * Prints all elements in an integer array.
     * @param array The array to print
     */
    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) { // Chapter 4: loop and indexing
            System.out.println(array[i]);
        }
    }

    /**
     * Prints all elements in an ArrayList of integers.
     * @param list The list to print
     */
    public static void printIntList(ArrayList<Integer> list) {
        for (int number : list) { // Chapter 4: for-each loop
            System.out.println(number);
        }
    }
}
