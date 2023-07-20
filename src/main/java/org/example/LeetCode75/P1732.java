package org.example.LeetCode75;

public class P1732 {
    /**
     * Input: gain = [-5,1,5,0,-7]
     * Output: 1
     * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
     */
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        int max = 0;

        for(int i=0; i<arr.length; i++) {
            if(i == 0) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i-1] + gain[i-1];
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    /**
     * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
     *
     * You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
     */
    public static void main(String[] args) {
        P1732 p = new P1732();
        int[] gain = {-5,1,5,0,-7};
        p.largestAltitude(gain);
    }
}
