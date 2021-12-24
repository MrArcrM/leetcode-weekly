package org.tayg.guogan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFirstPalindrome5956 {
    FirstPalindrome5956 solution = new FirstPalindrome5956();

    @Test
    public void testFirstPalindrome() {
        String[] words = {"abc","car","ada","racecar","cool"};
        String trueResult = "ada";
        String res1 = solution.firstPalindrome(words);
        assertEquals(trueResult, res1);
    }
    
}
