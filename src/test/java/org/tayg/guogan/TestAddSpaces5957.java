package org.tayg.guogan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAddSpaces5957 {
    AddSpaces5957 solution = new AddSpaces5957();
    
    @Test
    public void addSpaces() {
        String rings1 = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        String trueResult1 = "Leetcode Helps Me Learn";
        String res1 = solution.addSpaces(rings1, spaces);
        assertEquals(trueResult1, res1);

        String rings2 = "icodeinpython";
        int[] spaces2 = {1, 5, 7, 9};
        String trueResult2 = "i code in py thon";
        String res2 = solution.addSpaces(rings2, spaces2);
        assertEquals(trueResult2, res2);

        String rings3 = "spacing";
        int[] spaces3 = {0, 1, 2, 3, 4, 5, 6};
        String trueResult3 = " s p a c i n g";
        String res3 = solution.addSpaces(rings3, spaces3);
        assertEquals(trueResult3, res3);
    }
}
