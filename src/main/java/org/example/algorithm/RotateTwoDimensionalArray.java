package org.example.algorithm;

public class RotateTwoDimensionalArray {

    public static void rotateMultidimentionalArray(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix.length; j++) {
                if(i != j) {
                    System.out.println("Swapping " + matrix[i][j] + " with " + matrix[j][i]);
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }

            }
        }
        for(int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix[i].length - 1;
            while(left < right) {
                int tmp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = tmp;
                left++;
                right--;
            }
        }
    }

    static void main() {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Before : ");
        printArray(mat);
        rotateMultidimentionalArray(mat);
        System.out.println("After : ");
        printArray(mat);
    }

    static void printArray(int[][] matrix) {
        System.out.println("{");
        for (int[] ints : matrix) {
            System.out.print("{");
            for (int anInt : ints) {
                System.out.print(anInt + ",");
            }
            System.out.println("}");
        }
        System.out.println("}");
    }
}
