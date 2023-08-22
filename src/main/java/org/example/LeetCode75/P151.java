package org.example.LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class P151 {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        Stack<String> processWords = new Stack<>();
        String result = "";
        words = Arrays.stream(s.split(" ")).toList();

        for (int i=0; i<words.size(); i++) {
            if (!words.get(i).isBlank()) {
                processWords.push(words.get(i).trim());
            }
        }

        while (processWords.size() > 0) {
            result += processWords.pop() + " ";
        }
        return result.substring(0, result.length()-1);
    }

    public static void main(String[] args) {
        P151 p = new P151();
        p.reverseWords("the sky is blue");
        p.reverseWords("  hello world  ");
        p.reverseWords("a good   example");
    }
}
