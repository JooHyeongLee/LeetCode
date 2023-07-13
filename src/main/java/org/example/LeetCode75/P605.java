package org.example.LeetCode75;

import java.util.Arrays;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */
public class P605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i=0; i<flowerbed.length; i++) {
            if(n > 0) {
                if (flowerbed[i] == 0) {
                    // 화단의 길이 1일 때
                    if(flowerbed.length == 1) {
                        flowerbed[i] = 1;
                        n--;
                    }
                    // 왼쪽 끝
                    else if(i == 0) {
                        if(flowerbed[i+1] == 0) {
                            flowerbed[i] = 1;
                            n--;
                            // canPlaceFlowers(flowerbed, n);
                        }
                    }
                    // 오른쪽 끝
                    else if(i == flowerbed.length-1) {
                        if(flowerbed[i-1] == 0) {
                            flowerbed[i] = 1;
                            n--;
                            // canPlaceFlowers(flowerbed, n);
                        }
                    }
                    // 양 끝이 아닐 경우
                    else {
                        if(flowerbed[i-1] == 0 && flowerbed[i+1] ==0) {
                            flowerbed[i] = 1;
                            n--;
                            // canPlaceFlowers(flowerbed, n);
                        }
                    }
                }
            }
        }
        if(n !=0) return false;
        else return true;
    }
    public static void main(String[] args) {
        P605 p = new P605();
        int[] flowerbed = {1,0,0,0,1,0,0};
        int n = 2;
        p.canPlaceFlowers(flowerbed, n);
    }
}
