package main1;

import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        
        System.out.println("The Array Before sorting "+Arrays.toString(arr));      
        CodeReuse.sortDescending(arr);
        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(arr));

        
        int[] myArray = {3, 1, 4, 1, 5, 9, 2, 6, 5};
       
        double[] result = CodeReuse.calculateStatistics(myArray);
        System.out.println("Statistics: " + Arrays.toString(result));

        
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};
        int[][] multiplicationResult = CodeReuse.matrixMultiplication(matrixA, matrixB, 2, 3, 2);
        System.out.println("Matrix Multiplication Result: " + Arrays.deepToString(multiplicationResult));
    }
}
