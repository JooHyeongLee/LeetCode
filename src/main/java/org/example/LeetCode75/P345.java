package org.example.LeetCode75;

import javax.xml.stream.events.Characters;
import java.sql.Array;
import java.util.*;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */
public class P345 {
    public String reverseVowels(String s) {

        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        StringBuilder sbVowels = new StringBuilder();
        StringBuilder result = new StringBuilder();
        List<Character> vowelsList = new ArrayList<>(Arrays.asList(vowels));

        // 1. 문자열에서 모음 추출 (뒤에서부터)
        for(int i = s.length()-1; i >=0; i--) {
            if(vowelsList.contains(s.charAt(i))) {
                sbVowels.append(s.charAt(i));
            }
        }

        // 2. 문자열 재배치
        for(int j=0; j<s.length(); j++) {
            if(!vowelsList.contains(s.charAt(j))) {
                result.append(s.charAt(j));
            } else {
                result.append(sbVowels.charAt(0));
                sbVowels.delete(0, 1);
            }
        }


        return result.toString();
    }

    public static void main(String[] args) {
        P345 p = new P345();
        /**
         * Input: s = "leetcode"
         * Output: "leotcede"
         */
        p.reverseVowels("a.");

    }
}
