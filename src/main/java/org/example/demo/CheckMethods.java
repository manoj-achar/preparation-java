package org.example.demo;

import java.util.Arrays;

public class CheckMethods {
    static void main() {
        int[] nums = {4, 4, 5, 2, 4,4, 4,5 , 3};
        System.out.println("Majority of "+ Arrays.toString(nums) +" is "+getMajorityNumber(nums));
    }

    public static Integer getMajorityNumber(int[] nums) {
        int element = 0;
        int count = 0;
        int n = nums.length / 2;
        for(int num : nums) {
            if(count == 0) element = num;
            if(element == num) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for(int num : nums) {
            if(num == element) count++;
        }
        if(count > n/2) return element;
        return null;
    }
}
