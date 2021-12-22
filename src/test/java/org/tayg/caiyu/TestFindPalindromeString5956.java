package org.tayg.caiyu;

import org.junit.jupiter.api.Test;

public class TestFindPalindromeString5956 {
    FindPalindromeString5956 fps = new FindPalindromeString5956();

    @Test
    public void TestFindPalindromeString() {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        String s = fps.firstPalindrome(words);
        System.out.println(s);

        String[] words1 = { "notapalindrome", "racecar" };
        String s1 = fps.firstPalindrome(words1);
        System.out.println(s1);

        String[] words2 = { "def", "ghi" };
        String s2 = fps.firstPalindrome(words2);
        System.out.println(s2);

    }

}
