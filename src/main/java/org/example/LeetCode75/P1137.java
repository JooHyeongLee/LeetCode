package org.example.LeetCode75;

public class P1137 {
    public int tribonacci(int n) {
        // Tn+3 = Tn + Tn+1 + Tn+2
        int[] result = new int[n+1];
        for (int i=0; i<=n; i++) {
            if (i == 0) {
                result[i] = i;
            } else if (i >= 1 && i<= 2) {
                result[i] = 1;
            }
            else {
                result[i] = result[i-3] + result[i-2] + result[i-1];
            }
        }
        return result[n];
    }

    public static void main(String[] args) {
        P1137 p = new P1137();
        p.tribonacci(25);
    }
}
