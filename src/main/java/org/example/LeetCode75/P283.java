package org.example.LeetCode75;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 */
public class P283 {
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                for(int j=i+1; j<nums.length; j++) {
                    if(nums[j] > 0) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    }
                }
            }
        }
        /**
         * 0, 1, 0, 3, 12
         * 1, 0, 0, 3, 12
         *
         */

        for(int j=0; j<nums.length; j++) {
            System.out.print(nums[j] + ",");
        }
    }

    public static void main(String[] args) {
        P283 p = new P283();
        int[] nums = {0, 1, 0, 3, 12};
        // 1,3,12,0,0
        p.moveZeroes(nums);
    }
}
