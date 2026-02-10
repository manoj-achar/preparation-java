package org.example.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexMarking {

    static void main() {
        int[] arr = {1,2,2,3,4,5,1,3};
        List<Integer> duplicateNumbers = getDuplicateNumbers(arr);
        System.out.println("Duplicate numbers : ");
        duplicateNumbers.forEach(System.out::println);
    }

    public static List<Integer> getDuplicateNumbers(int[] input) {
        List<Integer> duplicateNums = new ArrayList<>();
        for(int num : input) {
            int index = Math.abs(num);
            if(input[index] < 0) {
                duplicateNums.add(index);
            } else {
                input[index] = -1 * input[index];
            }
        }
        return duplicateNums;
    }
}
