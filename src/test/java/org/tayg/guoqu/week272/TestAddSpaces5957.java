package org.tayg.guoqu.week272;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAddSpaces5957 {
    AddSpaces5957 solution = new AddSpaces5957();

    @Test
    public void testAddSpaces() {
        String s1 = "LeetcodeHelpsMeLearn";
        int[] spaces1 = { 8, 13, 15 };
        String trueRes1 = "Leetcode Helps Me Learn";
        String res1 = solution.addSpaces(s1, spaces1);
        assertEquals(res1, trueRes1);

        String s2 = "icodeinpython";
        int[] spaces2 = { 1, 5, 7, 9 };
        String trueRes2 = "i code in py thon";
        String res2 = solution.addSpaces(s2, spaces2);
        assertEquals(res2, trueRes2);

        String s3 = "spacing";
        int[] spaces3 = { 0, 1, 2, 3, 4, 5, 6 };
        String trueRes3 = " s p a c i n g";
        String res3 = solution.addSpaces(s3, spaces3);
        assertEquals(res3, trueRes3);

    }

}
