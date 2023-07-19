package org.example.LeetCode75;

public class P392 {
    public boolean isSubsequence(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<t.length(); i++) {
            if(sb.length() > 0 && t.charAt(i) == sb.charAt(0)) {
                sb.delete(0, 1);
            }
        }
        if(sb.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        P392 p = new P392();
        p.isSubsequence("abc", "ahbgdc");
    }
}
