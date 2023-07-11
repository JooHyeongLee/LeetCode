package org.example.LeetCode75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * Example 1 :
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * 최대공약수
 */
public class P1071 {

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length())
            return gcdOfStrings(str2, str1);
        if (!str1.startsWith(str2))
            return "";
        if (str2.isEmpty())
            return str1;
        return gcdOfStrings(str2, mod(str1, str2));
    }

    private String mod(String s1, final String s2) {
        while (s1.startsWith(s2)) {
            s1 = s1.substring(s2.length());
        }
        return s1;
    }

    public static void main(String[] args) {

        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        P1071 p = new P1071();

        String result = p.gcdOfStrings(str1, str2);
    }

}


