package main1;

import java.util.Arrays;
import java.util.Scanner;

public class CodeReuse {

    
    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

   
    public static double[] calculateStatistics(int[] arr) {
        double[] result = new double[4];

      
        Arrays.sort(arr);

        // Median
        result[0] = arr.length % 2 == 0 ?
                (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0 :
                arr[arr.length / 2];

        // Variance
        double mean = Arrays.stream(arr).average().orElse(0);
        result[1] = Arrays.stream(arr).mapToDouble(x -> Math.pow(x - mean, 2)).sum() / arr.length;

        // Standard Deviation
        result[2] = Math.sqrt(result[1]);

        // Sum of Squares
        result[3] = Arrays.stream(arr).mapToDouble(x -> Math.pow(x, 2)).sum();

        return result;
    }

    // Q3: Matrix Multiplication
    public static int[][] matrixMultiplication(int[][] matrixA, int[][] matrixB, int rowsA, int columnsA, int columnsB) {
        int[][] result = new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }
}
