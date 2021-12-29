package org.tayg.guoqu.week272;

public class FirstPalindrome5956 {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }

        return "";
    }

    private boolean isPalindrome(String word) {
        int p1 = 0;
        int p2 = word.length() - 1;
        while (p1 < p2) {
            if (word.charAt(p1) != word.charAt(p2)) {
                return false;
            }
            p1 += 1;
            p2 -= 1;
        }

        return true;
    }
}
