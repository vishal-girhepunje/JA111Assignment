package YouActivity1;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of matrix (N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;

        // Calculate the sums of the diagonals
        for (int i = 0; i < n; i++) {
            sumDiagonal1 += matrix[i][i];           
            					// First diagonal (top-left to bottom-right)
            sumDiagonal2 += matrix[i][n - 1 - i];  
            					// Second diagonal (top-right to bottom-left)
        }

        // Calculate the absolute difference between the sums
        int difference = Math.abs(sumDiagonal1 - sumDiagonal2);

        System.out.println("The difference of sum of diagonal is " + difference);

        scanner.close();
    }
	/*
	 * Sample Input
Enter Size of matrix: 4
Enter elements of matrix:
1 2 3 4
5 6 3 1
7 1 2 3
5 8 4 6

Sample Output
The difference of sum of diagonal is 2

Explanation
The addition of elements of first diagonal is 1 + 6 + 2 + 6 = 15
The addition of elements of second diagonal is 5 + 1 + 3 + 4 = 13
The difference of 15 – 13 is 2
	 */
}
