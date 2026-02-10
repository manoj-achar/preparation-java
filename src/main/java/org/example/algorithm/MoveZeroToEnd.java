package org.example.algorithm;

import java.util.Arrays;

public class MoveZeroToEnd {

    static void main() {
        int[] arr = {10,0,20,0,30,0,40,50};
        System.out.println("Before "+ Arrays.toString(arr));
        moveZerosSwap(arr);
        System.out.println("After "+ Arrays.toString(arr));

    }

    public static void moveZerosSwap(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int pointa = 0;
        for(int index = 0; index< nums.length; index++ ) {
            if(nums[index] != 0) {
                if(pointa != index) {
                    int tmp = nums[pointa];
                    nums[pointa] = nums[index];
                    nums[index] = tmp;
                }
                pointa++;
            }
        }
    }

}
