package org.example.algorithm;

import java.util.Arrays;

public class MaxSubArray {

    static void main() {
        int[] inputCase1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = maxSubarray(inputCase1);
        System.out.println("Example 1: Input: " + Arrays.toString(inputCase1) + "\nResult: " + result1);
    }

    public static int maxSubarray(int[] nums) {
        if(nums.length == 0) return 0;
        int maxValue = nums[0];
        int temp = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if(num > num + temp) {
                temp = num;
            } else {
                temp += num;
            }
            maxValue = Math.max(maxValue, temp);
        }

        return maxValue;
    }
}
