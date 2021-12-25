package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFindPalindromeString5956 {
    FindPalindromeString5956 fps = new FindPalindromeString5956();

    @Test
    public void TestFindPalindromeString() {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        String s = fps.firstPalindrome(words);
        String trueResult = "ada";
        assertEquals(s, trueResult);

        String[] words1 = { "notapalindrome", "racecar" };
        String s1 = fps.firstPalindrome(words1);
        String trueResult1 = "racecar";
        assertEquals(s1, trueResult1);

        String[] words2 = { "def", "ghi" };
        String s2 = fps.firstPalindrome(words2);
        String trueResult2 = "";
        assertEquals(s2, trueResult2);

    }

}
