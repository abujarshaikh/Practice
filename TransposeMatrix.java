import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int m, n, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Rows: ");
        m = sc.nextInt();
        System.out.print("Enter The Number Of Columns: ");
        n = sc.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter the Elements of the Matrix");

        // Input matrix elements
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                matrix[c][d] = sc.nextInt();
            }
        }

        int Transpose[][] = new int[n][m];

        // Transpose the matrix
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                Transpose[d][c] = matrix[c][d];
            }
        }

        System.out.println("Transpose of Matrix");

        // Display the transposed matrix
        for (c = 0; c < n; c++) {
            for (d = 0; d < m; d++) {
                System.out.print(Transpose[c][d] + "\t");
            }
            System.out.println(); // Move this line outside the inner loop
        }

        sc.close(); // Close the Scanner
    }
}
