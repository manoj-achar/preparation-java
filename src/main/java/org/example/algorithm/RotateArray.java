package org.example.algorithm;

import java.util.Arrays;

public class RotateArray {

    static void main() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("Before : "+ Arrays.toString(input));
        rotate(input, k);
        System.out.println("After : "+ Arrays.toString(input));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

    }

    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            end--;
            start++;
        }
    }
}


