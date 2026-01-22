package org.studyeasy;

/**
 * ArrayDataAnalysis
 * Demonstrates array operations and basic data analysis in Java
 */
public class Main {

    public static void main(String[] args) {

        // -------------------------------
        // Single-Dimensional Array
        // -------------------------------
        int[] data = {45, 78, 12, 89, 34, 67};

        System.out.println("=== Single-Dimensional Array Data ===");
        printArray(data);

        // Basic analysis
        int sum = calculateSum(data);
        double average = calculateAverage(data);
        int max = findMax(data);
        int min = findMin(data);

        // Display formatted results
        System.out.printf("\nSum: %d\n", sum);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %d\n", max);
        System.out.printf("Minimum: %d\n", min);

        // Manual sorting
        sortArray(data);
        System.out.println("\nSorted Array (Ascending):");
        printArray(data);

        // -------------------------------
        // Multi-Dimensional Array
        // -------------------------------
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n=== Multi-Dimensional Array ===");
        printMatrix(matrix);

        // -------------------------------
        // Exception Handling Demo
        // -------------------------------
        try {
            System.out.println("\nAccessing invalid index:");
            System.out.println(data[10]); // Will cause exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
    }

    /**
     * Prints elements of a single-dimensional array
     */
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Calculates sum of array elements
     */
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    /**
     * Calculates average of array elements
     */
    public static double calculateAverage(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

    /**
     * Finds maximum value in array
     */
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Finds minimum value in array
     */
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**
     * Sorts array using Bubble Sort (Manual sorting)
     */
    public static void sortArray(int[] arr) {
        int n = arr.length;

        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap values
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Prints a 2D array (matrix)
     */
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
