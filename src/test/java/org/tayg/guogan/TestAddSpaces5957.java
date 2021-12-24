package org.tayg.guogan;

import org.junit.jupiter.api.Test;

public class TestAddSpaces5957 {
    AddSpaces5957 solution = new AddSpaces5957();
    
    @Test
    public void addSpaces() {
        String rings1 = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        String res1 = solution.addSpaces(rings1, spaces);
        System.out.println(res1);

        String rings2 = "icodeinpython";
        int[] spaces2 = {1, 5, 7, 9};
        String res2 = solution.addSpaces(rings2, spaces2);
        System.out.println(res2);

        String rings3 = "spacing";
        int[] spaces3 = {0, 1, 2, 3, 4, 5, 6};
        String res3 = solution.addSpaces(rings3, spaces3);
        System.out.println(res3);
    }
}
