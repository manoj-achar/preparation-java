package org.example.algorithm;

public class SumOfDiagnoalElements {

    public static void printSumOfDiagnoalElements(int[][] matrix) {
        int rightDiagnoalSum = 0;
        int leftDiagnoalSum = 0;

        for(int i = 0; i<matrix.length; i++) {
            leftDiagnoalSum += matrix[i][i];
            rightDiagnoalSum += matrix[i][matrix.length-1 - i];
        }
        System.out.println("Right diagonal sum = "+rightDiagnoalSum);
        System.out.println("Left diagonal sum = "+leftDiagnoalSum);
    }

    static void main() {
        int[][] mat = {
                {2, 2, 3},
                {4, 5, 6},
                {10, 8, 9}
        };
        printSumOfDiagnoalElements(mat);
    }
}
