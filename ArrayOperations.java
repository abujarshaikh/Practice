import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] array2 = { { 7, 8, 9 }, { 10, 11, 12 } };

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Addition of Arrays");
            System.out.println("2. Multiplication of Arrays");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performArrayAddition(array1, array2);
                    break;
                case 2:
                    performArrayMultiplication(array1, array2);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void performArrayAddition(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            System.out.println("Array dimensions must be the same for addition.");
            return;
        }

        int numRows = arr1.length;
        int numCols = arr1[0].length;

        int[][] result = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Result of addition:");
        printArray(result);
    }

    public static void performArrayMultiplication(int[][] arr1, int[][] arr2) {
        if (arr1[0].length != arr2.length) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int numRows = arr1.length;
        int numCols = arr2[0].length;
        int commonDimension = arr1[0].length;

        int[][] result = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                for (int k = 0; k < commonDimension; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Result of multiplication:");
        printArray(result);
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
